package com.packets;

import java.io.Serializable;

public class ChatMessagePacket implements Serializable {

    private static final long serialVersionUID = 1L;
    private String sender;
    private String message;

    public ChatMessagePacket(String sender, String message) {
        this.sender = sender;
        this.message = message;
    }

    public String getSender() {
        return sender;
    }

    public String getMessage() {
        return message;
    }
}
