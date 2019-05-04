package com.cshf.dao;

import com.cshf.entity.User;

import java.sql.ResultSet;

public class ChatDAO {

    private User wrapUserFromResultSet(ResultSet rs) {
        User user = new User();
        try {
            user.setUid(rs.getInt("uid"));

        } catch (Exception e) {

        }

        return user;
    }
}
