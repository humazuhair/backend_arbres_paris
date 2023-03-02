package com.example.demo4.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "les-arbres", schema = "trees")
public class ArbreEntity {
    @Basic
    @Id
    @Column(name = "IDBASE")
    private Integer idbase;
    @Basic
    @Column(name = "TYPE EMPLACEMENT")
    private String typeEmplacement;
    @Basic
    @Column(name = "DOMANIALITE")
    private String domanialite;
    @Basic
    @Column(name = "ARRONDISSEMENT")
    private String arrondissement;
    @Basic
    @Column(name = "COMPLEMENT ADRESSE")
    private String complementAdresse;
    @Basic
    @Column(name = "NUMERO")
    private String numero;
    @Basic
    @Column(name = "LIEU / ADRESSE")
    private String lieuAdresse;
    @Basic
    @Column(name = "IDEMPLACEMENT")
    private String idemplacement;
    @Basic
    @Column(name = "LIBELLE FRANCAIS")
    private String libelleFrancais;
    @Basic
    @Column(name = "GENRE")
    private String genre;
    @Basic
    @Column(name = "ESPECE")
    private String espece;
    @Basic
    @Column(name = "VARIETE OUCULTIVAR")
    private String varieteOucultivar;
    @Basic
    @Column(name = "CIRCONFERENCE (cm)")
    private Integer circonferenceCm;
    @Basic
    @Column(name = "HAUTEUR (m)")
    private Integer hauteurM;
    @Basic
    @Column(name = "STADE DE DEVELOPPEMENT")
    private String stadeDeDeveloppement;
    @Basic
    @Column(name = "REMARQUABLE")
    private String remarquable;
    @Basic
    @Column(name = "geo_point_2d")
    private String geoPoint2D;

    public Integer getIdbase() {
        return idbase;
    }

    public void setIdbase(Integer idbase) {
        this.idbase = idbase;
    }

    public String getTypeEmplacement() {
        return typeEmplacement;
    }

    public void setTypeEmplacement(String typeEmplacement) {
        this.typeEmplacement = typeEmplacement;
    }

    public String getDomanialite() {
        return domanialite;
    }

    public void setDomanialite(String domanialite) {
        this.domanialite = domanialite;
    }

    public String getArrondissement() {
        return arrondissement;
    }

    public void setArrondissement(String arrondissement) {
        this.arrondissement = arrondissement;
    }

    public String getComplementAdresse() {
        return complementAdresse;
    }

