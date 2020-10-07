package com.sri.bootexe.springbootexe.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sri.bootexe.springbootexe.Entity.EnvironmentEntity;

public interface Envdao extends JpaRepository<EnvironmentEntity, Long> {

}
