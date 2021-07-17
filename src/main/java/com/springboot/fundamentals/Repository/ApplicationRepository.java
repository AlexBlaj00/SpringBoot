package com.springboot.fundamentals.Repository;

import com.springboot.fundamentals.Entity.Application;
import org.springframework.data.repository.CrudRepository;

public interface ApplicationRepository extends CrudRepository<Application, Long> {
}
