package zti.demo;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;
import java.util.HashMap;
import java.util.Map;
import jakarta.annotation.PostConstruct;

@Named
@ApplicationScoped
public class ChatSessionController implements java.io.Serializable {

    private Map<String, String> users = null;

    public ChatSessionController(){}

    @PostConstruct
    public void init(){
        users = new HashMap<>();
    }

    public Map<String, String> getUsers() {
        return users;
    }
    
    public void setUsers(Map<String, String> users) {
        this.users = users;
    }

}