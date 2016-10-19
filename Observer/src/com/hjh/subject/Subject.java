package com.hjh.subject;

public class Subject extends SubjectAbstracet {

    private String  temperature;
    private String  humidity;

    public void updateSelf(String temperature,String humidity){
        this.temperature = temperature;
        this.humidity = humidity;
        this.notifyAllObserver();
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }
}
