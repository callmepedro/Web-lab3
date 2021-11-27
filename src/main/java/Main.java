import Entity.Hit;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        Hit hit = new Hit(1, 2, 3, "time to die", 228, true);

        EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = managerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.merge(hit);
        entityManager.getTransaction().commit();

        entityManager.close();
        managerFactory.close();
    }
}
