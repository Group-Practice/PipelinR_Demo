package com.example.Pipelinr_Demo.service.conmand;

import an.awesome.pipelinr.Command;
import com.example.Pipelinr_Demo.response.MessageResponse;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class MessageCommand implements Command<MessageResponse> {
    private String message;
}
