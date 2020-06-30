import Models.Person;

public class App {
    public static void main(String[] args){
        Person samplePerson = new Person(
                "Jessica",
                "P",
                "Parker",
                'F',
                33
                );

        System.out.println("Person generated: " + samplePerson.toString());
    }
}
