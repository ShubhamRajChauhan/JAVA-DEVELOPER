import org.hibernate.Session;

public class HibernateDemoMain {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSession(); //we get the session
        //now we are going to interact with the database using this session

        try {
            UserClassHibernate user = new UserClassHibernate("Alice");
            //hume session ki help se ye jo object hai user ushe save karna hai database mai, kyunki ye session ek connection hai to the database
            session.beginTransaction(); //transaction ko start kiya
            session.persist(user); //agar mujhe kuch save karna hai database mai to mai persist ko use karunga
            session.getTransaction().commit();
            System.out.println("User saved: " + user.getId());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            HibernateUtil.close();
        }
    }
}
