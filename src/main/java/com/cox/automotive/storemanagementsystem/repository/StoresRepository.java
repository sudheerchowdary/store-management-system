package com.cox.automotive.storemanagementsystem.repository;

import com.cox.automotive.storemanagementsystem.entity.StoresEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoresRepository extends CrudRepository<StoresEntity, Integer> {
}
