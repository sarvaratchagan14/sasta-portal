package com.sastabackend.service.user;

import com.sastabackend.domain.Images;
import com.sastabackend.domain.ResponseModel;
import com.sastabackend.domain.Session;
import com.sastabackend.domain.Users;

import java.util.List;

public interface UserService {

    Users save(Users users);

    List<Users> getList(String id);

    ResponseModel SignIn(String email,String password);

    ResponseModel Add(Users users);

    ResponseModel UpdateAvatarWithDescription(String base64,String description, Long id);

    ResponseModel UploadImage(Images image);
}