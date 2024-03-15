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
@Table(name = "May")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class May {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "maMay")
    private Long maMay;
    @Column(name = "viTri")
    private String viTri;
    @Column(name = "trangThai")
    private String trangThai;
    @OneToMany(mappedBy = "suDungMayId.may")
    private List<SuDungMay> suDungMayList;
}
