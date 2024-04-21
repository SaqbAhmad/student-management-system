package net.saquibahmad.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.saquibahmad.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
