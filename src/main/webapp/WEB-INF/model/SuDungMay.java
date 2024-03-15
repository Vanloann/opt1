package com.example.opt1.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 * @author
 */
@Entity
@Table(name = "SuDungMay")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SuDungMay implements Serializable {

    @EmbeddedId
    private SuDungMayId suDungMayId;

    @Column(name = "thoiGianSuDung")
    private Long thoiGianSuDung;



}
