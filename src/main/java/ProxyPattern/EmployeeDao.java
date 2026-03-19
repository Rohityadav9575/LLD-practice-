package ProxyPattern;

public interface EmployeeDao {
    public void addEmployee(Integer id, String empName);
    public void removeEmployee(Integer id);
    public void getEmployee(Integer id);
    public void updateEmployee(Integer id, String newEmpName);

}
