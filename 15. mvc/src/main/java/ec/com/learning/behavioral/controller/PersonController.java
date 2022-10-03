package ec.com.learning.behavioral.controller;

import ec.com.learning.behavioral.dao.PersonDAOImpl;
import ec.com.learning.behavioral.model.Person;
import ec.com.learning.behavioral.service.PersonService;
import ec.com.learning.behavioral.service.PersonServiceImpl;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;


/**
 *
 * @author Steven - September 2022
 */
@Named
@ViewScoped
public class PersonController implements Serializable {

    private List<Person> list;
    private PersonService service;
    private String motor;

    public PersonController() {
        motor = "MYSQL";
        list = new ArrayList<>();
        service = new PersonServiceImpl(new PersonDAOImpl(motor));
        listAll();
    }

    public void listAll() {
        list = service.listAll();
    }
    
    public void select(String motor) {
        service = new PersonServiceImpl(new PersonDAOImpl(motor));
        listAll();
    }

    public List<Person> getList() {
        return list;
    }

    public void setList(List<Person> list) {
        this.list = list;
    }

}
