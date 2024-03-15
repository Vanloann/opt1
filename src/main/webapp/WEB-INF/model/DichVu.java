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
@Table(name = "DichVu")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DichVu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "maDV")
    private Long maDV;
    @Column(name = "tenDV")
    private String tenDV;
    @Column(name = "donViTinh")
    private String donViTinh;
    @Column(name = "donGia")
    private Long donGia;
    @OneToMany(mappedBy = "suDungDichVuId.dichVu")
    private List<SuDungDichVu> suDungDichVuList;

}
