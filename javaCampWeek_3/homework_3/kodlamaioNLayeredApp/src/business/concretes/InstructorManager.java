package business.concretes;

import business.abstracts.InstructorService;
import core.Logger;
import dataAccess.abstracts.InstructorDao;
import entities.Instructor;

import java.util.List;

public class InstructorManager implements InstructorService {
    private InstructorDao instructorDao;
    private List<Logger> loggers;

    public InstructorManager(InstructorDao instructorDao, List<Logger> loggers){
        this.instructorDao = instructorDao;
        this.loggers = loggers;
    }

    @Override
    public void add(Instructor instructor) throws Exception {
        instructorDao.add(instructor);

        for (Logger logger : loggers) {
            logger.log(instructor.getName());

        }
    }
}
