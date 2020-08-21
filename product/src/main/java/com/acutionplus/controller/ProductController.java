/**
 * @author SuryaKiranKuppa
 *
 */
package com.acutionplus.controller;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.acutionplus.dao.ProductDao;
import com.acutionplus.entity.Product;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

@RestController
public class ProductController {

	@Autowired
	ProductDao pdao;
	Product product = new Product();

	// Connection to MongoDb
	
	MongoClient mongoClient = MongoClients.create(System.getProperty("mongodb.uri"));
	MongoDatabase database = mongoClient.getDatabase("auctionplus");
	MongoCollection<Document> collection = database.getCollection("Product");

	// insert Product Values
	
	Document Product = new Document();
	
	

}
