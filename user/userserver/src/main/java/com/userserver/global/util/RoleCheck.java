package com.userserver.global.util;

import com.userserver.global.util.error.AdminOnlyException;
import com.userserver.global.util.error.HasNoAuthorityException;
import com.userserver.user.model.entity.UserRole;

public class RoleCheck {
    public static void isUser(UserRole role) {
        if (!role.isUser()) {
            throw new HasNoAuthorityException();
        }
    }

    public static void isSeller(UserRole role) {
        if (!role.isSeller()) {
            throw new HasNoAuthorityException();
        }
    }

    public static void isAdmin(UserRole role) {
        if (!role.isAdmin()) {
            throw new AdminOnlyException();
        }
    }
}

