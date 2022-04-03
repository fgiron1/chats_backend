package com.fgiron1.chats_backend.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer{
    
    @Override
    public void configureMessageBroker(MessageBrokerRegistry config){
        
        //All requests prefixed with /topic are targeted
        //to the message broker
        config.enableSimpleBroker("/topic");
        config.setApplicationDestinationPrefixes("/app");
    }

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {

        //Enables SockJS fallback options so that alternate transports can be used if WebSocket is not available
        registry.addEndpoint("/gs-guide-websocket").withSockJS();

    }

}
