package sba.sms.services;

import jakarta.persistence.TypedQuery;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
//import sba.sms.dao.CourseI;
import sba.sms.models.Course;
import sba.sms.utils.HibernateUtil;

import java.util.ArrayList;
import java.util.List;

/*
* public interface CourseI {
    void createCourse(Course course);
    Course getCourseById(int courseId);
    List<Course> getAllCourses();
*
* */
/**
 * CourseService is a concrete class. This class implements the
 * CourseI interface, overrides all abstract service methods and
 * provides implementation for each method.
 */
public class CourseService {
    public void createCourse(Course course) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.getTransaction().begin();
        session.save(course);
        session.getTransaction().commit();
        session.close();
    }

    public Course getCourseById(int courseId) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        String hql = "select c from Course c where c.id = :courseId";

        TypedQuery<Course> query = session.createQuery(hql, Course.class);
        query.setParameter("courseId", courseId);

        try {
            return query.getSingleResult();
        } catch (Exception e) {
            return null;
        } finally {
            session.close();
        }
    }

    public List<Course> getAllCourses() {
        Session session = HibernateUtil.getSessionFactory().openSession();

        String hql = "select c from Course c";
        TypedQuery<Course> query = session.createQuery(hql, Course.class);
        List<Course> courses = query.getResultList();
        session.close();
        return courses;
    }

}
