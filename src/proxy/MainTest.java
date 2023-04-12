package proxy;

public class MainTest {
    public static void main(String[] args) {
        EmployeeDaoProxy employeeDaoProxy = new EmployeeDaoProxy();
        employeeDaoProxy.createEmployee("USER", new Employee()); //Access denied by proxy object.
        employeeDaoProxy.createEmployee("ADMIN", new Employee());
        employeeDaoProxy.getEmployee("USER", "123");
    }
}
