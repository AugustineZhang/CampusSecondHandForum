package com.cshf.entity;

public class Forum {

    private int fid;

    private String fname;

    private String startime;

    private String latesttime;

    private int num;

    private String remark;

    private boolean delFlag;

    private int uid;

    public int getFid() {
        return fid;
    }

    public void setFid(int fid) {
        this.fid = fid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getStartime() {
        return startime;
    }

    public void setStartime(String startime) {
        this.startime = startime;
    }

    public String getLatesttime() { return latesttime; }

    public void setLatesttime(String latesttime) { this.latesttime = latesttime; }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public boolean isDelFlag() {
        return delFlag;
    }

    public void setDelFlag(boolean delFlag) {
        this.delFlag = delFlag;
    }

    public int getUid() { return uid; }

    public void setUid(int uid) { this.uid = uid; }
}
