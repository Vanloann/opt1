package com.example.opt1.model;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 * @author
 */
@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//@EqualsAndHashCode
public class SuDungMayId implements Serializable {
    @ManyToOne
    @JoinColumn(name = "khachHang")
    private KhachHang khachHang;
    @ManyToOne
    @JoinColumn(name = "may")
    private May may;
    private LocalDate ngayBatDauSuDung;
    private LocalTime gioBatDauSuDung;

}
