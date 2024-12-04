import Abstract.Person;
import Interface.Studyable;
import java.util.Scanner;

public class Student extends Person implements Studyable {

    private String major;

    public Student(String paramFirstName, String paramLastName, int paramAge) {
        super(paramFirstName, paramLastName, paramAge);
        //major = "";
    }

    @Override
    public void inputClassDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your major: ");
        major = scanner.nextLine();
    }

    @Override
    public void displayPersonDetails() {
        System.out.println("Name: " + returnsFullName());
        System.out.println("Age: " + age);
        System.out.println("Major: " + major);
        System.out.println(firstName + " " + lastName + " is studying " + major + ".");
        System.out.println();
    }
}