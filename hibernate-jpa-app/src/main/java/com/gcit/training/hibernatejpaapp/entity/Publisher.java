package com.gcit.training.hibernatejpaapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_publisher")
public class Publisher {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer publisherId;
    
    @Column(name = "publisherName")
	private String publisherName;
    
    @Column(name = "publisherAddress")
	private String publisherAddress;
    
    @Column(name = "publisherPhone")
    private String publisherPhone;
	
	public String getPublisherPhone() {
		return publisherPhone;
	}
	public void setPublisherPhone(String publisherPhone) {
		this.publisherPhone = publisherPhone;
	}
	public Integer getPublisherId() {
		return publisherId;
	}
	public void setPublisherId(Integer publisherId) {
		this.publisherId = publisherId;
	}
	public String getPublisherName() {
		return publisherName;
	}
	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}
	public String getPublisherAddress() {
		return publisherAddress;
	}
	public void setPublisherAddress(String publisherAddress) {
		this.publisherAddress = publisherAddress;
	}
	
}
