package com.example.user.a1sthomework;

public class RowItem {

    private String member_name;
    private int profile_pic_id;


    public RowItem(int profile_pic_id,String member_name) {

        this.member_name = member_name;
        this.profile_pic_id = profile_pic_id;
    }

    public String getMember_name() {
        return member_name;
    }

    public void setMember_name(String member_name) {
        this.member_name = member_name;
    }

    public int getProfile_pic_id() {
        return profile_pic_id;
    }

    public void setProfile_pic_id(int profile_pic_id) {
        this.profile_pic_id = profile_pic_id;
    }







}