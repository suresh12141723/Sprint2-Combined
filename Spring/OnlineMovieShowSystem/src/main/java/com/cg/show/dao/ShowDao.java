package com.cg.show.dao;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

import com.cg.show.entity.Movie;
import com.cg.show.entity.Show;




public interface ShowDao {
	public boolean addshow(Show show);

	public List<Show> reterive();

	public Show findById(int showId);

	public void deleteshow(int showId);

	public void update(Show show);
	
	public int getMaxShowId(int showId);

}
