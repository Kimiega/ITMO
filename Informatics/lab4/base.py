def parse(source_text):
    it = 0

    def getNextTag():
        nonlocal source_text
        nonlocal it
        while source_text[it]!='<':
            it+=1
        tag = ""
        it+=1
        while source_text[it]!='>':
            tag+=source_text[it]
            it+=1
        it+=1
        return tag 

    def getTagText(len_tag):
        nonlocal source_text
        nonlocal it
        i = it-3-len_tag
        text = ""
        while source_text[i]!=">":
            text+=source_text[i]
            i-=1
        return text[::-1]

    def tagParse(tag): 
        nonlocal source_text
        nonlocal it
        list_tags = []
        while True:
            nextTag = getNextTag()

            if len(list_tags)==0 and nextTag=='/'+tag:
                return [getTagText(len(nextTag))]
            elif nextTag == '/'+tag:
                break
            else:
                list_tags.append({nextTag : tagParse(nextTag)})
        return list_tags

  
    if "<?" in source_text:
        while source_text[it:it+2]!="<?":
            it+=1
        #Can get encoding
        while source_text[it:it+2]!='?>':
            it+=1
        it+=2

    root_tag = getNextTag()
    
    parsed ={root_tag: tagParse(root_tag)}
    return parsed

def convert(parsed):
    
    def deparse(x, indents):
        nonlocal converted_text
        for dictX in x:
            if isinstance(dictX,str):
                    converted_text = converted_text[:-1] + " " + dictX + "\n"            
            else:
                for tagX in dictX:
                        converted_text += " " * indents + tagX + ":\n"
                        deparse(dictX[tagX],indents+2)

    converted_text = "---\n"
    root_tag = ""
    for i in parsed:
        root_tag = i
    converted_text += root_tag+":\n"
    deparse(parsed[root_tag],2)
    return converted_text


def main():
    source_file_xml = open("shedule.xml",'r')
    source_text = source_file_xml.read()
    source_file_xml.close()
    parsed = parse(source_text)
    converted_text = convert(parsed)
    converted_file_yaml = open("shedule.yaml",'w')
    converted_file_yaml.write(converted_text)
    converted_file_yaml.close()

if __name__ == '__main__':
    main()
