package JavaSamples.stringsdemo;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class StringsPlayground {
    public static void main (String[] args) {
        
        // Declaration
        String name = "Rogelio Aguas";        
        System.out.println("\n\nHello " + name);

        // Split
        String[] splitedName = name.split(" ");
        System.out.println("\n\nHello " + splitedName[0]);

        // Lower case
        String sentence = "THIS SHOULD BE DISPLAY IN LOWER CASE ONCE THIS IS CONVERTED";
        System.out.println(sentence.toLowerCase());
        System.out.println(sentence.replace("THIS", "esto"));

        //String compare
        String name1= "Pablo P";
        String name2= "Pablo p";
        System.out.println("Usando el método 'equals()': " + name2.equals(name1));
        System.out.println("Usando el método 'equalsIgnoreCase()': " + name2.equalsIgnoreCase(name1));
        System.out.println("Usando el método 'compareTo()': " + name2.compareTo(name1));
        System.out.println("Usando el operador '==': " + (name2 == name1));

        //Conversions----

        // Number to string
        float myValue = (float) 103.42;
        String convertedValue = String.valueOf(myValue);
        System.out.println("El valor convertido es " + convertedValue);

        // String to Number
        String stringToConvert = "433.23";
        float valueOfString = Float.valueOf(stringToConvert);
        valueOfString += 20;
        System.out.println(stringToConvert + " + 20 es " + valueOfString);

        // Number with format
        NumberFormat numFormat = new DecimalFormat("0.0000");
        String formatedResult = numFormat.format(java.lang.Math.PI);
        System.out.println("El valor formateado de PI es " + formatedResult);

        /* conversion between float double
         * float value1 = 20.09F;
            double value2 = Double.valueOf(value1);
         */

         
    }
}