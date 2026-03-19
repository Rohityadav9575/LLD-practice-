package ProxyPattern;

public class Main {
    public static void main(String[] args) {
        EmployeeDao employeeDao=new EmployeeProxy(Role.USER);
        employeeDao.addEmployee(1,"rohit");
        EmployeeDao employeeDao1=new EmployeeProxy(Role.ADMIN);
        employeeDao1.addEmployee(1,"Rohit");
        employeeDao1.removeEmployee(1);

        EmployeeDao employeeDao2=new EmployeeProxy(Role.SYSTEM);
        employeeDao2.removeEmployee(1);
    }
}
