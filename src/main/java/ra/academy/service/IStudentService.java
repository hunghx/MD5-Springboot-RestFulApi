package ra.academy.service;

import ra.academy.exception.NotFoundException;
import ra.academy.model.Student;

import java.util.List;

public interface IStudentService {

    List<Student> findAll();
    Student findById(String id) throws NotFoundException;
    Student save(Student student);
    void delete(String id);
}
