package be.intecbrussel;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("Github");
        System.out.println(" ---- Oefening 1 ---- ");
        // Ken volgende waarde aan een string toe Java Exercises!,
        // gebruik nu een functie van de String class en druk
        // enkel het volgende woord Exercises af van de variabele.

        String les = "Java Exercises!";
        System.out.println(les.substring(4, 14));

        System.out.println(" ---- Oefening 2 ---- ");
        // Maak een string met volgende waarde walter, edwin, mike
        // controlleer of de naam edwin voorkomt in de string.

        String ListOfNames = "walter, edwin, mike";
        System.out.println(ListOfNames.contains("edwin"));

        System.out.println("---- Oefening 3 ---- ");
        // Maak een string met de volgende waarde hello world maak nu een algoritme dat van de huidige waarde het
        // volgende maakt HeLlO WoRlD. Bekijk voor deze oefening zeker de documentatie
        // van Class String van oracle en de vorige hoofdstukken.

        String sentence = "hello world";
        String res = "";
        for (int i = 0; i < sentence.length(); i++) {
            char indexChar = sentence.charAt(i);
            if (i % 2 == 0) {
                res += Character.toUpperCase(indexChar);
            } else {
                res += Character.toLowerCase(indexChar);
            }
        }

        System.out.println(res);

        System.out.println("---- String - Oefenreeks 1 ----");

        System.out.println("---- Oefening - 1 ----");
        // Maak een string aan en print deze naar de console.
        String str = "Hello";
        System.out.println(str);

        System.out.println("---- Oefenig - 2 ----");
    }
}
