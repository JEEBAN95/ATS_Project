package com.st.ats.domain;



import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

/**
 * this class used to recieve the data from Vehicle details UI
 * when then request comes in our application
 * and also used refrence of that class in vehicle summary
 * 
 * @author Jeeban
 *
 */
@Data
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class VehicleDetails {

	private Integer vhicleDtlsId;
	private String vehicleType;
	private Integer mfdYear;
	private String companyName;
	private String color;
		
}
