package net.javaproject.sms.service;

import net.javaproject.sms.dto.StudentDto;
import net.javaproject.sms.entity.Student;

import java.util.List;

public interface StudentService {
    List<StudentDto> getallStudents();

    void createStudent(StudentDto student);

    StudentDto getStudentById(Long studentId);

    void updateStudent(StudentDto studentDto);

    void deleteStudent(Long studentId);

    //  void getStudentById(Long studentId);
}
