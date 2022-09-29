package ec.com.learning.behavioral;

import ec.com.learning.behavioral.dao.CRUD;
import ec.com.learning.behavioral.dao.DoctorDAOImpl;
import ec.com.learning.behavioral.dao.PersonDAO;
import ec.com.learning.behavioral.dao.PersonDAOImpl;
import ec.com.learning.behavioral.model.Doctor;
import ec.com.learning.behavioral.model.Person;

/**
 *
 * @author Steven Guamán - September 2022
 */
public class App {

    public static void main(String[] args) {
        CRUD personDao = new PersonDAOImpl();
        System.out.println(personDao.allPeople());
        
        Person per = new Person();
        per.setNames("Andres");
        personDao.add(per);
        
        CRUD doctorDao = new DoctorDAOImpl();
        System.out.println(doctorDao.allPeople());
        
        Doctor doc = new Doctor();
        doc.setNames("Andres");
        doctorDao.add(doc);
    }

}
