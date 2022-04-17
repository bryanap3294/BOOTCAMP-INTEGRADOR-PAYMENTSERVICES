package com.bootcamp.pagoservicios.service.impl;

import com.bootcamp.pagoservicios.model.Channel;
import com.bootcamp.pagoservicios.repository.ChannelRepository;
import com.bootcamp.pagoservicios.service.ChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class ChannelServiceImpl implements ChannelService {

    @Autowired
    ChannelRepository channelRepository;

    @Override
    public Mono<Channel> save(Channel channel) {
        return channelRepository.save(channel);
    }
}
