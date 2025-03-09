package com.dinfactory.dincode.ServiceImpl;

import com.dinfactory.dincode.DTO.UserDTO;
import com.dinfactory.dincode.Repository.UserRepository;
import com.dinfactory.dincode.Service.DincodeService;
import com.dinfactory.dincode.Util.ConvertDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DincodeServiceImpl implements DincodeService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    ConvertDTO convertDTO;

    @Override
    public List<UserDTO> addUser(List<UserDTO> userDTOList){
        return convertDTO.UserToUserDTO(userRepository.saveAll(convertDTO.UserDTOToUser(userDTOList)));
    }
}
