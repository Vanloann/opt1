package com.example.opt1.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

/**
 * @author
 */
@Entity
@Table(name = "KhachHang")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class KhachHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "maKH")
    private Long maKH;
    @Column(name = "tenKH")
    private String tenKH;
    @Column(name = "diaChi")
    private String diaChi;
    @Column(name = "soDienThoai")
    private String soDienThoai;
    @Column(name = "email")
    private String email;
    @OneToMany(mappedBy = "suDungDichVuId.khachHang")
    private List<SuDungDichVu> suDungDichVuList;
    @OneToMany(mappedBy = "suDungMayId.khachHang")
    private List<SuDungMay> suDungMayList;


}
