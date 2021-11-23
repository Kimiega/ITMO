import re
def parse(source_text):
    it = 0
    def tagParse(tag):
        nonlocal it
        nonlocal x
        nonlocal source_text
        list_tags = []
        while True:
            it+=1
            nextTag = x[it][1:-1]
            if len(list_tags)==0 and nextTag=='/'+tag:
                pattern = re.compile('<'+tag+'>[^>]*</'+tag+'>')
                retTag = pattern.findall(source_text)[0]
                startT = pattern.search(source_text).span()[0]
                endT = pattern.search(source_text).span()[1]
                source_text = source_text[:startT]+source_text[endT:]
                text = retTag[len(tag)+2:-(len(tag)+3)]
                return [text]
            elif nextTag == '/'+tag:
                break
            else:
                list_tags.append({nextTag : tagParse(nextTag)})
        return list_tags        
    
        
    x = re.findall(r'<[^>]*>',source_text)

    if x[0][:2]=="<?":
        x.pop(0)
    root_tag = x[it][1:-1]
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
    converted_file_yaml = open("shedule2.yaml",'w')
    converted_file_yaml.write(converted_text)
    converted_file_yaml.close()

if __name__ == '__main__':
    main()
