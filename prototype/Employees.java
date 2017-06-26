
import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable {
    private List<String> employeesList;

    public Employees() {
        this.employeesList = new ArrayList<String>();
    }
    
    public Employees(List<String> list) {
        this.employeesList = list;
    }

    public void loadData() {
        // Sample stub to load data
        this.employeesList.add("Allen");
        this.employeesList.add("Barbara");
        this.employeesList.add("Candice");
        this.employeesList.add("Dale");
    }

    public List<String> getEmployeesList() {
        return this.employeesList;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        List<String> temp = new ArrayList<String>();
        for (String s : this.getEmployeesList()) {
            temp.add(s);
        }
        return new Employees(temp);
    }
}