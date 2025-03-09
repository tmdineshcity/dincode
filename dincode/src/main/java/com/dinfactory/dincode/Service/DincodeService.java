package com.dinfactory.dincode.Service;

import com.dinfactory.dincode.DTO.UserDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DincodeService {

    List<UserDTO> addUser(List<UserDTO> userDTOList);

}
