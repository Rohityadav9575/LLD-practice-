package ProxyPattern;

public class EmployeeProxy implements EmployeeDao {
    private final EmployeeDaoImpl employeeDaoImplObj;
    private final Role role;

    public EmployeeProxy(Role role) {
        this.employeeDaoImplObj = new EmployeeDaoImpl();
        this.role = role;
    }

    @Override
    public void addEmployee(Integer id, String empName) {
        if(this.role==Role.ADMIN){
            employeeDaoImplObj.addEmployee(id,empName);
        }else{
            System.out.println("You do not have the permission to add employee");
        }
    }

    @Override
    public void removeEmployee(Integer id) {
        if(this.role==Role.SYSTEM){
            employeeDaoImplObj.removeEmployee(id);
        }else{
            System.out.println("You do not have the permission to remove employee");
        }
    }

    @Override
    public void getEmployee(Integer id) {
        if(this.role==Role.USER){
            employeeDaoImplObj.getEmployee(id);
        }else{
            System.out.println("You are not a user so we will not show details");
        }
    }

    @Override
    public void updateEmployee(Integer id, String newEmpName) {
        if(this.role==Role.USER){
            employeeDaoImplObj.getEmployee(id);
        }else{
            System.out.println("You are not a user so we will not update details");
        }
    }
}
