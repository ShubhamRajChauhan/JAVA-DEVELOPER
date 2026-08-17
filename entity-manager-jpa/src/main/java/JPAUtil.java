import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JPAUtil {

    private static final EntityManagerFactory emf;


    /*hume chaiye kuch code execute ho class ke loading pr, to humlog static block use krte hai.
    To mai chah rha hun ki jab v ye class(JPAUtil) load ho, to jo EntityManager hai wo initialize ho jaaye*/
    static {
        emf = Persistence.createEntityManagerFactory("myJpaUnit");
    }

    public static EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public  static void close() {
        emf.close();
    }
}
