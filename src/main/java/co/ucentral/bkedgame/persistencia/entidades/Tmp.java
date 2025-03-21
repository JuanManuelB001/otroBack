package co.ucentral.bkedgame.persistencia.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.text.DateFormat;

@Entity
@Table(name = "Equipos")
@AllArgsConstructor
@NoArgsConstructor
public class Tmp {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false)
    private Long id;
    private String nombre, nombreCorto;
    private DateFormat fechaCreacion;
}
