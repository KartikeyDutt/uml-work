import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private List<Personnel> personnelList;

    public Person(String name) {
        this.name = name;
        this.personnelList = new ArrayList<>();
    }

    public void addPersonnel(Personnel personnel) {
        personnelList.add(personnel);
    }

    public void removePersonnel(Personnel personnel) {
        personnelList.remove(personnel);
    }

    public String getName() {
        return name;
    }

    public List<Personnel> getPersonnelList() {
        return personnelList;
    }
}