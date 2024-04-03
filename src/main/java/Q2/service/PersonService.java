package Q2.service;

import Q2.model.Person;
import Q2.repository.PersonRepository;

import java.util.List;

public class PersonService {
    private final PersonRepository personRepository = new PersonRepository();

    public void save(Person person) {
        personRepository.save(person);
    }

    public void findById(Long id) {
        personRepository.findById(id);
    }

    public List<Person> findAll() {
        return personRepository.findAll();
    }

    public void remove(Long id) {
        Person person = new Person(id);
        personRepository.remove(person);
    }

    public void update(Person person) {
        personRepository.update(person);
    }
}
