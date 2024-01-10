import java.util.Scanner;
class Methods {
    Scanner sc = new Scanner(System.in);
    String getName = ("What is your name?");
    String invalidStringMessage = "Please Enter a Valid Argument: ";
    String invalidStrErorr = " ";
    Thread time = new Thread();
    int timerDouble = 1;
    AsciiArt asciiArt = new AsciiArt();
    public void helloMessageString(String name) {
        for (int i = 0; i < 20; i++){
           
            try {
                time.sleep((i * timerDouble));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("|" + '\n');   
        }
        System.out.print("Hello " + name + '\n' + "Wait, what's that? ");
    }
          
}
