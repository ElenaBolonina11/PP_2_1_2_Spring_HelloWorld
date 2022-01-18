import org.springframework.context.annotation.Scope;

@Scope("prototype")
public class Cat {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
