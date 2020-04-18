package com.example.demoStudentDB.Models;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface StudentRepo extends CrudRepository<Student, Integer> {
    List<Student> findByFname(String fname);
}
