package com.example.movieapp.rest;

<<<<<<< HEAD
import com.example.movieapp.model.request.LoginRequest;

=======
import com.example.movieapp.entity.Review;
import com.example.movieapp.model.request.CreateReviewRequest;
import com.example.movieapp.model.request.LoginRequest;
>>>>>>> f26bf26f2b3ddaf48ba9fdfef84ec05492b9ebee
import com.example.movieapp.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/auth")
@RequiredArgsConstructor
public class AuthApi {
    private final AuthService authService;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest request) {
        authService.login(request);
        return ResponseEntity.ok().build();
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> f26bf26f2b3ddaf48ba9fdfef84ec05492b9ebee
