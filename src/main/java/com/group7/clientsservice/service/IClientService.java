package com.group7.clientsservice.service;

import com.group7.clientsservice.entities.Client;
import com.group7.clientsservice.entities.ClientProducts;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IClientService {
    Flux<Client> getAll();

    Mono<Client> getById(String id);

    Mono<Void> delete(String id);

    Mono<Client> save(Client cliente);

    Mono<Client> update(Client cliente);

    Mono<Boolean> existsById(String id);

    Mono<ClientProducts> getProductsByClient(String id);
}