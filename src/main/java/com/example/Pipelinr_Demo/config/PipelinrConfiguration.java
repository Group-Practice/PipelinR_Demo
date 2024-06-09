package com.example.Pipelinr_Demo.config;

import an.awesome.pipelinr.Pipeline;
import an.awesome.pipelinr.Pipelinr;
import com.example.Pipelinr_Demo.service.conmand.MessageCommandHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.stream.Stream;

@Configuration
public class PipelinrConfiguration {

    @Bean
    Pipeline pipeline() {
        return new Pipelinr()
                .with(
                        () -> Stream.of(new MessageCommandHandler())
                );
    }
}
