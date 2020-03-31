package legoset;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.math.BigDecimal;
import java.net.URL;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import jaxb.JAXBHelper;


public class Main {

    public static void main(String[] args) throws Exception {
        LegoSet legoset = new LegoSet();
        legoset.setNumber("75211");
        legoset.setName("Imperial TIE Fighter");
        legoset.setSubtheme("Solo");
        legoset.setYear(Year.of(2018));
        legoset.setPieces(519);
        legoset.setTags(Set.of("Starfighter", "Stromtrooper", "Star Wars", "Solo"));

        ArrayList<Minifig> minifigs = new ArrayList<>();
        minifigs.add(new Minifig(2,"Imperial Mudtrooper"));
        minifigs.add(new Minifig(1,"Imperial Pilot"));
        minifigs.add(new Minifig(1,"Mimban Stromtrooper"));
        legoset.setMinifigs(minifigs);

        ArrayList<Weight> weight = new ArrayList<>();
        weight.add(new Weight("kg", 0.89));
        legoset.setWeight(weight);

        legoset.setUrl(new URL("https://brickset.com/sets/75211-1/Imperial-TIE-Fighter"));

        JAXBHelper.toXML(legoset, System.out);

        //JAXBHelper.toXML(legoset, new FileOutputStream("legoset.xml"));
        //System.out.println(JAXBHelper.fromXML(LegoSet.class, new FileInputStream("lego.xml")));

    }
}
