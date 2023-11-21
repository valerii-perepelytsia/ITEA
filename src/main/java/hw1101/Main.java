package hw1101;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        try {
            createXmlFile();

            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();

            XmlParser xmlParser = new XmlParser();
            saxParser.parse(new File("city.xml"), xmlParser);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void createXmlFile() {
        try {
            Element cityElement = new Element("city");
            cityElement.setAttribute("size", "big");

            Element streetElement1 = new Element("street");
            streetElement1.setAttribute("name", "Main Street");
            streetElement1.addContent(new Element("house").setText("1"));
            streetElement1.addContent(new Element("house").setText("2"));

            Element streetElement2 = new Element("street");
            streetElement2.setAttribute("name", "Second Street");
            streetElement2.addContent(new Element("house").setText("3"));
            streetElement2.addContent(new Element("house").setText("4"));

            cityElement.addContent(streetElement1);
            cityElement.addContent(streetElement2);

            Document document = new Document(cityElement);
            XMLOutputter xmlOutputter = new XMLOutputter(Format.getPrettyFormat());
            xmlOutputter.output(document, new FileWriter("city.xml"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}