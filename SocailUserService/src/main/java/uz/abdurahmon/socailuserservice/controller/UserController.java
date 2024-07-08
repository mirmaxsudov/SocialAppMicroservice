package uz.abdurahmon.socailuserservice.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import uz.abdurahmon.socailuserservice.model.entity.User;
import uz.abdurahmon.socailuserservice.model.request.UserRequest;
import uz.abdurahmon.socailuserservice.service.UserService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth")
public class UserController {
    private final UserService userService;

    @PostMapping("/register")
    public String register(@RequestBody @Valid UserRequest request) {
        return userService.register(request);
    }

    @GetMapping
    public List<User> getAll() {
        return userService.getAll();
    }
}