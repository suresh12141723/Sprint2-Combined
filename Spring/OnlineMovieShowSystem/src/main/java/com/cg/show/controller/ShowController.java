package com.cg.show.controller;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;



import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.show.exception.ShowException;
import com.cg.show.entity.Movie;
import com.cg.show.entity.Show;
import com.cg.show.exception.ShowException;
import com.cg.show.service.ShowService;


@CrossOrigin(origins = "http://localhost:4200")

@RestController
public class ShowController {
	
	@Autowired
	ShowService showservice;
	

	/********************************************************************************************************************
	*       @author           Javvadi Suresh
	*       Description       It is a Controller method for adding the show details
	*       version           1.0
	*       created date      21-APR-2020
	********************************************************************************************************************/
	@PostMapping("/show")
	public ResponseEntity<String> saveBook(@RequestBody Show show) {
        showservice.addshow(show);;
        
		return new ResponseEntity<String>("Show Added Successfully",HttpStatus.OK);
	}
	
	

	/********************************************************************************************************************
	*       @author           Javvadi Suresh
	*       Description       It is a Controller method for getting the show details
	*       version           1.0
	*       created date      21-APR-2020
	********************************************************************************************************************/
	@GetMapping("/getshow")
    public ResponseEntity<List<Show>> getshowlist() {
			List<Show> list = showservice.reterive();
			return new ResponseEntity<List<Show>>(list,HttpStatus.OK);
	}
	
	

	/********************************************************************************************************************
	*       @author           Javvadi Suresh
	*       Description       It is a Controller for deleting the show details BY  Id
	*       version           1.0
	*       created date      22-APR-2020
	********************************************************************************************************************/
	
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Object> deleteShow(@PathVariable("id") int id)
	{
		showservice.deleteshow(id);
		return new ResponseEntity<>("Deleted",HttpStatus.OK);
	}
	
	
	
	

	/********************************************************************************************************************
	*       @author           Javvadi Suresh
	*       Description       It is a Controller mehod for getting the show details By ID
	*       version           1.0
	*       created date      22-APR-2020
	********************************************************************************************************************/
	@GetMapping("/view/{id}")
	public ResponseEntity<Show> viewShow(@PathVariable("id") int id)
	{
		Show show=showservice.findById(id);
		return new ResponseEntity<Show>(show,HttpStatus.OK);
		
	}
	
	

	/********************************************************************************************************************
	*       @author           Javvadi Suresh
	*       Description       It is a Controller method for Updating the show details
	*       version           1.0
	*       created date      22-APR-2020
	********************************************************************************************************************/
	@PutMapping("/update/{id}")
	public ResponseEntity<Object> updateShow(@PathVariable("id") int id,@RequestBody Show show)
	{
		showservice.update(id,show);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
