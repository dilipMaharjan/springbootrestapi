/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootstarter.service;

import com.bootstarter.model.Topic;
import com.bootstarter.repository.TopicRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author dmaharjan
 */
@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    public List<Topic> getAll() {
        List<Topic> topics = new ArrayList();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }

    public Topic getById(Long id) {
        return topicRepository.findOne(id);
    }

    public void addTopic(Topic topic) {
        topicRepository.save(topic);
    }

    public void updateTopic(long id, Topic topic) {
        topicRepository.save(topic);
    }

    public void deleteTopic(long id) {
        topicRepository.delete(id);
    }
}
