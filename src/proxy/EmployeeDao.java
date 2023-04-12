package proxy;

public interface EmployeeDao {
    void createEmployee(String user, Employee employee);
    void getEmployee(String user, String empId);
    void deleteEmployee(String user, String empId);
}
