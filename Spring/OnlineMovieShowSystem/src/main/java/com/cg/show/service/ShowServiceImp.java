package com.cg.show.service;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.show.dao.ShowDao;
import com.cg.show.entity.Movie;
import com.cg.show.entity.Show;
import com.cg.show.exception.NoShowFoundException;
import com.cg.show.exception.ShowIdNotFoundException;


@Transactional
@Service
public class ShowServiceImp implements ShowService{
	
	@Autowired
	ShowDao showdao;
	
	
	/********************************************************************************************************************
	*       @author           Javvadi Suresh
	*       Description       It is a service to add the show details
	*       version           1.0
	*       created date      21-APR-2020
	********************************************************************************************************************/
	@Override
	public void addshow(Show show) {
		showdao.addshow(show);
	}
	
	

	/********************************************************************************************************************
	*       @author           Javvadi Suresh
	*       Description       It is a service to fetch the show details
	*       version           1.0
	*       created date      21-APR-2020
	********************************************************************************************************************/
	@Override
	public List<Show> reterive() {
		if(showdao.reterive().size()>0) {
		List<Show> list=showdao.reterive();
		return list;
		}
		throw new NoShowFoundException("No SHow is Available");
	}
	
	

	/********************************************************************************************************************
	*       @author           Javvadi Suresh
	*       Description       It is a service to find  the show details by ID
	*       version           1.0
	*       created date      22-APR-2020
	********************************************************************************************************************/
	@Override
	public Show findById(int id) {
		Show show=showdao.findById(id);
		if(show==null)
		{
			throw new ShowIdNotFoundException("Show ID not found , please entera valid Id");
		}
		return show;
	}
	
	

	/********************************************************************************************************************
	*       @author           Javvadi Suresh
	*       Description       It is a service to delete the show details
	*       version           1.0
	*       created date      22-APR-2020
	********************************************************************************************************************/
	@Override
	public Boolean deleteshow(int id) {
		showdao.deleteshow(id);
		return null;
		
	}
	
	

	/********************************************************************************************************************
	*       @author           Javvadi Suresh
	*       Description       It is a service to Update the show details
	*       version           1.0
	*       created date      22-APR-2020
	********************************************************************************************************************/
	@Override
	public void update(int showId,Show show) {
		Show updatedShow=showdao.findById(showId);
		updatedShow.setShowName(show.getShowName());
		updatedShow.setScreenName(show.getScreenName());
		updatedShow.setSeats(show.getSeats());
		updatedShow.setShowendTime(show.getShowstartTime());
		updatedShow.setShowstartTime(show.getShowendTime());
		showdao.update(updatedShow);
		
	}

}


