package ra.academy.service;

import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;
import ra.academy.exception.NotFoundException;
import ra.academy.model.Student;
import ra.academy.repository.IStudentRepository;

import java.util.List;
@Service
@RequiredArgsConstructor // đánh dâ tạo constructor theo các trường chỉ định
public class StudentServiceImpl implements IStudentService{
    private final IStudentRepository studentRepository;
    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student findById(String id) throws NotFoundException {
        return studentRepository.findById(id).orElseThrow(() -> new NotFoundException("Không tìm thấy id"));
    }

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void delete(String id) {
        studentRepository.deleteById(id);
    }
}
