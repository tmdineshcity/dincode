package com.dinfactory.dincode.DTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.validation.constraints.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private long userId;
    @NotBlank(message = "Name should not be blank")
//    @Min(value = 2, message = "Name should be more than 2 characters")
//    @Max(value = 10, message = "Name should not be more than 100 characters")
    @Size(min = 2 , max = 10 , message = "Please enter name between 2 and 10 characters")
    private String userName;
    @Email(message = "Please enter a valid emailId")
    private String emailId;
    @Pattern(regexp = "^[0-9]{10}$", message = "Mobile No should have 10 digits")
    private String mobileNo;
    @DateTimeFormat
    private LocalDateTime createTime;
}
