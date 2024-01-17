public class Main {
    public static void main(String[] args) {
        Methods mthdClass = new Methods();
        System.out.println(mthdClass.getName);
        String name = mthdClass.sc.nextLine();
        try {
            if (name.equals(mthdClass.invalidStrErorr)) {
                mthdClass.sc.close();
            }
            
        } catch (Exception e) {
            System.out.println(mthdClass.invalidStrErorr);
            mthdClass.sc.close();
        }
    
        
        mthdClass.helloMessageString(name);
        mthdClass.timesleep(1000);
        mthdClass.dragonMessageString(mthdClass.dragon, name);        
            
        
        
    }
}