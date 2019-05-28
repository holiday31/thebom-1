package net.skhu.document;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "Social_worker")
public class SocialWorker {
	
	@Id
	private int id;
	
	@Field(value="name")
	private String name;
	
	@Field(value="phone")
	private String phone;
	
	@Field(value="city")
	private String city;
	
	@Field(value="district")
	private String district;
	
	@Field(value="neighborhood")
	private String neighborhood;
	
	@Field(value="ranks")
	private String ranks;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getNeighborhood() {
		return neighborhood;
	}

	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}

	public String getRanks() {
		return ranks;
	}

	public void setRanks(String ranks) {
		this.ranks = ranks;
	}

	@Override
	public String toString() {
		return "SocialWorker [id=" + id + ", name="+ name + "]";
	}
	
	

}