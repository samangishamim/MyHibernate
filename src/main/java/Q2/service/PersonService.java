package Q2.service;

import Q2.model.Person;
import Q2.repository.PersonRepository;

import java.util.List;

public class PersonService {
    private final PersonRepository personRepository = new PersonRepository();

    public void signUp(Person person) {
        personRepository.save(person);
    }

    public Person findById(Long id) {
       return personRepository.findById(id);
    }

    public List<Person> findAll() {
        return personRepository.findAll();
    }

    public void remove(Long id) {
        Person person=personRepository.findById(id);
        personRepository.remove(person);
    }

    public void update(Person person) {
        personRepository.update(person);
    }

    public  boolean contain(Long id){
       return personRepository.contain(id);
    }
}
