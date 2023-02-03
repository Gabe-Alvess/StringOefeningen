package be.intecbrussel;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("Github");
        System.out.println(" ---- Oefening 1 ---- ");
        // 1. Ken volgende waarde aan een string toe Java Exercises!,
        // gebruik nu een functie van de String class en druk
        // enkel het volgende woord Exercises af van de variabele.

        String les = "Java Exercises!";
        System.out.println(les.substring(4, 14));

        System.out.println(" ---- Oefening 2 ---- ");
        // 2. Maak een string met volgende waarde walter, edwin, mike
        // controlleer of de naam edwin voorkomt in de string.

        String ListOfNames = "walter, edwin, mike";
        System.out.println(ListOfNames.contains("edwin"));

        System.out.println("---- Oefening 3 ---- ");
        // 3. Maak een string met de volgende waarde hello world maak nu een algoritme dat van de huidige waarde het
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
        // 1. Maak een string aan en print deze naar de console.

        String str = "Hello";
        System.out.println(str);

        System.out.println("---- Oefening - 2 ----");
        // 2. Gebruik de ".length()" eigenschap om de lengte van een string of stringBuilder te bepalen.

        String str1 = "Hello World";
        System.out.println(str1.length());

        System.out.println("---- Oefening - 3 ----");
        // 3. Gebruik de .substring() methode om een deel van een string of stringBuilder
        // te selecteren en print dit naar de console.

        String str2 = "Hello World";
        System.out.println(str2.substring(6, 11));

        System.out.println("---- Oefening - 4 ----");
        // 4. Gebruik de + operator of de concat() methode om twee strings samen te voegen.

        String str3 = "Hello ";
        String str4 = "There!";
        String strConcat = str3.concat(str4);
        System.out.println(strConcat + " -> met .concat()");
        System.out.println(str3 + str4 + " -> met + operator");

        System.out.println("---- Oefening - 5 ----");
        // 5. Maak een programma dat controleert of een String een geldige email address is.
        // (email address moet minstens een @ en een . bevatten, de . moet na de @ komen).

        String email = "bob@pm.com";

        int atPosition = email.indexOf("@");
        int dotPosition = email.indexOf(".");

        boolean containsAt = email.contains("@");
        boolean containsDot = email.contains(".");
        boolean atSmallerThanDot = atPosition < dotPosition;
        boolean minAtPosition = atPosition >= 3;
        boolean minDotPosition = dotPosition >= 6;

        if (containsAt && containsDot && atSmallerThanDot && minAtPosition && minDotPosition) {
            System.out.println(email + " ->" + " Is een geldige email address!");
        } else {
            System.out.println(email + " ->" + " Is een ongeldige email address!");
        }
    }
}
