package com.safdar.angular.repository;

import org.springframework.data.repository.CrudRepository;

import com.safdar.angular.model.Items;

public interface ItemRepositiry extends CrudRepository<Items, Long>{

}
