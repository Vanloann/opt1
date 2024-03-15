package com.example.opt1.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    @Id
    @Column(columnDefinition = "varchar(10)")
    private String customerId;

    private String customerName;

    private String address;

    private String phone;

    private String email;

    @OneToMany(mappedBy = "customer")
    private List<ServiceUsing> serviceUsingList;

    @JsonIgnore
    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<MachineUsing> machineUsingList;

}
