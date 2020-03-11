import java.util.List;

public interface EmployeeDAO {
    List<Employee> gatAllEmp()//getAllEmp
    ;

    //CRUD
    public List<Employee> getAllEmp();
    public void addEmp(Employee emp);
    public Employee findEmp(int id);
    public void updeteEmp (Employee emp);

    void updateEmp(Employee employee);

    public void deleteEmp (int id);



}
