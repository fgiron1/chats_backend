package com.fgiron1.chats_backend.controller;

import com.fgiron1.chats_backend.model.Message;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {
    
    @MessageMapping("/msg")
    @SendTo("/topic/messsages")
    public ResponseEntity<Message> sendMessage(Message message) throws Exception {

        ResponseEntity<Message> response = new ResponseEntity<Message>(message, HttpStatus.OK);
        return response;
    }

}