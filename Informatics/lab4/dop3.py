import pandas_read_xml as pdx

def main():
    df = pdx.read_xml("shedule.xml")
    df.to_csv('shedule.csv', index = None)

if __name__ == '__main__':
    main()
