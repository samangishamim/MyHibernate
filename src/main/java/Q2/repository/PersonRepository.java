package Q2.repository;

import Q2.connection.SessionFactorySingleton;
import Q2.model.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class PersonRepository {
    private final SessionFactory sessionFactory = SessionFactorySingleton.getInstance();

    public void save(Person person) {
        Session currentSession = sessionFactory.openSession();
        Transaction transaction = currentSession.beginTransaction();
        currentSession.persist(person);
        transaction.commit();
        sessionFactory.close();
    }

    public Person findById(Long id){
        Session currentSession = sessionFactory.openSession();
        Transaction transaction = currentSession.beginTransaction();
        Person person = currentSession.find(Person.class, id);
        transaction.commit();
        sessionFactory.close();
        return person;
    }
}
