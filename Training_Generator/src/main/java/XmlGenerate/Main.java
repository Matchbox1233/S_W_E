package XmlGenerate;

import jaxb.JAXBHelper;
import model.Exercise;
import model.Exercises;

import javax.xml.bind.JAXBException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, JAXBException {
        Exercises xmlExercises = new Exercises(new ArrayList<>());
        xmlExercises.getExercise().add(new Exercise("Fekvenyomás", "Chest"));
        xmlExercises.getExercise().add(new Exercise("Tárogatás", "Chest"));
        xmlExercises.getExercise().add(new Exercise("Szűk nyomás kézisúlyzóval", "Chest"));
        xmlExercises.getExercise().add(new Exercise("Kereszthúzó csigán felülrő összehúzás", "Chest"));
        xmlExercises.getExercise().add(new Exercise("Kereszthúzó csigán összehúzás alulról", "Chest"));
        xmlExercises.getExercise().add(new Exercise("Fekvőtámasz", "Chest"));
        xmlExercises.getExercise().add(new Exercise("Áthúzás", "Chest"));
        xmlExercises.getExercise().add(new Exercise("Fekvenyomás kézisúlyzóval", "Chest"));
        xmlExercises.getExercise().add(new Exercise("Mellből nyomás gépen", "Chest"));
        xmlExercises.getExercise().add(new Exercise("Tárogatógép", "Chest"));

        xmlExercises.getExercise().add(new Exercise("Fejlölé nyomás állva egyenes rúddal", "Sholulder"));
        xmlExercises.getExercise().add(new Exercise("Előre emelés kézisúlyzóval", "Sholulder"));
        xmlExercises.getExercise().add(new Exercise("Arnold nyomás üllve", "Sholulder"));
        xmlExercises.getExercise().add(new Exercise("Tárcsa előre emelés", "Sholulder"));
        xmlExercises.getExercise().add(new Exercise("Oldalemelés állva kézisúlyzóval", "Sholulder"));
        xmlExercises.getExercise().add(new Exercise("Oldalemelés kereszhthúzó csigán", "Sholulder"));
        xmlExercises.getExercise().add(new Exercise("The Rock féle oldalemlés", "Sholulder"));
        xmlExercises.getExercise().add(new Exercise("Tárogató gép hátsó vállra", "Sholulder"));
        xmlExercises.getExercise().add(new Exercise("Döntött törzsű oldalamelés", "Sholulder"));
        xmlExercises.getExercise().add(new Exercise("Kereszthúzó csigán fent kötél hátsóvállra", "Sholulder"));

        xmlExercises.getExercise().add(new Exercise("Felhúzás", "Back"));
        xmlExercises.getExercise().add(new Exercise("Döntött törzsű evezés", "Back"));
        xmlExercises.getExercise().add(new Exercise("Merevlábas felhúzás", "Back"));
        xmlExercises.getExercise().add(new Exercise("Húzódzkodás", "Back"));
        xmlExercises.getExercise().add(new Exercise("Mellhez húzás hátgépen", "Back"));
        xmlExercises.getExercise().add(new Exercise("Mellhez húzás szűk fogással", "Back"));
        xmlExercises.getExercise().add(new Exercise("Evező gép szűken", "Back"));
        xmlExercises.getExercise().add(new Exercise("Fűrészelés", "Back"));
        xmlExercises.getExercise().add(new Exercise("T ruda evezés szélesen", "Back"));
        xmlExercises.getExercise().add(new Exercise("Merevkaros letolás", "Back"));

        xmlExercises.getExercise().add(new Exercise("Guggolás", "Leg"));
        xmlExercises.getExercise().add(new Exercise("Mellen guggolás", "Leg"));
        xmlExercises.getExercise().add(new Exercise("Combfeszítő", "Leg"));
        xmlExercises.getExercise().add(new Exercise("Combhajlító", "Leg"));
        xmlExercises.getExercise().add(new Exercise("Kitörés", "Leg"));
        xmlExercises.getExercise().add(new Exercise("Támadójárás", "Leg"));
        xmlExercises.getExercise().add(new Exercise("Sissy guggolás", "Leg"));
        xmlExercises.getExercise().add(new Exercise("Széles guggolás keretben", "Leg"));
        xmlExercises.getExercise().add(new Exercise("TRX-es kitörés", "Leg"));
        xmlExercises.getExercise().add(new Exercise("Álló vádli", "Leg"));

        xmlExercises.getExercise().add(new Exercise("Függeszkedve lábemelés", "Abs"));
        xmlExercises.getExercise().add(new Exercise("Plank labdán", "Abs"));
        xmlExercises.getExercise().add(new Exercise("Hasprés labdán", "Abs"));
        xmlExercises.getExercise().add(new Exercise("Harangozás", "Abs"));
        xmlExercises.getExercise().add(new Exercise("Oldalhasra törzs döntés kézisúlyzóval", "Abs"));
        xmlExercises.getExercise().add(new Exercise("Medicin labda emelés függeszkedve", "Abs"));
        xmlExercises.getExercise().add(new Exercise("Dobó-féle has", "Abs"));
        xmlExercises.getExercise().add(new Exercise("Lábemelés hanyatt fekve", "Abs"));
        xmlExercises.getExercise().add(new Exercise("Lebegő üllés", "Abs"));
        xmlExercises.getExercise().add(new Exercise("Oldalsó Plank", "Abs"));

        xmlExercises.getExercise().add(new Exercise("Állva egyenes rúd", "Biceps"));
        xmlExercises.getExercise().add(new Exercise("Váltott kezes bicepsz", "Biceps"));
        xmlExercises.getExercise().add(new Exercise("Kalapács bicepsz", "Biceps"));
        xmlExercises.getExercise().add(new Exercise("Kereszthúzónál guggolva egyenes rúd", "Biceps"));
        xmlExercises.getExercise().add(new Exercise("Scott-pad kézisúlyzóval", "Biceps"));
        xmlExercises.getExercise().add(new Exercise("Üllve bicepsz hajlítás", "Biceps"));
        xmlExercises.getExercise().add(new Exercise("Padra dőlve kézisúlyzóval bicepsz hajlítás", "Biceps"));
        xmlExercises.getExercise().add(new Exercise("Kereszthúzón koncentrált bicepsz", "Biceps"));
        xmlExercises.getExercise().add(new Exercise("Egyenes rúd fordított(madár) fogással", "Biceps"));
        xmlExercises.getExercise().add(new Exercise("Francia rúd állva", "Biceps"));

        xmlExercises.getExercise().add(new Exercise("Szűk fekvenyomás", "Triceps"));
        xmlExercises.getExercise().add(new Exercise("Egyenes rúd letolás", "Triceps"));
        xmlExercises.getExercise().add(new Exercise("Kézisúlyzó tarkóhoz engedés", "Triceps"));
        xmlExercises.getExercise().add(new Exercise("Francia rúd lehúzás", "Triceps"));
        xmlExercises.getExercise().add(new Exercise("Francia rúd homlokra engedés", "Triceps"));
        xmlExercises.getExercise().add(new Exercise("Kézisúlyzó füllhöz engedés", "Triceps"));
        xmlExercises.getExercise().add(new Exercise("Háromszög letolás", "Triceps"));
        xmlExercises.getExercise().add(new Exercise("Kötél lehúzás", "Triceps"));
        xmlExercises.getExercise().add(new Exercise("Lórugás kézisúlyzóval", "Triceps"));
        xmlExercises.getExercise().add(new Exercise("Tolódzkodás", "Triceps"));






        OutputStream os = new FileOutputStream("D:\\exercises.xml");
        JAXBHelper.toXML(xmlExercises,os);

    }
}
