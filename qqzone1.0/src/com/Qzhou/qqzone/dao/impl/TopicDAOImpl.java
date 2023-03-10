package com.Qzhou.qqzone.dao.impl;

import com.Qzhou.myssm.basedao.BaseDAO;
import com.Qzhou.qqzone.dao.TopicDAO;
import com.Qzhou.qqzone.pojo.Topic;
import com.Qzhou.qqzone.pojo.UserBasic;

import java.util.List;

public class TopicDAOImpl extends BaseDAO<Topic> implements TopicDAO{
    @Override
    public List<Topic> getTopicList(UserBasic userBasic) {
        return super.executeQuery("select * from t_topic where author=?",userBasic.getId());
    }

    @Override
    public void addTopic(Topic topic) {
        executeUpdate("insert into t_topic values(0,?,?,?,?)",topic.getTitle(),topic.getContent(),topic.getTopicDate(),topic.getAuthor().getId());
    }

    @Override
    public void delTopic(Topic topic) {
       executeUpdate("delete from t_topic where id=?",topic.getId());
    }

    @Override
    public Topic getTopic(Integer id) {
        return load("select * from t_topic where id=?",id);
    }
}
