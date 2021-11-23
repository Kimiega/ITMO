import xmlplain

def main():
    # Read to plain object
    with open("shedule.xml") as inf:
      root = xmlplain.xml_to_obj(inf, strip_space=True, fold_dict=True)

    # Output plain YAML
    with open("shedule1.yaml",'w') as outf:
      xmlplain.obj_to_yaml(root, outf)

if __name__ == '__main__':
    main()
