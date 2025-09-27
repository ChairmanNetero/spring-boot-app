package com.mazen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    public List<Topic> getAllTopics() {
        return topicRepository.findAll();
    }

    public Topic getTopic(String id) {
        Optional<Topic> topic = topicRepository.findById(id);
        return topic.orElse(null);
    }

    public void addTopic(Topic topic) {
        topicRepository.save(topic);
    }

    public void updateTopic(Topic topic, String id) {
        topic.setId(id); // Ensure the topic has the correct ID
        topicRepository.save(topic); // save() works for both insert and update
    }

    public void deleteTopic(String id) {
        topicRepository.deleteById(id);
    }
}
