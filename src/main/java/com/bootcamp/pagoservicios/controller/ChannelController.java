package com.bootcamp.pagoservicios.controller;

import com.bootcamp.pagoservicios.model.Channel;
import com.bootcamp.pagoservicios.service.ChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/channel")
public class ChannelController {

    @Autowired
    private ChannelService channelService;

    @PostMapping("/")
    public Mono<Channel> save(@RequestBody Channel channel){

        return channelService.save(channel);
    }
}