package com.example.test.Model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "department_facility")
public class departmen {
    @Id
    @GeneratedValue
    private UUID id;
    private UUID idDepartMent;
    private UUID idFacility;
    private UUID staff;
}
