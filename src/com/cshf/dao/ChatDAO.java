package com.cshf.dao;

import com.cshf.entity.User;

import java.sql.ResultSet;

public class ChatDAO {

    private User wrapUserFromResultSet(ResultSet rs) {
        User user = new User();
        try {
            user.setUid(rs.getInt("uid"));
            user.setUpwd(rs.getString("upwd"));
            user.setSex(rs.getString("sex"));
            user.setDept(rs.getString("dept"));
            user.setTel(rs.getString("tel"));
            user.setQq(rs.getString("qq"));
            user.setEmail(rs.getString("email"));
            user.setUimage(rs.getString("uimage"));
            user.setFid(rs.getInt("fid"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }
}
