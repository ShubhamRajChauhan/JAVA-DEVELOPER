import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity   //Entity is JPA Specification, JPA dictate kr rha hai ki kya hona chaiye yahan pr, aur kaam Hibernate kr rha hai,
          //to ye keh rha hai ye jo class hai (UserClassHibernate) ishko persist kr do database table mai, to persist kr do bolne ke liye humne (@Entity) ka istemaal kiya hai
public class UserClassHibernate {
    @Id //@Entity class must declare or inherit at least one '@Id' or '@Embedded' property
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //to (@Id) ki help se mai keh rha hun ki ye unique identifier hai ish class ka
    private String name;

    public UserClassHibernate() {
    }

    public UserClassHibernate(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public UserClassHibernate(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
