package hw1101;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class XmlParser extends DefaultHandler {
    private StringBuilder currentData;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        currentData = new StringBuilder();
        System.out.println("Start Element: " + qName);

        for (int i = 0; i < attributes.getLength(); i++) {
            System.out.println("Attribute: " + attributes.getQName(i) + "=" + attributes.getValue(i));
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        currentData.append(ch, start, length);
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        System.out.println("End Element: " + qName);
        if (currentData.length() > 0) {
            System.out.println("Element Data: " + currentData.toString().trim());
        }
    }
}