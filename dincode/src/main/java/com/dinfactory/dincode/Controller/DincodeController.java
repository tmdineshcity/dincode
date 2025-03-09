package com.dinfactory.dincode.Controller;

import com.dinfactory.dincode.DTO.UserDTO;
import com.dinfactory.dincode.ServiceImpl.DincodeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/dinesh")
public class DincodeController {

    @Autowired
    DincodeServiceImpl dincodeServiceImpl;

    @PostMapping("/addUser")
    public List<UserDTO> addUser(@RequestBody List<UserDTO> userDTOList) throws Exception{
        try {
            return dincodeServiceImpl.addUser(userDTOList);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }




}
