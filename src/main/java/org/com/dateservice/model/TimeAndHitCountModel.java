package org.com.dateservice.model;

/**
 * @author Kunal Uttarkar
 * Spring Model Class
 */
public class TimeAndHitCountModel {
	String dateString;
	String hitcount;
	public TimeAndHitCountModel(String dateString, String hitcount) {
		super();
		this.dateString = dateString;
		this.hitcount = hitcount;
	}
	/**
	 * @return the dateString
	 */
	public String getDateString() {
		return dateString;
	}
	/**
	 * @param dateString the dateString to set
	 */
	public void setDateString(String dateString) {
		this.dateString = dateString;
	}
	/**
	 * @return the hitcount
	 */
	public String getHitcount() {
		return hitcount;
	}
	/**
	 * @param hitcount the hitcount to set
	 */
	public void setHitcount(String hitcount) {
		this.hitcount = hitcount;
	}

}
