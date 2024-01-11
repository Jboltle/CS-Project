
public class Main {
    public static void main(String[] args) {
        Methods mthdClass = new Methods();
        AsciiArt asciiArt = new AsciiArt();
        System.out.println(mthdClass.getName);
        String name = mthdClass.sc.nextLine();
        if (mthdClass.sc.nextLine().equals(mthdClass.invalidStrErorr)) {
            System.out.println(mthdClass.invalidStringMessage);
            mthdClass.sc.close();
        }
        else {
            mthdClass.helloMessageString(name);
            asciiArt.printTextArt("Boom", asciiArt.asciiart.ART_SIZE_MEDIUM); 
        }
        
    }
}