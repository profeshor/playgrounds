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
        
    }
}