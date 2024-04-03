package Q2;

import Q2.model.Person;
import Q2.repository.PersonRepository;

public class Main {
    public static void main(String[] args) {
        PersonRepository personRepository = new PersonRepository();
        personRepository.save(new Person("shamim","samangi",1999));
    }


}
