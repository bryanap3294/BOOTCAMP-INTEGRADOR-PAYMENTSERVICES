package com.bootcamp.pagoservicios.service;

import com.bootcamp.pagoservicios.model.Channel;
import reactor.core.publisher.Mono;

public interface ChannelService {

    Mono<Channel> save(Channel channel);

}
