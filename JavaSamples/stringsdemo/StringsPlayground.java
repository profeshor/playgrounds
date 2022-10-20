package JavaSamples.stringsdemo;

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
    }
}