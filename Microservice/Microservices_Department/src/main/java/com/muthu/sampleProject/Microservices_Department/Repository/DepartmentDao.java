package com.muthu.sampleProject.Microservices_Department.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.muthu.sampleProject.Microservices_Department.Entity.Department;

public interface DepartmentDao extends JpaRepository<Department, Integer> {

}
