package com.pezitr.lab.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.pezitr.lab.document.CompanyDetails;
import com.pezitr.lab.document.User;

public interface CompanyDetailsRepository extends MongoRepository<CompanyDetails, Integer> {
	//public CompanyDetails findById(String itemId);

}
