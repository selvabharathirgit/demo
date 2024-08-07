package com.examples.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "zyl_org")
public class Org {
    @Id
    @Column(name = "id")
    private long id;
    @Column(name = "org_name")
    private String orgName;
    @Column(name = "active")
    private boolean active;
}
