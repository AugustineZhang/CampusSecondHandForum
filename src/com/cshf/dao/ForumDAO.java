package com.cshf.dao;

import com.cshf.entity.Forum;

import java.sql.ResultSet;
import java.text.SimpleDateFormat;

public class ForumDAO {

    private Forum wrapForumFromResultSet(ResultSet rs) {
        Forum forum = new Forum();
        try {
            forum.setFid(rs.getInt("fid"));
            forum.setFname(rs.getString("fname"));
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            forum.setStartime(sdf.format(rs.getDate("startime")));
            forum.setNewtime(sdf.format(rs.getDate("newtime")));
            forum.setNum(rs.getInt("num"));
            forum.setRemark(rs.getString("tel"));
            forum.setDelFlag(rs.getBoolean("del_flag"));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return forum;
    }
}
