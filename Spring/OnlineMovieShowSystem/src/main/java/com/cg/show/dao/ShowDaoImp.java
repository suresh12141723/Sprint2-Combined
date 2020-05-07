package com.cg.show.dao;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;

import com.cg.show.entity.Movie;
import com.cg.show.entity.Show;

@Transactional
@Repository
public class ShowDaoImp implements ShowDao{
	
	@PersistenceContext
	EntityManager entitymanager;
	static int id=4000;
	Show show =new Show();
	
	/**************************************************************************************************
	 *Method:add Show
	 *description:To add the details into the database
	 *showId                -primary Key
	 *@throws ShowException -it is raised due to null id
	 *created by               -Javvadi Suresh
	 *created date             -21-APR-2020
	**************************************************************************************************/
	@Override
	public boolean addshow(Show show) {
		if(true)
		{
			int showId = (getMaxShowId(show.getShowId())+1);
			show.setShowId(showId);
			entitymanager.persist(show); 
			return true; 	
		}
		return false;
			

	}
	
	/**************************************************************************************************
	 *Method:view Show
	 *description:To fetch the details from the database
	 *showId                -primary Key
	 *@returns                 -all the show details
	 *@throws ShowException - when shows not exist
	 *created by               -Javvadi Suresh
	 *created date             -21-APR-2020
	**************************************************************************************************/
	@Override
	public List<Show> reterive() {
		String Qstr="SELECT show from Show show";
		TypedQuery<Show> query=entitymanager.createQuery(Qstr,Show.class);
		return query.getResultList();
	}
	
	
	/**************************************************************************************************
	 *Method:find Show
	 *description:To fetch the particular show details from database the database
	 *showId                -primary Key
	 *@returns                 -all the show details
	 *@throws ShowException -it is raised when we enter id which not exist
	 *created by               -Javvadi Suresh
	 *created date             -22-APR-2020
	**************************************************************************************************/
	@Override
	public Show findById(int id) {
		return entitymanager.find(Show.class, id);
		
	}
	
	
	/**************************************************************************************************
	 *Method:delete Show
	 *description:To delete the  show details from database the database
	 *showId                -primary Key
	 *@returns                -deleted Successfully
	 *@throws ShowException -it is raised when we enter id which not exist
	 *created by               -Javvadi Suresh
	 *created date             -22-APR-2020
	**************************************************************************************************/
	@Override
	public void deleteshow(int id) {
		Show tr=entitymanager.find(Show.class, id);
		entitymanager.remove(tr);
		
	}
	
	
	
	/**************************************************************************************************
	 *Method:Update Show Details
	 *description:To Update the  show details from database the database
	 *showId                -primary Key
	 *@returns                 -Updated values
	 *@throws ShowException -it is raised when we enter id which not exist
	 *created by               -Javvadi Suresh
	 *created date             -22-APR-2020
	**************************************************************************************************/
	@Override
	public void update(Show show ) {
	entitymanager.persist(show);
	
	}
	
	@Override
	public int getMaxShowId(int showId) {
		String jpql = "SELECT show from Show show";
		TypedQuery<Show> query = entitymanager.createQuery(jpql, Show.class);
	    List<Show> showList= query.getResultList();
	    if(!showList.isEmpty())
	    {
	    	String str = "SELECT max(showId) from Show";
	    	TypedQuery<Integer> theatreid = entitymanager.createQuery(str,Integer.class);
	    	int num = theatreid.getSingleResult();
	    	return num;
	    	
	    }
	    else
	    	return id;
	}
}



