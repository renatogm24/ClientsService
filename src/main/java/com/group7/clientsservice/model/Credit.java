package com.group7.clientsservice.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
@Builder
@Getter
@Setter
public class Credit {
    private String id;
    private String client;
    private double amount;
    private double balance;
    private String number;
    private int billingDay;
}
