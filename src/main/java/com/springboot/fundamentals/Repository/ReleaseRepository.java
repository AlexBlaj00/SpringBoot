package com.springboot.fundamentals.Repository;

import com.springboot.fundamentals.Entity.Release;
import org.springframework.data.repository.CrudRepository;

public interface ReleaseRepository extends CrudRepository<Release, Long> {
}
