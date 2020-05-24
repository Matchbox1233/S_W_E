package model;

import javafx.beans.property.SimpleStringProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;


@XmlAccessorType(XmlAccessType.FIELD)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Exercise {
    private SimpleStringProperty gyakorlat;
    private String exerciseType;

    public Exercise(String gyakorlat, String exerciseType){
        this.gyakorlat = new SimpleStringProperty(gyakorlat);
        this.exerciseType = exerciseType;
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

