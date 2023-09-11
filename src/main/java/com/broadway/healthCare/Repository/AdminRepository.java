package com.broadway.healthCare.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.broadway.healthCare.model.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer> {
 Admin findByNameAndPassword(String name,String password);
}
