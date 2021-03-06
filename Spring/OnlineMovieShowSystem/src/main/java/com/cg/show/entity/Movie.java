package com.cg.show.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import lombok.Data;
@Data
@Entity
@Table(name="lpu_movie_movie")
public class Movie {
	
	@Id
	@Column(name="movie_id")
	private int movieId;
	@Column(name="movie_name", length=25)
	private String movieName;
	@Column(name="language", length=25)
	private String language;
	@Column(name="director", length=25)
	private String director;
	@Column(name="genre", length=25)
	private String genre;
	

	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	
	
	
	
	
	
	
}

