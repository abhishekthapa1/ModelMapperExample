package com.modelmapperproject.service;

import com.modelmapperproject.dto.UserDto;
import com.modelmapperproject.model.User;

public interface UserService {
    public UserDto getUserDtoFromUser();
    public User getUserFromUserDto();
}
