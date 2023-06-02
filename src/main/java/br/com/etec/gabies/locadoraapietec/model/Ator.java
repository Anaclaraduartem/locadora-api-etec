package br.com.etec.gabies.locadoraapietec.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name="ator")

public class Ator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String nomeator;

    @JsonIgnore
    @OneToMany(mappedBy = "ator")
    private List<Filmes> filmesator = new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeator() {
        return nomeator;
    }

    public void setNomeator(String nomeator) {
        this.nomeator = nomeator;
    }

    public List<Filmes> getFilmesator() {
        return filmesator;
    }

    public void setFilmesator(List<Filmes> filmesator) {
        this.filmesator = filmesator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ator ator = (Ator) o;
        return id.equals(ator.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
