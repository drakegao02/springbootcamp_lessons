package com.drakegao.springbootcamp;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@Autowired
	ActorRepository actorRepository;
	
	@RequestMapping("/")
	public String index(Model model) {
		// first let's create an actor
		Actor actor = new Actor();
		actor.setName("Sandra Bullock");
		actor.setRealname("Sandra Mae Bullowski");
		
		// create movie
		Movie movie = new Movie();
		movie.setTitle("Emoji Movie");
		movie.setYear(2017);
		movie.setDescription("About Emojis....");
		
		// add movie
		Set<Movie> movies = new HashSet<Movie>();
		movies.add(movie);
		
		// add the list of movies to the actor's movie list
		actor.setMovies(movies);
		
		// save the actor the db
		actorRepository.save(actor);
		
		// get all actors from db
		model.addAttribute("actors", actorRepository.findAll());
		return "index";
	}
}
