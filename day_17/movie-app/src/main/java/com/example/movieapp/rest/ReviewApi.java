package com.example.movieapp.rest;

import com.example.movieapp.entity.Review;
import com.example.movieapp.model.request.CreateReviewRequest;
import com.example.movieapp.model.request.UpdateReviewRequest;
import com.example.movieapp.service.ReviewService;
import lombok.RequiredArgsConstructor;
<<<<<<< HEAD
import org.apache.coyote.Response;
=======
>>>>>>> f26bf26f2b3ddaf48ba9fdfef84ec05492b9ebee
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/reviews")
@RequiredArgsConstructor
public class ReviewApi {
    private final ReviewService reviewService;
<<<<<<< HEAD
    //Tạo review-Post
    @PostMapping
    public ResponseEntity<?> createReview(@RequestBody CreateReviewRequest request){
        Review review = reviewService.createReview(request);
        return  ResponseEntity.ok(review);
    }

    //Cập nhật review-Put
    @PutMapping("/{id}")
    public ResponseEntity<?> updateReview(@PathVariable Integer id,@RequestBody UpdateReviewRequest request){
        Review review = reviewService.updateReview(id,request);
        return  ResponseEntity.ok(review);

    }

    //Xóa review-Delete
    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteReview(@PathVariable Integer id){
=======

    // Tạo review - POST
    @PostMapping
    public ResponseEntity<?> createReview(@RequestBody CreateReviewRequest request) {
        Review review = reviewService.createReview(request);
        return ResponseEntity.ok(review);
    }

    // Cập nhật review - PUT
    @PutMapping("/{id}")
    public ResponseEntity<?> updateReview(@PathVariable Integer id, @RequestBody UpdateReviewRequest request) {
        Review review = reviewService.updateReview(id, request);
        return ResponseEntity.ok(review);
    }

    // Xóa review - DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteReview(@PathVariable Integer id) {
>>>>>>> f26bf26f2b3ddaf48ba9fdfef84ec05492b9ebee
        reviewService.deleteReview(id);
        return ResponseEntity.ok().build();
    }
}
