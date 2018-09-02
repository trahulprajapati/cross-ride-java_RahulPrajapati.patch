/**
 * 
 */
package com.crossover.techtrial.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.crossover.techtrial.model.Person;
import com.crossover.techtrial.model.Ride;
import com.crossover.techtrial.repositories.PersonRepository;

/**
 * @author crossover
 *
 */
@Service
public class PersonServiceImpl implements PersonService{

	private  EntityManager em1;
  @Autowired
  PersonRepository personRepository;
  
  /* (non-Javadoc)
   * @see com.crossover.techtrial.service.PersonService#getAll()
   */
  @Override
  public List<Person> getAll() {
    List<Person> personList = new ArrayList<>();
    personRepository.findAll().forEach(personList::add);
    return personList;
    
  }
  
  public Person save(Person p) {
    return personRepository.save(p);
  }

 /* africanContinents = session.createQuery(
	        "from Continent cont join cont.countries ctry " +
	        "where cont.name = 'Africa'")
	        .list();
  public List<Person> getTopFive(){
	  Session session=null;
	  List<Person> topfive = new ArrayList<>();
	  em1.createQuery("from person pr join pr.ride rd",Person.class);
			   
			 // "SELECT name, start_time,end_time,distance from person inner join "
			  );
	return null;
	  
  }
  */
  @Override
  public Person findById(Long personId) {
    Optional<Person> dbPerson = personRepository.findById(personId);
    return dbPerson.orElse(null);
  }
  
  

}
