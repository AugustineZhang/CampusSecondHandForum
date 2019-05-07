package com.cshf.dao;

import com.cshf.entity.Chat;
import com.cshf.entity.User;
import com.cshf.util.DbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ChatDAO {



    private Chat wrapForumFromResultSet(ResultSet rs) {
        Chat chat = new Chat();
        try {
            chat.setCid(rs.getInt("cid"));
            chat.setSid(rs.getInt("sid"));
            chat.setSname(rs.getString("sname"));
            chat.setSimage(rs.getString("simage"));
            chat.setFid(rs.getInt("fid"));
            chat.setDelFlag(rs.getBoolean("del_flag"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return chat;
    }



}
