package com.modelmapperproject.service.impl;

import com.modelmapperproject.dto.UserDto;
import com.modelmapperproject.model.User;
import com.modelmapperproject.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private ModelMapper modelMapper;

    //dependency Injection
    public UserServiceImpl(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    //convert model into dto
    //useful over sending datas over the api
    @Override
    public UserDto getUserDtoFromUser() {
        User user = new User();
        user.setUserId(1);
        user.setEmail("user@gmail.com");
        user.setFirstName("user");
        user.setLastName("last");
        user.setStatus(true);
        UserDto userDto = modelMapper.map(user, UserDto.class);
        //adding custom extra field in DTO
        userDto.setFullName(userDto.getFirstName() + " " + userDto.getLastName());
        return userDto;

    }

    //convert dto into model
    //useful for create
    @Override
    public User getUserFromUserDto() {
        UserDto userDto = new UserDto();
        userDto.setUserId(1);
        userDto.setEmail("userDto@gmail.com");
        userDto.setFirstName("userDto");
        userDto.setLastName("last");
        userDto.setStatus(true);
        return modelMapper.map(userDto, User.class);
    }


}
