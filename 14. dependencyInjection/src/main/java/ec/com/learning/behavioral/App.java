package ec.com.learning.behavioral;

import ec.com.learning.behavioral.dao.CRUD;
import ec.com.learning.behavioral.dao.ConnectionMYSQL;
import ec.com.learning.behavioral.dao.ConnectionPostreSQL;
import ec.com.learning.behavioral.dao.IConnection;
import ec.com.learning.behavioral.dao.PersonDAO;
import ec.com.learning.behavioral.dao.PersonDAOImpl;
import ec.com.learning.behavioral.model.Person;

/**
 *
 * @author Steven Guamán - October 2022
 */
public class App {

    public static void main(String[] args) {
        IConnection cx1 = new ConnectionMYSQL("stevengf", "7482", "localhost");
        IConnection cx2 = new ConnectionPostreSQL("andresgf", "7482", "192.168.1.1");
        
        PersonDAO dao = new PersonDAOImpl();
        dao.setConnection(cx1);
        dao.listAll();
        
        dao.setConnection(cx2);
        dao.listAll();
    }

}
