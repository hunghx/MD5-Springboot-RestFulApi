package ra.academy.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ra.academy.exception.NotFoundException;
import ra.academy.model.Student;
import ra.academy.service.IStudentService;

import java.util.List;

@RestController
@RequestMapping("/api/v2/admin/student")
@RequiredArgsConstructor
public class StudentController {
    private  final IStudentService studentService;
    // lấ về tất cả
    @GetMapping
    public List<Student> findAll(){
        return studentService.findAll();
    }

    @GetMapping("/{id}")
    public  Student findById(@PathVariable String id) throws NotFoundException {
        return studentService.findById(id);
    }

    @PostMapping
    public Student add(@RequestBody Student student){
        return studentService.save(student);
    }
    @PutMapping("/{id}")
    public Student update(@RequestBody Student student,@PathVariable String id){
        student.setStudentId(id);
        return studentService.save(student);
    }
    @DeleteMapping("/{id}")
    public String delete(@PathVariable String id){
        studentService.delete(id);
        return "Xóa thành công";
    }


}
