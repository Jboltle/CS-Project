public class Main {
    public static void main(String[] args) {
        Methods mthdClass = new Methods();
        System.out.println(mthdClass.getName());
        String name = mthdClass.sc.nextLine();
        if (mthdClass.sc.nextLine().equals(mthdClass.invalidStrErorr)) {
            mthdClass.sc.close();
        }
        else  {
            mthdClass.helloMessageString(name);
            mthdClass.timesleep(1000);
            mthdClass.dragonMessageString(mthdClass.dragon, name);        
            
        }
        
    }
}