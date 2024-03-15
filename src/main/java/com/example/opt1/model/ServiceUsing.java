package com.example.opt1.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@IdClass(ServiceUsingKey.class)
public class ServiceUsing {
    @Id
    private String customerId;
    @Id
    private String serviceId;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
    @ManyToOne
    @JoinColumn(name = "service_id")
    private Service service;
    @Id
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date usingDate;
    @Id
    private int usingTime;
    private int quantity;
}
