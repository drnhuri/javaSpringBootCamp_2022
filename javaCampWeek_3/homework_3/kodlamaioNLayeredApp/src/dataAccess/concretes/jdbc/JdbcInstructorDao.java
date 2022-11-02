package dataAccess.concretes.jdbc;

import dataAccess.abstracts.InstructorDao;
import entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {
    @Override
    public void add(Instructor instructor) {
        System.out.println("JDBC ile eğitmen eklendi.");
    }
}
