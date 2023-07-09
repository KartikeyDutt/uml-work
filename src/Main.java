import java.util.List;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("John");
        Personnel personnel1 = new Personnel("Employee1");
        Personnel personnel2 = new Personnel("Employee2");
        PersonProperty property1 = new PersonProperty("Property1");
        PersonProperty property2 = new PersonProperty("Property2");


        person.addPersonnel(personnel1);
        person.addPersonnel(personnel2);

        personnel1.addProperty(property1);
        personnel2.addProperty(property2);

        System.out.println(person.getName() + " has personnel:");
        List<Personnel> personnelList = person.getPersonnelList();
        for (int i = 0; i < ((List<?>) personnelList).size(); i++) {
            Personnel personnel = personnelList.get(i);
            System.out.println("- " + personnel.getName());
        }

        System.out.println(personnel1.getName() + " has properties:");
        List<PersonProperty> propertyList = personnel1.getProperties();
        for (int i = 0; i < propertyList.size(); i++) {
            PersonProperty property = propertyList.get(i);
            System.out.println("- " + property.getName());
        }

        System.out.println(personnel2.getName() + " has properties:");
        List<PersonProperty> propertyList2 = personnel2.getProperties();
        for (int i = 0; i < propertyList2.size(); i++) {
            PersonProperty property = propertyList2.get(i);
            System.out.println("- " + property.getName());
        }
    }
}