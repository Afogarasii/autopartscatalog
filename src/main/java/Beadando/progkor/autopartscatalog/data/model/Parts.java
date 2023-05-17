package Beadando.progkor.autopartscatalog.data.model;

import java.util.Objects;

/**
 * Model class for parts.
 */
public class Parts {
    private Long id;
    private String title;
    private String typenumber;
    private String compatiblemodel;
    private Brand brand;

    public Parts(Long id, String title, String typenumber, String compatiblemodel, Brand brand) {
        this.id = id;
        this.title = title;
        this.typenumber = typenumber;
        this.compatiblemodel = compatiblemodel;
        this.brand = brand;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTypenumber() {
        return typenumber;
    }

    public void setTypenumber(String typenumber) {
        this.typenumber = typenumber;
    }

    public String getCompatiblemodel() {
        return compatiblemodel;
    }

    public void setCompatiblemodel(String compatiblemodel) {
        this.compatiblemodel = compatiblemodel;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Parts parts = (Parts) o;

        if (!Objects.equals(id, parts.id)) return false;
        if (!Objects.equals(title, parts.title)) return false;
        if (!Objects.equals(typenumber, parts.typenumber)) return false;
        if (!Objects.equals(compatiblemodel, parts.compatiblemodel))
            return false;
        return brand == parts.brand;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (typenumber != null ? typenumber.hashCode() : 0);
        result = 31 * result + (compatiblemodel != null ? compatiblemodel.hashCode() : 0);
        result = 31 * result + (brand != null ? brand.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Parts{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", typenumber='" + typenumber + '\'' +
                ", compatiblemodel='" + compatiblemodel + '\'' +
                ", brand=" + brand +
                '}';
    }
}
