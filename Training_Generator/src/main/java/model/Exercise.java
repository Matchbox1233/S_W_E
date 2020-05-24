package model;

import javafx.beans.property.SimpleStringProperty;
import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class Exercise {
    private SimpleStringProperty gyakorlat;

    public Exercise(String gyakorlat){
        this.gyakorlat = new SimpleStringProperty(gyakorlat);
    }

    public String getGyakorlat() {
        return gyakorlat.get();
    }

    public SimpleStringProperty gyakorlatProperty() {
        return gyakorlat;
    }

    public void setGyakorlat(String gyakorlat) {
        this.gyakorlat = new SimpleStringProperty(gyakorlat);
    }
}

