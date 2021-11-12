package at.campus02.kandlhofer.mapdemo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class MapDemo {

    public static void main(String[] args) {
        // HashMap deklarieren
        HashMap<String, Integer> gradeOfStudents = new HashMap<>();

        // Schlüssel und dazugehörigen Wert hinzufügen
        gradeOfStudents.put("Mustermann", 1);
        gradeOfStudents.put("Musterfrau", 2);
        System.out.println("gradeOfStudents = " + gradeOfStudents);

        // Schlüsselwert updaten
        gradeOfStudents.put("Mustermann", 3);
        System.out.println("gradeOfStudents = " + gradeOfStudents);

        // Iteration über alle Schlüssel
        Set<String> students = gradeOfStudents.keySet(); // STRG + ALT + V -> variable automatisch erzeugen

    }

}
