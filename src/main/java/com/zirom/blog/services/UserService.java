package com.zirom.blog.services;

import com.zirom.blog.domain.entities.User;

import java.util.UUID;

public interface UserService {
    User getUserById(UUID id);
}
