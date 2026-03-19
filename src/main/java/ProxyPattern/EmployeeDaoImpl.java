package ProxyPattern;

import java.util.HashMap;
import java.util.Map;

public class EmployeeDaoImpl implements EmployeeDao {
    Map<Integer ,String> employeeMap=new HashMap<>();
    @Override
    public void addEmployee(Integer id, String empName) {
        employeeMap.put(id,empName);
        System.out.println("Employee with id:"+id+"has been added");
    }

    @Override
    public void removeEmployee(Integer id) {
        employeeMap.remove(id);
        System.out.println("Employee with id:"+id+"has been removed");
    }

    @Override
    public void getEmployee(Integer id) {
        System.out.println("Employee name with id"+id+"is"+employeeMap.get(id));

    }

    @Override
    public void updateEmployee(Integer id, String newEmpName) {
        employeeMap.put(id,newEmpName);
        System.out.println("Employee name with id"+id+"is updated");
    }
}
