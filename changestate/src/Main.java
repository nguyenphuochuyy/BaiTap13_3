import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person("Huy" , 22));
        persons.add(new Person("Tuan" , 22));
        persons.add(new Person("Hoang" , 23));

        persons.get(0).increaseAge(1,persons);
        for (Person person : persons) {
            System.out.println(person);
        }
    }
}