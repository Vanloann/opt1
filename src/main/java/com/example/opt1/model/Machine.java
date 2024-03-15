package com.example.opt1.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
public class Machine {
    @Id
    @Column(columnDefinition = "varchar(10)")
    private String machineId;
    private String position;
    private String status;
    @JsonIgnore
    @OneToMany(mappedBy = "machine", cascade = CascadeType.ALL)
    private List<MachineUsing> machineUsingList;

}