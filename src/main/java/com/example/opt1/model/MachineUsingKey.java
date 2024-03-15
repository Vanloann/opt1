package com.example.opt1.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

//@Embeddable
public class MachineUsingKey implements Serializable {
    private Customer customerId;
    private String machineId;
}

