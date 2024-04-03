package Q2;

import Q2.model.Person;
import Q2.repository.PersonRepository;
import Q2.service.PersonService;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PersonService personService = new PersonService();
        Scanner scanner=new Scanner(System.in);

        signUp(scanner, personService);

//        personService.save(new Person("reyhane","darvishian",LocalDate.parse("1999-11-03")));

//        System.out.println(personService.findById(1l));

//        personService.findAll().forEach(System.out::println);

//        personService.remove(3l);

//        personService.update(new Person(4L,"asghar","shalgham",LocalDate.parse("1990-12-04")));

//        System.out.println(personService.contain(10L));
    }

    private static void signUp(Scanner scanner, PersonService personService) {
        System.out.println("enter your first name : ");
        String firstName = scanner.nextLine();
        System.out.println("enter your last name : ");
        String lastName = scanner.nextLine();
        System.out.println("enter your birthdate : ");
        String dateStr = scanner.nextLine();
        LocalDate birthdate = LocalDate.parse(dateStr);


        personService.signUp(new Person(firstName, lastName, birthdate));
    }


}
