package com.pezitr.lab.services;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Pageable;

//import com.pezitr.lab.document.shipper.Listing;
import com.pezitr.lab.document.Listing;

public interface OrderListingService {

	//public List<Listing> getAll(Map<String, String> queryParameters, Pageable pageable);
	public List<Listing> getAll();
	
	public long getCount(Map<String, String> queryParameters);

	public List<String> findDistinctFromCity();

	public List<String> findDistinctToCity();
}