    public void setComplementAdresse(String complementAdresse) {
        this.complementAdresse = complementAdresse;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getLieuAdresse() {
        return lieuAdresse;
    }

    public void setLieuAdresse(String lieuAdresse) {
        this.lieuAdresse = lieuAdresse;
    }

    public String getIdemplacement() {
        return idemplacement;
    }

    public void setIdemplacement(String idemplacement) {
        this.idemplacement = idemplacement;
    }

    public String getLibelleFrancais() {
        return libelleFrancais;
    }

    public void setLibelleFrancais(String libelleFrancais) {
        this.libelleFrancais = libelleFrancais;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getEspece() {
        return espece;
    }

    public void setEspece(String espece) {
        this.espece = espece;
    }

    public String getVarieteOucultivar() {
        return varieteOucultivar;
    }

    public void setVarieteOucultivar(String varieteOucultivar) {
        this.varieteOucultivar = varieteOucultivar;
    }

    public Integer getCirconferenceCm() {
        return circonferenceCm;
    }

    public void setCirconferenceCm(Integer circonferenceCm) {
        this.circonferenceCm = circonferenceCm;
    }

    public Integer getHauteurM() {
        return hauteurM;
    }

    public void setHauteurM(Integer hauteurM) {
        this.hauteurM = hauteurM;
    }

    public String getStadeDeDeveloppement() {
        return stadeDeDeveloppement;
    }

    public void setStadeDeDeveloppement(String stadeDeDeveloppement) {
        this.stadeDeDeveloppement = stadeDeDeveloppement;
    }

    public String getRemarquable() {
        return remarquable;
    }

    public void setRemarquable(String remarquable) {
        this.remarquable = remarquable;
    }

    public String getGeoPoint2D() {
        return geoPoint2D;
    }

    public void setGeoPoint2D(String geoPoint2D) {
        this.geoPoint2D = geoPoint2D;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ArbreEntity that = (ArbreEntity) o;

        if (idbase != null ? !idbase.equals(that.idbase) : that.idbase != null) return false;
        if (typeEmplacement != null ? !typeEmplacement.equals(that.typeEmplacement) : that.typeEmplacement != null)
            return false;
        if (domanialite != null ? !domanialite.equals(that.domanialite) : that.domanialite != null) return false;
        if (arrondissement != null ? !arrondissement.equals(that.arrondissement) : that.arrondissement != null)
            return false;
        if (complementAdresse != null ? !complementAdresse.equals(that.complementAdresse) : that.complementAdresse != null)
            return false;
        if (numero != null ? !numero.equals(that.numero) : that.numero != null) return false;
        if (lieuAdresse != null ? !lieuAdresse.equals(that.lieuAdresse) : that.lieuAdresse != null) return false;
        if (idemplacement != null ? !idemplacement.equals(that.idemplacement) : that.idemplacement != null)
            return false;
        if (libelleFrancais != null ? !libelleFrancais.equals(that.libelleFrancais) : that.libelleFrancais != null)
            return false;
        if (genre != null ? !genre.equals(that.genre) : that.genre != null) return false;
        if (espece != null ? !espece.equals(that.espece) : that.espece != null) return false;
        if (varieteOucultivar != null ? !varieteOucultivar.equals(that.varieteOucultivar) : that.varieteOucultivar != null)
            return false;
        if (circonferenceCm != null ? !circonferenceCm.equals(that.circonferenceCm) : that.circonferenceCm != null)
            return false;
        if (hauteurM != null ? !hauteurM.equals(that.hauteurM) : that.hauteurM != null) return false;
        if (stadeDeDeveloppement != null ? !stadeDeDeveloppement.equals(that.stadeDeDeveloppement) : that.stadeDeDeveloppement != null)
            return false;
        if (remarquable != null ? !remarquable.equals(that.remarquable) : that.remarquable != null) return false;
        if (geoPoint2D != null ? !geoPoint2D.equals(that.geoPoint2D) : that.geoPoint2D != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idbase != null ? idbase.hashCode() : 0;
        result = 31 * result + (typeEmplacement != null ? typeEmplacement.hashCode() : 0);
        result = 31 * result + (domanialite != null ? domanialite.hashCode() : 0);
        result = 31 * result + (arrondissement != null ? arrondissement.hashCode() : 0);
        result = 31 * result + (complementAdresse != null ? complementAdresse.hashCode() : 0);
        result = 31 * result + (numero != null ? numero.hashCode() : 0);
        result = 31 * result + (lieuAdresse != null ? lieuAdresse.hashCode() : 0);
        result = 31 * result + (idemplacement != null ? idemplacement.hashCode() : 0);
        result = 31 * result + (libelleFrancais != null ? libelleFrancais.hashCode() : 0);
        result = 31 * result + (genre != null ? genre.hashCode() : 0);
        result = 31 * result + (espece != null ? espece.hashCode() : 0);
        result = 31 * result + (varieteOucultivar != null ? varieteOucultivar.hashCode() : 0);
        result = 31 * result + (circonferenceCm != null ? circonferenceCm.hashCode() : 0);
        result = 31 * result + (hauteurM != null ? hauteurM.hashCode() : 0);
        result = 31 * result + (stadeDeDeveloppement != null ? stadeDeDeveloppement.hashCode() : 0);
        result = 31 * result + (remarquable != null ? remarquable.hashCode() : 0);
        result = 31 * result + (geoPoint2D != null ? geoPoint2D.hashCode() : 0);
        return result;
    }
}
