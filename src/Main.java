public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("John", "Roche", 35);
        student1.inputClassDetails();
        student1.displayPersonDetails();

        Student student2 = new Student("Alice", "Roche", 30);
        student2.inputClassDetails();
        student2.displayPersonDetails();
    }
}