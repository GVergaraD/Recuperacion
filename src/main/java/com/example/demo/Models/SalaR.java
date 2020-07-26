package com.example.demo.Models;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name= "salas")
public class SalaR {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "disponibilidad")
    private Long disponibilidad;

    public Long getId() {
        return id;
    }

    public Long getDisponibilidad() {
        return disponibilidad;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDisponibilidad(Long disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    @ManyToMany//(mappedBy = "salasR")
    private Set<PRecuperacion> precuperacions;

    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @JoinColumn(name = "salar_id")
    private List<Cama> camas = new ArrayList<>();

    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @JoinColumn(name = "salar_id")
    private List<Paciente> pacientes = new ArrayList<>();
}
