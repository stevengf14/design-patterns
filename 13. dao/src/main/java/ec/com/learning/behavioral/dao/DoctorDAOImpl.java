package ec.com.learning.behavioral.dao;

import ec.com.learning.behavioral.model.Doctor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Steven Guamán - September 2022
 */
public class DoctorDAOImpl implements DoctorDAO {

    @Override
    public List<Doctor> allPeople() {
        List<Doctor> list = new ArrayList<>();
        Doctor doctor = new Doctor();
        doctor.setId(1);
        doctor.setNames("Steven");
        list.add(doctor);

        Doctor doctor2 = new Doctor();
        doctor.setId(2);
        doctor.setNames("Nicole");
        list.add(doctor2);

        return list;
    }

    @Override
    public Doctor getById() {
        // logic
        return null;
    }

    @Override
    public void add(Doctor doctor) {
        System.out.println("Doctor: " + doctor.getNames() + " registered");
    }

    @Override
    public void update(Doctor doctor) {
        System.out.println("Doctor: " + doctor.getNames() + " updated");
    }

    @Override
    public void delete(int id) {
        System.out.println("id: " + id + " deleted");
    }

    @Override
    public void assit() {
        System.out.println("Dcotor assist patient");
    }

}
