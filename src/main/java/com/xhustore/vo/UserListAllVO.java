package com.xhustore.vo;

import java.util.List;

import com.xhustore.dto.UserDTO;
import com.xhustore.enums.UserServiceExecutionEnum;

public class UserListAllVO {

    private UserServiceExecutionEnum userServiceExecutionEnum;
    private List<UserDTO> userDTOList;

    public UserListAllVO(UserServiceExecutionEnum userServiceExecutionEnum, List<UserDTO> userDTOList) {
        super();
        this.userServiceExecutionEnum = userServiceExecutionEnum;
        this.userDTOList = userDTOList;
    }

    public UserServiceExecutionEnum getUserServiceExecutionEnum() {
        return userServiceExecutionEnum;
    }

    public List<UserDTO> getUserDTOList() {
        return userDTOList;
    }

}
