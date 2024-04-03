package Q2.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;




@Entity(name = "Person")
@Table(name = "person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String familyName;
    private LocalDate birthdate;

    public Person(String name, String familyName,LocalDate birthdate) {
        this.name = name;
        this.familyName = familyName;
        this.birthdate = birthdate;
    }

    public Person() {
    }

    public Person(Long id, String name, String familyName, LocalDate birthdate) {
        this.id = id;
        this.name = name;
        this.familyName = familyName;
        this.birthdate = birthdate;
    }

    public Person(Long id) {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", familyName='" + familyName + '\'' +
                ", birthdate=" + birthdate +
                '}';
    }
}
