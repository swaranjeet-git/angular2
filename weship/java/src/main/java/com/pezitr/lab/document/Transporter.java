package com.pezitr.lab.document;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class Transporter {
	
	@Id
	private Integer id;
	
	@DBRef
	private CompanyDetails companyDetails;
	
	@Field("interestedIn")
	private List<Integer> interestedIn;
	
	@DBRef
	private User user;
	
	// adding more than one vehicle, so replaced single object with List
//	@DBRef
//	private UserVehicleDetails vehicleDetail;
	
	// Added by swarnjeet
	@DBRef
	private List<UserVehicleDetails> vehicles;
	
		
	/*@DBRef
	private List<UserVehicleDocument> personalDocs;*/
	
	
	public Transporter(){
		
	}
	
//	public Transporter(CompanyDetails companyDetails ,List<Integer> interestedIn,User user, UserVehicleDetails vehicleDetail  /*,List<UserVehicleDocument> personalDocs*/){
	public Transporter(CompanyDetails companyDetails ,List<Integer> interestedIn,User user, UserVehicleDetails vehicleDetail  ,List<UserVehicleDetails> vehicles){
		
		super();
		
		this.user = user;
		this.companyDetails = companyDetails;
		this.interestedIn = interestedIn;
		
		//this.vehicleDetail = vehicleDetail;
		this.vehicles = vehicles;
		
		/*this.personalDocs = personalDocs;*/
		
	}

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	
	public CompanyDetails getCompanyDetails() {
		return companyDetails;
	}

	public void setCompanyDetails(CompanyDetails companyDetails) {
		this.companyDetails = companyDetails;
	}

		public List<Integer> getInterestedIn() {
		return interestedIn;
	}

	public void setInterestedIn(List<Integer> interestedIn) {
		this.interestedIn = interestedIn;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

//	public UserVehicleDetails getVehicleDetail() {
//		return vehicleDetail;
//	}
//
//	public void setVehicleDetail(UserVehicleDetails vehicleDetail) {
//		this.vehicleDetail = vehicleDetail;
//	}

	

	public List<UserVehicleDetails> getVehicles() {
		return vehicles;
	}

	public void setVehicles(List<UserVehicleDetails> vehicles) {
		this.vehicles = vehicles;
	}
	
	

	/*public List<UserVehicleDocument> getPersonalDocs() {
		return personalDocs;
	}

	public void setPersonalDocs(List<UserVehicleDocument> personalDocs) {
		this.personalDocs = personalDocs;
	}*/

	

}
