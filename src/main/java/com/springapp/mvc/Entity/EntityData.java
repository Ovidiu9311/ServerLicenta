package com.springapp.mvc.Entity;

/**
 * Created by ovidiu on 2/25/2016.
 */
public class EntityData {

    private Integer temperatura;
    private Integer umiditate;

    public EntityData(Integer temperatura, Integer umiditate) {
        this.temperatura = temperatura;
        this.umiditate = umiditate;
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
}
