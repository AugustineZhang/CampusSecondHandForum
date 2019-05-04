package com.cshf.dao;

import com.cshf.entity.Chat;

import java.sql.ResultSet;

public class UserDAO {

    private Chat wrapForumFromResultSet(ResultSet rs) {
        Chat chat = new Chat();
        try {
            chat.setCid(rs.getInt("cid"));
            chat.setSid(rs.getInt("sid"));
            chat.setSname(rs.getString("sname"));
            chat.setSimage(rs.getString("simage"));
            chat.setFid(rs.getInt("fid"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return chat;
    }
}
