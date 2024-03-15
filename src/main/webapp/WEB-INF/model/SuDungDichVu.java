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
@Table(name = "SuDungDichVu")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SuDungDichVu implements Serializable {
    @EmbeddedId
    private SuDungDichVuId suDungDichVuId;

    @Column(name = "soLuong")
    private Long soLuong;

}
