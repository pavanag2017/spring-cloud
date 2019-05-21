package cts.cloud.example.demo.movie.info.resources;

import cts.cloud.example.demo.movie.info.model.Movie;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieInfoResource {

    @RequestMapping("/{movieId}")
    public Movie getMovieInfo(@PathVariable ("movieId") String id){
        return new Movie(id, "Test Movie Name");
    }

}
