package cts.cloud.example.demo.rating.resources.models;

public class Rating {
    String movieId;
    int rating;


    public Rating(String movieId, int rating) {
        this.movieId = movieId;
        this.rating = rating;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Rating{" +
                "movieId='" + movieId + '\'' +
                ", rating=" + rating +
                '}';
    }
}
