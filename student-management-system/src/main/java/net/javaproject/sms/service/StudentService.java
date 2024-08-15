package net.javaproject.sms.service;

import net.javaproject.sms.dto.StudentDto;
import net.javaproject.sms.entity.Student;

import java.util.List;

public interface StudentService {
    List<StudentDto> getallStudents();
}
