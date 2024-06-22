package sba.sms.services;

import jakarta.persistence.TypedQuery;
import org.hibernate.Session;
//import sba.sms.dao.StudentI;
import sba.sms.models.Course;
import sba.sms.models.Student;
import sba.sms.utils.HibernateUtil;

import java.util.*;

/**
 * StudentService is a concrete class. This class implements the
 * StudentI interface, overrides all abstract service methods and
 * provides implementation for each method. Lombok @Log used to
 * generate a logger file.
 *
 *
 * public interface StudentI {
 *     List<Student> getAllStudents();
 *     void createStudent(Student student);
 *
 *     Student getStudentByEmail(String email);
 *
 *     boolean validateStudent(String email, String password);
 *
 *     void registerStudentToCourse(String email, int courseId);
 *
 *     List<Course> getStudentCourses(String email);
 * }
 *
 *
 */

public class StudentService{
    public List<Student> getAllStudents() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        String hql = "select s FROM Student s";

        TypedQuery<Student> query = session.createQuery(hql, Student.class);
        List<Student> students = query.getResultList();
        session.close();
        return students;
    }

    public void createStudent(Student student) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.getTransaction().begin();
        session.save(student);
        session.getTransaction().commit();
        session.close();
    }

    public Student getStudentByEmail(String email){
        Session session = HibernateUtil.getSessionFactory().openSession();
        String hql = "select s from Student s where s.email = :email";
        TypedQuery<Student> student = session.createQuery(hql, Student.class);

        student.setParameter("email", email);

        try{
            return student.getSingleResult();
        } catch (Exception e) {
            return null;
        } finally {
            session.close();
        }
    }

    public static boolean validateStudent(String email, String password){
        Session session = HibernateUtil.getSessionFactory().openSession();
        String hql = "select s from Student s where s.email = :email and s.password = :password";
        TypedQuery<Student> student = session.createQuery(hql, Student.class);

        student.setParameter("email", email);
        student.setParameter("password", password);

        try {
            return student.getSingleResult() != null;
        } catch (Exception e) {
            return false;
        } finally {
            session.close();
        }
    }

    public void registerStudentToCourse(String email, int courseId){
        Session session = HibernateUtil.getSessionFactory().openSession();
        CourseService courseService = new CourseService();

        Student studentToRegister = getStudentByEmail(email);
        Course courseToRegister = courseService.getCourseById(courseId);
        studentToRegister.getCourses().add(courseToRegister);

        try{
            session.getTransaction().begin();
            session.merge(studentToRegister);
            session.getTransaction().commit();
            System.out.printf("successfully register %s to %s%n", getStudentByEmail(email).getName(), courseService.getCourseById(courseId).getName());
        } catch(Exception e) {
            System.out.println("Sorry, you already registered for this course!");
        }
        finally {
            session.close();

        }


    }

    public List<Course> getStudentCourses(String email) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Student student = getStudentByEmail(email);
        Set<Course> setOfCourses = student.getCourses();
        List<Course> listOfCourses = new ArrayList<Course>();
        listOfCourses.addAll(setOfCourses);
        session.close();

        return listOfCourses;

    }

}
