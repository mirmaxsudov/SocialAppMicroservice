package uz.abdurahmon.socailuserservice.model.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import uz.abdurahmon.socailuserservice.validation.UniqueEmail;

public record UserRequest(
        @NotBlank(message = "Name is required") String name,
        @NotBlank(message = "Surname is required") String surname,
        @NotBlank(message = "Username is required") String username,
        @NotBlank(message = "Bio is required") String bio,

        @UniqueEmail
        @NotBlank(message = "Email is required")
        @Pattern(regexp = "^[\\w-.]+@([\\w-]+\\.)+[\\w-]{2,4}$", message = "Email is not valid")
        String email,

        @NotBlank(message = "Phone is required")
        @Pattern(regexp = "^\\+998\\d{9}$", message = "Phone number is not valid")
        String phone
) {
}