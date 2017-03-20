package com.thoughtworks.china.mobile.basic;


import java.util.List;

public class Session {
    private String topic;
    private String type;
    private List<String> speakers;

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getSpeakers() {
        return speakers;
    }

    public void setSpeakers(List<String> speakers) {
        this.speakers = speakers;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Session{" +
                "topic='" + topic + '\'' +
                ", type='" + type + '\'' +
                ", speakers=" + speakers +
                '}';
    }
}
