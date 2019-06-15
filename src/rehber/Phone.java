/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rehber;


public class Phone 
{
	private String countryCode;
	private String cityCode;
	private String number;	
	
	public Phone(String countryCode, String cityCode, String number) {
		this.countryCode = countryCode;
		this.cityCode = cityCode;
		this.number = number;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCityCode() {
		return cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Phone [countryCode=" + countryCode + ", cityCode=" + cityCode + ", number=" + number + "]";
	}
	
	
	

}

