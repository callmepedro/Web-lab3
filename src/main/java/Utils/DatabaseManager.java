package Utils;

import Beans.Hit;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DatabaseManager {
    private EntityManagerFactory factory;
    private EntityManager entityManager;

    public DatabaseManager() {
        this.factory = Persistence.createEntityManagerFactory("default");
        this.entityManager = factory.createEntityManager();
    }

    public boolean addHit(Hit hit) {
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(hit);
            entityManager.getTransaction().commit();
            return true;
        }catch (Exception e){
            entityManager.getTransaction().rollback();
            return false;
        }
    }


}
