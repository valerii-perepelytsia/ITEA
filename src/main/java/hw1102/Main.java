package hw1102;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            createXmlFile();

            JAXBContext jaxbContext = JAXBContext.newInstance(City.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            City city = (City) jaxbUnmarshaller.unmarshal(new File("city.xml"));

            System.out.println("City Size: " + city.getSize());
            for (Street street : city.getStreets()) {
                System.out.println("Street Name: " + street.getName());
                for (String house : street.getHouses()) {
                    System.out.println("House Number: " + house);
                }
            }
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    private static void createXmlFile() {
        try {
            City city = new City();
            city.setSize("big");

            Street street1 = new Street();
            street1.setName("Main Street");
            street1.setHouses(List.of("1", "2"));

            Street street2 = new Street();
            street2.setName("Second Street");
            street2.setHouses(List.of("3", "4"));

            city.setStreets(List.of(street1, street2));

            JAXBContext jaxbContext = JAXBContext.newInstance(City.class);
            javax.xml.bind.Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxbMarshaller.marshal(city, new File("city.xml"));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}