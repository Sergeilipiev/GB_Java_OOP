package Task5_3;

public class EmailServiceImpl implements EmailService {
    @Override
    public void sendEmail(Employee employee, String message) {
        System.out.println("Sending email to " + employee.getEmail() + " with message: " + message);
    }
}