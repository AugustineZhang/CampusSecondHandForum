package com.cshf.dao;

import com.cshf.entity.Goods;

import java.sql.ResultSet;

public class GoodsDAO {

    private Goods wrapForumFromResultSet(ResultSet rs) {
        Goods goods = new Goods();
        try {
            goods.setSid(rs.getInt("sid"));
            goods.setSname(rs.getString("sname"));
            goods.setCategory(rs.getString("category"));
            goods.setContent(rs.getString("content"));
            goods.setPrice(rs.getBigDecimal("price"));
            goods.setSimage(rs.getString("simage"));
            goods.setFid(rs.getInt("fid"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return goods;
    }

}
