package Task5_3;

import java.util.List;

public class EmployeeManager {
    private final EmployeeRepository employeeRepository;
    private final EmailService emailService;

    public EmployeeManager(EmployeeRepository employeeRepository, EmailService emailService) {
        this.employeeRepository = employeeRepository;
        this.emailService = emailService;
    }

    public void addEmployee(Employee employee) {
        employeeRepository.addEmployee(employee);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.getAllEmployees();
    }

    public Employee getEmployeeById(int id) {
        return employeeRepository.getEmployeeById(id);
    }

    public void sendEmailToEmployee(int employeeId, String message) {
        Employee employee = employeeRepository.getEmployeeById(employeeId);
        if (employee != null) {
            emailService.sendEmail(employee, message);
        }
    }
}