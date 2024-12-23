package dev.sherpa.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/reviews")
public class ReviewController {
    @Autowired
    private ReviewService reviewService;

    @PostMapping
    public ResponseEntity<Review> createReview(@RequestBody Map<String, String> paylod) {

        return new ResponseEntity<Review>(reviewService.creatReview(paylod.get("reviewBody"), paylod.get("imdbId")), HttpStatus.OK);

    }
}
