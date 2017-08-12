package com.compit.analytics.common;

import java.util.Date;

import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;

public class H2HomeDTO {

	@Id
	@Field("homeid")
	private String homeId;

	@Field("zipcode")
	private String zipCode;

	@Field
	private String price;

	@Field("sqfeet")
	private String sqFeet;

	//:TODO: Convert it to String Enumeration
	@Field("hometype")
	private String homeType;

	@Field
	private String address;

	@Field("kto6shcoolpoint")
	private String kTo6Shcoolpoint;

	@Field("7to9shcoolpoint")
	private String sevenTo9shcoolpoint;

	@Field("10to12shcoolpoint")
	private String tenTo12SchoolPoint;

	@Field("created_date")
	private Date createdDate;

	@Field("modified_date")
	private Date modifiedDate;

	@Field("created_by")
	private String createdBy;

	@Field("modified_by")
	private String modifiedBy;


	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getkTo6Shcoolpoint() {
		return kTo6Shcoolpoint;
	}

	public void setkTo6Shcoolpoint(String kTo6Shcoolpoint) {
		this.kTo6Shcoolpoint = kTo6Shcoolpoint;
	}

	public String getSevenTo9shcoolpoint() {
		return sevenTo9shcoolpoint;
	}

	public void setSevenTo9shcoolpoint(String sevenTo9shcoolpoint) {
		this.sevenTo9shcoolpoint = sevenTo9shcoolpoint;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public String getHomeId() {
		return homeId;
	}

	public void setHomeId(String homeId) {
		this.homeId = homeId;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getSqFeet() {
		return sqFeet;
	}

	public void setSqFeet(String sqFeet) {
		this.sqFeet = sqFeet;
	}

	public String getHomeType() {
		return homeType;
	}

	public void setHomeType(String homeType) {
		this.homeType = homeType;
	}

	public String getTenTo12SchoolPoint() {
		return tenTo12SchoolPoint;
	}

	public void setTenTo12SchoolPoint(String tenTo12SchoolPoint) {
		this.tenTo12SchoolPoint = tenTo12SchoolPoint;
	}

	@Override
	public String toString() {
		return "H2HomeDTO [homeId=" + homeId + ", zipCode=" + zipCode + ", price=" + price + ", sqFeet=" + sqFeet
				+ ", homeType=" + homeType + ", address=" + address + ", kTo6Shcoolpoint=" + kTo6Shcoolpoint
				+ ", sevenTo9shcoolpoint=" + sevenTo9shcoolpoint + ", tenTo12SchoolPoint=" + tenTo12SchoolPoint
				+ ", createdDate=" + createdDate + ", modifiedDate=" + modifiedDate + ", createdBy=" + createdBy
				+ ", modifiedBy=" + modifiedBy + "]";
	}
}
