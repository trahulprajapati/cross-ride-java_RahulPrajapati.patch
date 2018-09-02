package com.crossover.unittest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.crossover.techtrial.controller.PersonController;
import com.crossover.techtrial.model.Person;
import com.crossover.techtrial.service.PersonService;
import com.crossover.techtrial.service.PersonServiceImpl;
import java.util.List;;
public  class topdriver  {

	//@SuppressWarnings("null")
	@Test
	public void test() {
		//fail("Not yet implemented");
		PersonService personService = null ;
		List<Person> pr=personService.getAll();
		//PersonServiceImpl ps=new PersonServiceImpl();
		//List<Person> pr=ps.getAll();	
		for (Person s:pr){
			String ss=s.toString();
			//String r=s.getEmail();
			//String rr=s.getName();
			System.out.println("all is ="+ss);
			
		}
			
			
		//}
		//assertFalse(personService.getAll().isEmpty());
		
		
	}

}
