import java.util.ArrayList;
import java.util.List;

public class Personnel extends Person {
    private List<PersonProperty> properties;

    public Personnel(String name) {
        super(name);
        this.properties = new ArrayList<>();
    }

    public void addProperty(PersonProperty property) {
        properties.add(property);
    }

    public void removeProperty(PersonProperty property) {
        properties.remove(property);
    }

    public List<PersonProperty> getProperties() {
        return properties;
    }
}