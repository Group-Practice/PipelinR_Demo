package com.example.Pipelinr_Demo.controller;

import an.awesome.pipelinr.Pipeline;
import com.example.Pipelinr_Demo.request.MessageRequest;
import com.example.Pipelinr_Demo.response.MessageResponse;
import com.example.Pipelinr_Demo.service.conmand.MessageCommand;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
@RequiredArgsConstructor
public class MessageController {

    private final Pipeline  pipeline;

    @PostMapping
    public MessageResponse sendMessage(
            @RequestBody MessageRequest request
    ){
        return pipeline.send(MessageCommand.builder()
                        .message(request.message()).build());
    }
}
