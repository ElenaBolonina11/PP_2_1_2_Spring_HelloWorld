import org.springframework.context.annotation.Scope;
@Scope("singleton")
public class HelloWorld {
 
    private String message;
 
    public String getMessage() {
        return message;
    }
 
    public void setMessage(String message) {
        this.message = message;
    }

}