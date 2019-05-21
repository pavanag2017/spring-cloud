package cts.cloud.example.demo.rating.resources;

import cts.cloud.example.demo.rating.resources.models.Rating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ratingsData")
public class RatingDataResource {

    @RequestMapping("/{movieId}")
    public Rating getRating(@PathVariable ("movieId") String movieId){
        return  new Rating(movieId, 4);
    }
}
