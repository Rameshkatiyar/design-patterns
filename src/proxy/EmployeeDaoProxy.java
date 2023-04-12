package proxy;

public class EmployeeDaoProxy implements EmployeeDao{
    EmployeeDao employeeDao;

    public EmployeeDaoProxy() {
        employeeDao = new EmployeeDaoImpl();
    }

    @Override
    public void createEmployee(String user, Employee employee) {
        if (user.equalsIgnoreCase("ADMIN")) {
            employeeDao.createEmployee(user, employee);
        }else {
            System.out.println("Access Denied!");
        }
    }

    @Override
    public void getEmployee(String user, String empId) {
        if (user.equalsIgnoreCase("ADMIN") || user.equalsIgnoreCase("USER")) {
            employeeDao.getEmployee(user, empId);
        }else {
            System.out.println("Access Denied!");
        }
    }

    @Override
    public void deleteEmployee(String user, String empId) {
        if (user.equalsIgnoreCase("ADMIN")) {
            employeeDao.deleteEmployee(user, empId);
        }else {
            System.out.println("Access Denied!");
        }
    }
}
