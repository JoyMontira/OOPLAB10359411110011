import java.util.List;
import java.util.Scanner;

public class CompanyManagment {

    public static void main(String[] args) {
        //
        EmployeeDAOlmpl dao = EmployeeDAOlmpl.getInstance();


        displayAllEmployee(dao);
        addNewEmployee(dao);

    }
    private static void addNewEmployee (EmployeeDAOlmpl dao){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee id: ");
        int id = Integer.parseInt(sc.nextLine().trim());
        System.out.print("Enter employee name: ");
        String name = sc.nextLine();
        System.out.print("Enter employee position: ");
        String position = sc.nextLine();
        System.out.print("Enter employee salary: ");
        double salary = Double.parseDouble(sc.nextLine().trim());

        dao.addEmp(new Employee(id,name,position,salary));
    }

    private static void displayAllEmployee(EmployeeDAOlmpl dao) {
        List<Employee> emp = dao.getAllEmp();
        for (Employee e:emp){
            System.out.println(e.toString());
        }
    }

}
