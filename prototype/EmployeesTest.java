
import java.util.List;

public class EmployeesTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employees employees = new Employees();
        employees.loadData();

        Employees newEmployeesOne = (Employees)employees.clone();
        Employees newEmployeesTwo = (Employees)employees.clone();
        List<String> listOne = newEmployeesOne.getEmployeesList();
        listOne.add("Erin");

        List<String> listTwo = newEmployeesOne.getEmployeesList();
        listTwo.remove("Allen");

        System.out.println("Employees list: " + employees.getEmployeesList());
        System.out.println("newEmployeesOne list: " + newEmployeesOne.getEmployeesList());
        System.out.println("newEmployeesTwo list: " + newEmployeesTwo.getEmployeesList());
    }
}