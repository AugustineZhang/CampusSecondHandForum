package com.cshf.dao;

import com.cshf.entity.Goods;
import com.cshf.entity.User;
import com.cshf.util.DbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class GoodsDAO {
    public int insertGoods(Connection conn, Goods goods) {
        int i = -1;
        String sql = "insert into goods(sname,category,content,price,simage,uid,fid,del_flag)"
                + "values(?,?,?,?,?,?,?,?)";
        List<Object> params = new ArrayList<>();
        params.add(goods.getSname());
        params.add(goods.getCategory());
        params.add(goods.getContent());
        params.add(goods.getPrice());
        params.add(goods.getSimage());
//        params.add(goods.getUid());
//        params.add(goods.getFid());
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

    public int deleteGoodsById(Connection conn, int id) {
        int i = -1;
        String sql = "update Goods set del_flag=false where sid=?";
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

    public int updateGoodsById(Connection conn, Goods goods) {
        int i = -1;
        String sql = "update goods set sname=?,category=?,content=?,price=?,simage=? where sid=?";
        List<Object> params = new ArrayList<>();
        params.add(goods.getSname());
        params.add(goods.getCategory());
        params.add(goods.getContent());
        params.add(goods.getPrice());
        params.add(goods.getSimage());

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

    public Goods selectGoodsById(Connection conn, String id) {
        Goods goods = null;
        String sql = "select * from goods where sid=?";
        List<Object> params = new ArrayList<>();
        params.add(id);
        try {
            PreparedStatement psmt = DbUtil.getPreparedStatement(conn, sql);
            DbUtil.setPreparedStatementParams(psmt, params);
            ResultSet rs = psmt.executeQuery();
            if (rs.next()) {
                goods = wrapGoodsFromResultSet(rs);
            }
            closeResource(psmt, conn);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return goods;
    }


    private Goods wrapGoodsFromResultSet(ResultSet rs) {
        Goods goods = new Goods();
        try {
            goods.setSid(rs.getInt("sid"));
            goods.setSname(rs.getString("sname"));
            goods.setCategory(rs.getString("category"));
            goods.setContent(rs.getString("content"));
            goods.setPrice(rs.getBigDecimal("price"));
            goods.setSimage(rs.getString("simage"));
            goods.setFid(rs.getInt("fid"));
            goods.setDelFlag(rs.getBoolean("del_flag"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return goods;
    }

    private void closeResource(PreparedStatement psmt, Connection conn) {
        DbUtil.closePreparedStatement(psmt);
        DbUtil.closeConnection(conn);
    }
}
