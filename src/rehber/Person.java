/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rehber;

public class Person 
{
	private String name;
	private Phone phone;
	
	public Person(String name, Phone phone) 
	{
		this.name = name;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", phone=" + phone + "]";
	}
	
	

}

