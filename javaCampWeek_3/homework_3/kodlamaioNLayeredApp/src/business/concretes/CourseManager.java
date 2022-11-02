package business.concretes;

import business.abstracts.CourseService;
import core.Logger;
import dataAccess.abstracts.CourseDao;
import entities.Category;
import entities.Course;

import java.util.List;

public class CourseManager implements CourseService {
    private CourseDao courseDao;
    private List<Logger> loggers;
    private List<Course> courses;

    public CourseManager(CourseDao courseDao, List<Logger> loggers, List<Course> courses){
        this.courseDao = courseDao;
        this.loggers = loggers;
        this.courses = courses;
    }

    @Override
    public void add(Course course) throws Exception {
        for (Course courseOrder : courses){
            if(courseOrder.getName().equals(course.getName())){
                throw new Exception("Aynı isme sahip kurs mevcuttur.");
            }
        }
        if(course.getUnitPrice()<0){
            throw new Exception("Kurs fiyatı 0'dan büyük olmalıdır.");
        }
        courseDao.add(course);
        courses.add(course);

        for (Logger logger : loggers) {
            logger.log(course.getName());
        }

    }
}
