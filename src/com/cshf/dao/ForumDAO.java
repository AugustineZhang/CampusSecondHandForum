package com.cshf.dao;

import com.cshf.entity.Forum;

import java.sql.ResultSet;

public class ForumDAO {

    private Forum wrapForumFromResultSet(ResultSet rs) {
        Forum forum = new Forum();
        try {
            forum.setFid(rs.getInt("fid"));

        } catch (Exception e) {

        }

        return forum;
    }
}
