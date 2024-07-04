package com.example.agendanube.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
public class Persona {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Setter
@Getter
    private long id;

@Column
@Getter
@Setter
    private String nombre;

@Column
@Getter
@Setter
    private String telefono;
}
