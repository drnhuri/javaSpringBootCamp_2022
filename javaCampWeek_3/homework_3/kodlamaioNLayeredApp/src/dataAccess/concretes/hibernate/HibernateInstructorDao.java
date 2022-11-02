package dataAccess.concretes.hibernate;

import dataAccess.abstracts.InstructorDao;
import entities.Instructor;

public class HibernateInstructorDao implements InstructorDao {
    @Override
    public void add(Instructor instructor) {
        System.out.println("Hibernate ile eğitmen eklendi.");
    }
}
