package example.apipelicula.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter @Setter
@ToString
@Table(name = "peliculagenero")
public class PeliculaGenero {

    @Id
    @ManyToOne
    @JoinColumn(name = "idPelicula", referencedColumnName = "id")
    private Pelicula idPelicula;

    @Id
    @ManyToOne
    @JoinColumn(name = "idGenero", referencedColumnName = "id")
    private Genero idGenero;
}
