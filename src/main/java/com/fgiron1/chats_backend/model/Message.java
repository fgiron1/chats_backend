package com.fgiron1.chats_backend.model;

import java.io.Serializable;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class Message implements Serializable {
    
    private String content;
    private int author_id;
    private ZonedDateTime post_timestamp = ZonedDateTime.now(ZoneOffset.UTC);

    public Message(){}
    
    public Message(String content, int author_id){
        this.content = content;
        this.author_id = author_id;
        //post_timestamp should already be set    
    }


    /**
     * @return String return the content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content the content to set
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * @return int return the author_id
     */
    public int getAuthor_id() {
        return author_id;
    }

    /**
     * @param author_id the author_id to set
     */
    public void setAuthor_id(int author_id) {
        this.author_id = author_id;
    }

    /**
     * @return ZonedDateTime return the post_timestamp
     */
    public ZonedDateTime getPost_timestamp() {
        return post_timestamp;
    }

    /**
     * @param post_timestamp the post_timestamp to set
     */
    public void setPost_timestamp(ZonedDateTime post_timestamp) {
        this.post_timestamp = post_timestamp;
    }

}