package com.hackaton.isuply.dto;

/** Helper para auxiliar na serializacao de dados*/
public class FavoriteDto {

    private Long idRestaurante;

    private Long idPurvoyor;

    public Long getIdRestaurante() {
        return idRestaurante;
    }

    public void setIdRestaurante(Long idRestaurante) {
        this.idRestaurante = idRestaurante;
    }

    public Long getIdPurvoyor() {
        return idPurvoyor;
    }

    public void setIdPurvoyor(Long idPurvoyor) {
        this.idPurvoyor = idPurvoyor;
    }
}
