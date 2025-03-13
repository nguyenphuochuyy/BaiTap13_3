import java.util.List;

public class Person {
    private String name;
    private int age;

    public void increaseAge(int age , List<Person> allpersons) {
            this.age += age;
            System.out.println(this.name + "are increase");
            notifyAll(allpersons);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void notifyAll(List<Person> allpersons) {
        for (Person person : allpersons) {
            if(person!= this)
            person.react();
        }
    }


    public void react(){
        System.out.println(this.name + "someone changed age");
    }
}
