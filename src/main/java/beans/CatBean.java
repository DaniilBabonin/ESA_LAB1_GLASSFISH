package beans;

import entity.Cat;

import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;

@Singleton
public class CatBean {
    @PersistenceContext(unitName = "esa")
    private EntityManager em;

    public Collection<Cat> findAll(){
        return em.createQuery("SELECT c FROM Cat c", Cat.class).getResultList();
    }
}