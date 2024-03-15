package com.example.opt1.model;
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
@IdClass(MachineUsingKey.class)
public class MachineUsing {
    @Id
    private String customerId;
    @Id
    private String machineId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_id", referencedColumnName = "customerId")
    private Customer customer;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "machine_id", referencedColumnName = "machineId")
    private Machine machine;

    @Id
    private Date startDate;

    @Id
    private int startTime;

    private int usingPeriod;
}

