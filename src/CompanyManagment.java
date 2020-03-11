import java.util.List;
import java.util.Scanner;

public class CompanyManagment {
    public static void main(String[] args) {
        //create interface instant
        EmployeeDAO dao = EmployeeDAOImpl.getInstance();


        //Get all Employee
        displayAllEmployee (dao);
        //add new Employee
        //addNewEmployee(dao);
        //find Employee by ID
        findEmployeeByID(dao);
        //update Employee by ID
        updateEmployeeByID(dao);
        //delete Employee by ID;
        deleteEmployeeByID(dao);





    }//main
    private static void deleteEmployeeByID(EmployeeDAO dao) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Delete employee with ID: ");
        int id = Integer.parseInt(sc.nextLine().trim());
        dao.deleteEmp(id);

    }
    private static void updateEmployeeByID(EmployeeDAO dao){
        Employee emp = findEmployeeByID2(dao);
        Scanner sc = new Scanner(System.in);
        System.out.println("Update new salary for employee ID "
                +emp.getEmpID()+":");
        double ns = Double.parseDouble(sc.nextLine().trim());
        emp.setSalary(ns);
        dao.updateEmp(emp);
        System.out.println("Update employee with ID: "+emp.getEmpID());
    }
    private static  Employee findEmployeeByID2(EmployeeDAO dao){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an employee ID: ");
        int id = Integer.parseInt((sc.nextLine().trim()));
        Employee emp = dao.findEmp(id);
        System.out.println(emp.toString());

        return emp;
    }

    private static void findEmployeeByID(EmployeeDAO dao) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an employee ID: ");
        int id = Integer.parseInt((sc.nextLine().trim()));
        Employee emp = dao.findEmp(id);
        System.out.println(emp.toString());
    }


    private static void addNewEmployee(EmployeeDAO dao) {
        Scanner sc = new Scanner(System.in);
        //input data
        System.out.println("Enter employee id: ");
        int id = Integer.parseInt(sc.nextLine().trim());
        System.out.println("Enter employee name: ");
        String name = sc.nextLine().trim();
        System.out.println("Enter employee position: ");
        String position = sc.nextLine().trim();
        System.out.println("Enter employee salary: ");
        double salary = Double.parseDouble(sc.nextLine().trim());
        //insert data to database
        Employee newEmp = new Employee(id,name,position,salary);
        dao.addEmp(newEmp);



    }

    private static void displayAllEmployee(EmployeeDAO dao) {
        List<Employee> myEmp = dao.gatAllEmp();
        for (Employee emp:myEmp){
            System.out.println(emp.toString());
        }
    }


}//class