package dev.sherpa.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "movies")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    @Id
    private ObjectId id;
    private String imdbId;
    private String title;

    private String releaseDate;
    private String trailerLing;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;

    //TODO this is manual reference type there are different types in mongodb
    @DocumentReference
    private List<Review> reviewIds;



}
