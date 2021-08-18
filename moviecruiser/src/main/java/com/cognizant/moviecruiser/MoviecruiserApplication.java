package com.cognizant.moviecruiser;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.moviecruiser.model.Movie;
import com.cognizant.moviecruiser.service.MovieService;
import com.cognizant.moviecruiser.util.DateUtil;

@SpringBootApplication
public class MoviecruiserApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(MoviecruiserApplication.class);

	private static MovieService movieService;

	public static void main(String[] args) throws ParseException {
		LOGGER.info("Inside Main");
		ApplicationContext context = SpringApplication.run(MoviecruiserApplication.class, args);

		movieService = context.getBean(MovieService.class);

		LOGGER.info("Finished Storing...");
//		addMoive();
		testGetMovieListAdmin();
		testGetMovieListCustomer();
//		testModifyMovie();
//		testGetMovieById();
	}

//	private static void addMoive() throws ParseException {
//		LOGGER.info("START");
//		Movie movie = new Movie();
//		movie.setId(6);
//		movie.setTitle("Winter Solder");
//		movie.setActive(true);
//		movie.setBoxOffice("$1,700,108,187");
//		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//		Date dol = sdf.parse("25/06/2019");
//		movie.setDateOfLaunch(dol);
//		movie.setGenre("Super Hero");
//		movie.setHasTeaser(false);
//		movieService.saveNewMovie(movie);
//		LOGGER.info("END");
//	}

	public static void testGetMovieListCustomer() {
		LOGGER.info("START");
		List<Movie> activeMovies = movieService.getMovieListCustomer();
		LOGGER.debug("Movies: {}", activeMovies);
		LOGGER.info("END");
	}

	public static void testGetMovieListAdmin() {
		LOGGER.info("START");
		List<Movie> adminMovies = movieService.getMovieListCustomer();
		LOGGER.debug("Movies: {}", adminMovies);
		LOGGER.info("END");
	}

//	public static void testModifyMovie() {
//		LOGGER.info("START");
//		Movie movie = movieService.getMovie(2);
//		movieService.modifyMovie(2, movie);
//		LOGGER.debug("Modified Movie: {}", movie);
//		LOGGER.info("END");
//	}
	
	public static void testGetMovieById() {
		LOGGER.info("START");
		Movie movie = movieService.getMovie(1);
		LOGGER.debug("Movie: {}", movie);
		LOGGER.info("END");
	}

}
