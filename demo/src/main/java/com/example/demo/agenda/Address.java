package com.example.demo.agenda;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
public class Address {

	@Id
	@GeneratedValue
	private Long id;

	private String street;

	private Long numberHouse;

	private String district;

	private String complementary;

	private String city;

	private String state;

	private String postalCode;
	
	
	public Address(String street, Long numberHouse, String district, String complementary, String city, String state,
			String postalCode) {
		super();
		this.street = street;
		this.numberHouse = numberHouse;
		this.district = district;
		this.complementary = complementary;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public Long getNumberHouse() {
		return numberHouse;
	}

	public void setNumberHouse(Long numberHouse) {
		this.numberHouse = numberHouse;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getComplementary() {
		return complementary;
	}

	public void setComplementary(String complementary) {
		this.complementary = complementary;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
}