package Q2.repository;

import Q2.connection.SessionFactorySingleton;
import Q2.model.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

public class PersonRepository {
    private final SessionFactory sessionFactory = SessionFactorySingleton.getInstance();

    public void save(Person person) {
        Session currentSession = sessionFactory.openSession();
        Transaction transaction = currentSession.beginTransaction();
        currentSession.persist(person);
        transaction.commit();
        currentSession.close();
    }

    public Person findById(Long id) {
        Session currentSession = sessionFactory.openSession();
        Transaction transaction = currentSession.beginTransaction();
        Person person = currentSession.get(Person.class, id);
        transaction.commit();
        sessionFactory.close();
        return person;
    }

    public List<Person> findAll() {
        Session currentSession = sessionFactory.openSession();
        Transaction transaction = currentSession.beginTransaction();
        String sql="from person";
        Query<Person> fromFilm = currentSession.createQuery(sql, Person.class);
        List<Person> listOfFilm = fromFilm.list();
        transaction.commit();
        currentSession.close();
        return listOfFilm;
    }


    public void remove(Person person) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.remove(person);
        transaction.commit();
        session.close();
    }

    public void update(Person person) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.merge(person);
        transaction.commit();
        session.close();
    }

}
