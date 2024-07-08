package uz.abdurahmon.socailuserservice.service;

import uz.abdurahmon.socailuserservice.model.entity.User;
import uz.abdurahmon.socailuserservice.model.request.UserRequest;

import java.util.List;

public interface UserService {
    String register(UserRequest request);

    List<User> getAll();
}