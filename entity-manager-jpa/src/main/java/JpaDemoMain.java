import jakarta.persistence.EntityManager;
import org.hibernate.Session;

public class JpaDemoMain {
    public static void main(String[] args) {
        EntityManager em  = JPAUtil.getEntityManager();
        //now we are going to interact with the database using this session

        try {
            UserClassHibernate user = new UserClassHibernate("Alice");
            //hume session ki help se ye jo object hai user ushe save karna hai database mai, kyunki ye session ek connection hai to the database
            em.getTransaction().begin(); //transaction ko start kiya
            em.persist(user); //agar mujhe kuch save karna hai database mai to mai persist ko use karunga
            em.getTransaction().commit();
            System.out.println("User saved: " + user.getId());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
            JPAUtil.close();
        }
    }
}
