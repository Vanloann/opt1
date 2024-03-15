package com.example.opt1.model;

import javax.persistence.*;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Service {
    @Id
    @Column(columnDefinition = "varchar(10)")
    private String serviceId;
    private String serviceName;
    private int unit;
    private int price;
    @OneToMany(mappedBy = "service")
    private List<ServiceUsing> serviceUsingList;
}
