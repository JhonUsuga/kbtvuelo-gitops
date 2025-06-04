package com.example.kbtvuelo.model;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import lombok.*;

import java.io.Serializable;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Flight implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idflight")
    private Long idFlight;

    @Column(name = "nombreavion", nullable = false, length = 80)
    private @NonNull String nombreAvion;

    @Column(name = "numerovuelo", nullable = false, length = 80)
    private @NonNull String numeroVuelo;

    @Column(name = "origen", nullable = false, length = 80)
    private @NonNull String origen;

    @Column(name = "destino", nullable = false, length = 80)
    private @NonNull String destino;

    @Column(name = "capacidad", nullable = false, length = 80)
    private @NonNull int capacidad;

    @Column(name = "rating", nullable = false, length = 80)
    @Min(value = 1, message = "id should be more or than equal 1")
    @Max(value = 5, message = "id should be less or than equal 5")
    private @NonNull int rating;

    @Column(name = "planvuelo", nullable = false, length = 80)
    private @NonNull long planVuelo;

    private Boolean cumplido;

    public Long getIdFlight() {
        return idFlight;
    }

    public void setIdFlight(Long idFlight) {
        this.idFlight = idFlight;
    }

    public String getNombreAvion() {
        return nombreAvion;
    }

    public void setNombreAvion(String nombreAvion) {
        this.nombreAvion = nombreAvion;
    }

    public String getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(String numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public long getPlanVuelo() {
        return planVuelo;
    }

    public void setPlanVuelo(long planVuelo) {
        this.planVuelo = planVuelo;
    }

    public Boolean getCumplido() {
        return cumplido;
    }

    public void setCumplido(Boolean cumplido) {
        this.cumplido = cumplido;
    }
}
