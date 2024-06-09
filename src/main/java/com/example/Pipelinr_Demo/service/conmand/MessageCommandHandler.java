package com.example.Pipelinr_Demo.service.conmand;

import an.awesome.pipelinr.Command;
import com.example.Pipelinr_Demo.response.MessageResponse;
import org.springframework.stereotype.Component;

@Component
public class MessageCommandHandler implements Command.Handler<MessageCommand, MessageResponse> {

    @Override
    public MessageResponse handle(MessageCommand command) {
        return new MessageResponse(command.getMessage());
    }
}
