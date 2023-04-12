package proxy;

public class EmployeeDaoImpl implements EmployeeDao{
    @Override
    public void createEmployee(String user, Employee employee) {
        System.out.println("Created new record in employee table.");
    }

    @Override
    public void getEmployee(String user, String empId) {
        System.out.println("Fetching record with id: "+empId);
    }

    @Override
    public void deleteEmployee(String user, String empId) {
        System.out.println("Deleted record with id: "+empId);
    }
}
