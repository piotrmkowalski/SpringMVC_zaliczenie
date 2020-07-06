package com.example.crudMaj17;

import javax.persistence.*;

@Entity
@Table(name="Adres")
public class Adres {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String ulica;
    private String miasto;

    public Adres() {}

    public Adres(String ulica, String miasto) {
        this.ulica = ulica;
        this.miasto = miasto;
    }

    public Adres(Integer id, String ulica, String miasto) {
        this.id = id;
        this.ulica = ulica;
        this.miasto = miasto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    @Override
    public String toString() {
        return "Adres{" +
                "id=" + id +
                ", ulica='" + ulica + '\'' +
                ", miasto='" + miasto + '\'' +
                '}';
    }
}
