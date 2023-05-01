package Task5_3;

public class Main {
    public static void main(String[] args) {
        EmployeeRepository employeeRepository = new EmployeeRepositoryImpl();
        EmailService emailService = new EmailServiceImpl();
        EmployeeManager employeeManager = new EmployeeManager(employeeRepository, emailService);

        Employee olga = new Employee(1, "Ольга", "olga@mail.ru");
        Employee ivan = new Employee(2, "Иван", "ivan@mail.ru");

        employeeManager.addEmployee(olga);
        employeeManager.addEmployee(ivan);

        employeeManager.sendEmailToEmployee(2, "Добрый день, "
                +employeeManager.getEmployeeById(2).getName()+"!");
    }
}