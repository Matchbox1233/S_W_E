package legoset;

import lombok.Data;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;

@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class Minifig {

    @XmlAttribute
    private int count;

    @XmlAttribute
    private String name;

    public  Minifig(){}

    public Minifig(int count, String name) {
        this.count = count;
        this.name = name;
    }
}
