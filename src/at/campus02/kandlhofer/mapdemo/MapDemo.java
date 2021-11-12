package at.campus02.kandlhofer.mapdemo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
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
        for (String student : students) {
            Integer grade = gradeOfStudents.get(student); // gib mir den Wert meines Schlüssels (zB: Mustermann)
            System.out.println("Student " + student + " hat die Note " + grade);
        }

        // Gib mir die Note von Mustermann
        Integer gradeOfMustermann = gradeOfStudents.get("Mustermann");
        System.out.println("gradeOfMustermann = " + gradeOfMustermann);

        // 2. Möglichkeit Schlüsse und Werte zu bekommen
        Set<Map.Entry<String, Integer>> entries = gradeOfStudents.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println("Student " + entry.getKey() + " hat die Note " + entry.getValue());
        }
    }

}
