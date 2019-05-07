package com.cshf.dao;

import com.cshf.entity.Forum;
import com.cshf.entity.User;
import com.cshf.util.DbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class ForumDAO {
    public int insertForum(Connection conn, Forum forum) {
        int i = -1;
        String sql = "insert into forum(fname,start_time,latest_time,num,remark,del_flag)"
                + "values(?,?,?,?,?,?)";
        List<Object> params = new ArrayList<>();
        params.add(forum.getFname());
        params.add(forum.getStartime());
        params.add(forum.getLatesttime());
        params.add(forum.getNum());
        params.add(forum.getRemark());
        params.add(false);

        try {
            PreparedStatement psmt = DbUtil.getPreparedStatement(conn, sql);
            DbUtil.setPreparedStatementParams(psmt, params);
            i = psmt.executeUpdate();
            closeResource(psmt, conn);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return i;
    }

    public int deleteForumById(Connection conn, int id) {
        int i = -1;
        String sql = "update forum set del_flag=false where fid=?";
        List<Object> params = new ArrayList<>();
        params.add(id);
        try {
            PreparedStatement psmt = DbUtil.getPreparedStatement(conn, sql);
            DbUtil.setPreparedStatementParams(psmt, params);
            i = psmt.executeUpdate();
            closeResource(psmt, conn);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return i;
    }

    public int updateForumById(Connection conn, Forum forum) {
        int i = -1;
        String sql = "update forum set fname=?,start_time=?,latest_time=?,num=?,remark=? where fid=?";
        List<Object> params = new ArrayList<>();
        params.add(forum.getFname());
        params.add(forum.getStartime());
        params.add(forum.getLatesttime());
        params.add(forum.getNum());
        params.add(forum.getRemark());

        try {
            PreparedStatement psmt = DbUtil.getPreparedStatement(conn, sql);
            DbUtil.setPreparedStatementParams(psmt, params);
            i = psmt.executeUpdate();
            closeResource(psmt, conn);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return i;
    }

    public Forum selectForumById(Connection conn, String id) {
        Forum forum = null;
        String sql = "select * from forum where fid=?";
        List<Object> params = new ArrayList<>();
        params.add(id);
        try {
            PreparedStatement psmt = DbUtil.getPreparedStatement(conn, sql);
            DbUtil.setPreparedStatementParams(psmt, params);
            ResultSet rs = psmt.executeQuery();
            if (rs.next()) {
                forum = wrapForumFromResultSet(rs);
            }
            closeResource(psmt, conn);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return forum;
    }

    private Forum wrapForumFromResultSet(ResultSet rs) {
        Forum forum = new Forum();
        try {
            forum.setFid(rs.getInt("fid"));
            forum.setFname(rs.getString("fname"));
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            forum.setStartime(sdf.format(rs.getDate("startime")));
            forum.setLatesttime(sdf.format(rs.getDate("latesttime")));
            forum.setNum(rs.getInt("num"));
            forum.setRemark(rs.getString("tel"));
            forum.setDelFlag(rs.getBoolean("del_flag"));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return forum;
    }

    private void closeResource(PreparedStatement psmt, Connection conn) {
        DbUtil.closePreparedStatement(psmt);
        DbUtil.closeConnection(conn);
    }
}


