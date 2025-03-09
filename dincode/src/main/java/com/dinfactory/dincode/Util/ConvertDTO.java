package com.dinfactory.dincode.Util;

import com.dinfactory.dincode.DTO.UserDTO;
import com.dinfactory.dincode.Entity.User;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class ConvertDTO {

     @Autowired
     ModelMapper modelMapper;

    public List<User> UserDTOToUser(List<UserDTO> userDTOList){
        List<User> userList = new ArrayList<>();
        userDTOList.forEach(userDTO -> userList.add(modelMapper.map(userDTO, User.class)));
        return userList;
    }

    public List<UserDTO> UserToUserDTO(List<User> userList){
        List<UserDTO> userDTOList = new ArrayList<>();
        userList.forEach(user -> userDTOList.add(modelMapper.map(user, UserDTO.class)));
        return userDTOList;
    }
}
