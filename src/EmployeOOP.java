public class EmployeOOP {
    int empId;
    String empName;
    int empAge;


    void empDetails() {
        empId = 10;
        empName = "John Doe";
        empAge = 22;

    }
void displayDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee Age: " + empAge);
}

public class TestEmployee {
        public static void main(String[] args) {
            EmployeOOP emp = new EmployeOOP();
            emp.displayDetails();
            System.out.println("Employee ID: " + emp.empId);


        }
}
}
