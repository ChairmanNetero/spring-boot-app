package com.mazen;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topics = new ArrayList<>(
            Arrays.asList(
                    new Topic("spring", "spring framework", "spring framework description"),
                    new Topic("java", "core java", "core java description"),
                    new Topic("javascript", "javascript", "javascript description")
            )
    );

    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic getTopic(String id) {
        return topics.stream().filter(topic -> topic.getId().equals(id)).findFirst().orElse(null);
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }

}
