package com.example.movieapp.model.request;

import lombok.*;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CreateReviewRequest {
    String content;
    Integer rating;
    Integer movieId;
}
