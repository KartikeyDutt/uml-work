
import java.util.ArrayList;
import java.util.List;

public class PersonProperty {
    private String name;
    private List<PersonProperty> containedProperties;

    public PersonProperty(String name) {
        this.name = name;
        this.containedProperties = new ArrayList<>();
    }

    public void addContainedProperty(PersonProperty property) {
        containedProperties.add(property);
    }

    public void removeContainedProperty(PersonProperty property) {
        containedProperties.remove(property);
    }

    public String getName() {
        return name;
    }

    public List<PersonProperty> getContainedProperties() {
        return containedProperties;
    }
}