/**
 * @author SuryaKiranKuppa
 *
 * 
 */
package com.acutionplus.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.acutionplus.entity.Product;


@Repository
public interface ProductDao extends MongoRepository<Product, Integer> {

}
