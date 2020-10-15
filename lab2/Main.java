package ru.icmit.oodb.lab2;



import ru.icmit.oodb.lab2.domain.Person;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        try {

            List<Person> persons = LoadDB.loadPersonList();

            persons.forEach(System.out::println);

            Person prs = PersonService.findPersonByName(persons, "Булат");

            if (prs != null) {
                prs.setPhoneNumber("+79393927937");

            }

            SaveDB.savePersonList(persons);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
