package com.springapp.mvc.Entity;

import com.sun.javafx.beans.IDProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by ovidiu on 3/24/2016.
 */
@Entity
@Table(name="DATA")
public class Data {
    @Id
    @Column(name = "id")
    Integer id;

    @Column(name = "temperatura")
    Integer temperatura;

   @Column(name = "umiditate")
    Integer umiditate;

    @Column(name = "uv")
    Integer uv;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Integer temperatura) {
        this.temperatura = temperatura;
    }

    public Integer getUmiditate() {
        return umiditate;
    }

    public void setUmiditate(Integer umiditate) {
        this.umiditate = umiditate;
    }

    public Integer getUv() {
        return uv;
    }

    public void setUv(Integer uv) {
        this.uv = uv;
    }
}
