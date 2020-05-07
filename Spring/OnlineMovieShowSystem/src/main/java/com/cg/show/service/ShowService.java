package com.cg.show.service;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

import com.cg.show.entity.Movie;
import com.cg.show.entity.Show;



public interface ShowService {
	public void addshow(Show show);

	public List<Show> reterive();

	public Show findById(int showId);

	public Boolean deleteshow(int showId);

	public void update(int showId,Show show);


}