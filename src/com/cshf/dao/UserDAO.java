package com.cshf.dao;

import com.cshf.entity.User;
import com.cshf.util.DbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {

    public int insertUser(Connection conn, User user) {
        int i = -1;
        String sql = "insert into user(uid,upwd,sex,dept,tel,qq,email,uimage,del_flag)"
                + "values(?,?,?,?,?,?,?,?,?)";
        List<Object> params = new ArrayList<>();
        params.add(user.getUid());
        params.add(user.getUpwd());
        params.add(user.getSex());
        params.add(user.getDept());
        params.add(user.getTel());
        params.add(user.getQq());
        params.add(user.getEmail());
        params.add(user.getUimage());
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

    public int deleteUserById(Connection conn, int id) {
        int i = -1;
        String sql = "update user set del_flag=false where uid=?";
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

    public int updateUserById(Connection conn, User user) {
        int i = -1;

        String sql = "update user set upwd=?,sex=?,dept=?,tel=?,qq=?,email=?,uimage=? where uid=?";
        List<Object> params = new ArrayList<>();
        params.add(user.getUpwd());
        params.add(user.getSex());
        params.add(user.getDept());
        params.add(user.getTel());
        params.add(user.getQq());
        params.add(user.getEmail());
        params.add(user.getUimage());
        params.add(user.getUid());

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

    public User selectUserById(Connection conn, String id) {
        User user = null;
        String sql = "select * from user where uid=?";
        List<Object> params = new ArrayList<>();
        params.add(id);
        try {
            PreparedStatement psmt = DbUtil.getPreparedStatement(conn, sql);
            DbUtil.setPreparedStatementParams(psmt, params);
            ResultSet rs = psmt.executeQuery();
            if (rs.next()) {
                user = wrapUserFromResultSet(rs);
            }
            closeResource(psmt, conn);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return user;
    }

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
            user.setDelFlag(rs.getBoolean("del_flag"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }

    private void closeResource(PreparedStatement psmt, Connection conn) {
        DbUtil.closePreparedStatement(psmt);
        DbUtil.closeConnection(conn);
    }
}
