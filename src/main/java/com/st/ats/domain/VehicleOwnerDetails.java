package com.st.ats.domain;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.format.annotation.DateTimeFormat;


import lombok.Data;
/**
 * This class is able to capture all data comes in VehicleOwnerDetails Ui 
 * and send in service to store in database 
 * and used that class refrence in VehicleSummary class to get all details related to owner
 * 
 * @author Jeeban
 *
 */
@Data
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class VehicleOwnerDetails {

	private Integer vhclOwnerid;
	private String fname;
	private String lname;
	@DateTimeFormat(pattern = "MM/dd/yyyy")
	private Date dob;
	private String gender;
	private String email;
	private Long phno;
	private String zzn;
}
