package com.bnpp.epita.exception;

import java.util.ArrayList;
import java.util.List;

public class TemperatureAverage {
    public static void main(String[] args) {

        try {
            List<Integer> recordedTemperatureInDegreesCelsius = new ArrayList<Integer>();

            // remplir liste à partir des valeurs fournies comme arguments en ligne de commande
            for (String stringReprsenetaionOfTemprature : args) {
                int temperature = Integer.parseInt(stringReprsenetaionOfTemprature);
                recordedTemperatureInDegreesCelsius.add(temperature);
            }
            //calcul et affichage de la temperature moyenne
            Integer averageTemperature = SimpleMaths.calculateAverage(recordedTemperatureInDegreesCelsius);
            System.out.println("The average tempreature is " + averageTemperature);

        } catch (NumberFormatException e) {
            System.out.println("All arguments should be provided as numbers");
            System.exit(-1);
        } catch (ArithmeticException e) {
            System.out.println("Division par 0 -> At least one temperature should be provided");
            System.exit(-1);
        }

    }
}

/*
// pour compiler : se mettre sur répertoire du fichier source avec cd /Users/"sandrine binutti"/etc ...
// puis commande javac *.java
// ou compiler avec maven
PS C:\Users\sandrine binutti\Desktop\JAVA\Maven\TP-Exception\src\main\java\com\bnpp\epita\exception> javac *.java

// pour exécuter : se mettre sur répertoire des load (ici target car en Maven) avec cd /Users/...
// puis commande java nomPackage.nomClassDuMain
PS C:\Users\sandrine binutti\Desktop\JAVA\Maven\TP-Exception\target\classes> java com.bnpp.epita.exception.TemperatureAverage 4 15 12
The average tempreature is 10

 */