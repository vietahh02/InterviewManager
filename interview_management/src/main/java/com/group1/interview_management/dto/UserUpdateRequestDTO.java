package com.group1.interview_management.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserUpdateRequestDTO {
    private UserDTO userDTO;
    private UserContactDTO UserContactDTO;

}
