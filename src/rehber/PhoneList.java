/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rehber;
import java.util.ArrayList;
import java.util.List;

public class PhoneList 
{
	private List<Person> personList;
	
	public PhoneList()
	{
		personList = new ArrayList<Person>();
	}
	
	public void add(Person p)
	{
		personList.add(p);
	}
	
	public void delete(String name)
	{
		for(int i=0;i<personList.size();i++)
		{
			if(personList.get(i).getName().equalsIgnoreCase(name))
			{
				personList.remove(i);
			}
		}
	}
	
	public void update(Person p)
	{
		for(int i=0;i<personList.size();i++)
		{
			if(personList.get(i).getName().equalsIgnoreCase(p.getName()))
			{
				personList.set(i, p);
			}
		}
	}
	
	public Phone search(String name)
	{
		Phone output = null;
		
		for(int i=0;i<personList.size();i++)
		{
			if(personList.get(i).getName().equalsIgnoreCase(name))
			{
				output = personList.get(i).getPhone();
			}
		}
		
		return output;
	}
	
	public String display()
	{
		String output = "";
		
		for(int i=0;i<personList.size();i++)
		{
			output += personList.get(i) + "\n";
		}
		
		return output;
	}

}

