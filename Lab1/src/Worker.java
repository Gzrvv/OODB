import java.util.List;

public class Worker extends Person{
    private String position;

    public Worker (String firstName, String lastName, String phoneNumber, String email, String position) {
        super(firstName, lastName, phoneNumber, email);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
