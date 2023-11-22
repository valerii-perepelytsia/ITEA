package hw1102;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;

public class Street {
    private String name;
    private List<String> houses;

    @XmlAttribute
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name = "house")
    public List<String> getHouses() {
        return houses;
    }

    public void setHouses(List<String> houses) {
        this.houses = houses;
    }
}