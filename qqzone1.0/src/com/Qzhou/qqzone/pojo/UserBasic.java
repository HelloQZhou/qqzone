package com.Qzhou.qqzone.pojo;

import java.util.List;

public class UserBasic {
    private Integer id;
    private String loginId;
    private String nickName;
    private String pwd;
    private String headImg;

    private UserDetail userDetail; // 1:1对应
    private List<Topic> topicList; // 1:N
    private List<UserBasic> friendList; //M:N 一个人有很多好友

    public UserBasic() {}

    public UserBasic(Integer id, String loginId, String nickName, String pwd, String headImg, UserDetail userDetail, List<Topic> topicList, List<UserBasic> friendList) {
        this.id = id;
        this.loginId = loginId;
        this.nickName = nickName;
        this.pwd = pwd;
        this.headImg = headImg;
        this.userDetail = userDetail;
        this.topicList = topicList;
        this.friendList = friendList;
    }

    public UserBasic(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getHeadImg() {
        return headImg;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    public UserDetail getUserDetail() {
        return userDetail;
    }

    public void setUserDetail(UserDetail userDetail) {
        this.userDetail = userDetail;
    }

    public List<Topic> getTopicList() {
        return topicList;
    }

    public void setTopicList(List<Topic> topicList) {
        this.topicList = topicList;
    }

    public List<UserBasic> getFriendList() {
        return friendList;
    }

    public void setFriendList(List<UserBasic> friendList) {
        this.friendList = friendList;
    }
}
