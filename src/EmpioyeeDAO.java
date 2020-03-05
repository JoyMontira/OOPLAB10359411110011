import java.util.List;

public interface EmpioyeeDAO {
    //CRUD
    public List<Employee> getAllEmp();
    public void addEmp(Employee emp);
    public Employee findEmp(int id);
    public void updeteEmp (Employee emp);
    public void deleteEmp (int id);



}
