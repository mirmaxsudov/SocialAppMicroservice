package uz.abdurahmon.socailuserservice.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uz.abdurahmon.socailuserservice.model.entity.User;
import uz.abdurahmon.socailuserservice.model.request.UserRequest;
import uz.abdurahmon.socailuserservice.repository.UserRepository;
import uz.abdurahmon.socailuserservice.service.UserService;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public String register(UserRequest request) {
        User user = User.builder()
                .bio(request.bio())
                .name(request.name())
                .email(request.email())
                .phone(request.phone())
                .surname(request.surname())
                .username(request.username())
                .createdAt(LocalDateTime.now())
                .build();

        userRepository.save(user);
        return "User created successfully";
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }
}