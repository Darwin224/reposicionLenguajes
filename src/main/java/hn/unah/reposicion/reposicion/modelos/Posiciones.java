package hn.unah.reposicion.reposicion.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "posiciones")

public class Posiciones {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idposiciones")
    private int idPosiciones;

    private int empates;

    private int ganados;

    private int perdidos;

    @Column(name = "golesfavor")
    private int golesFavor;

    @Column(name = "golescontra")
    private int golesContra;

    private int puntos;
   
    
    @OneToOne
    @JoinColumn(name = "codigoequipo", referencedColumnName = "codigoEquipo")
    private Equipos equipo;
}
