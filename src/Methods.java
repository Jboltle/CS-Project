import java.util.Scanner;
class Methods {
    Scanner sc = new Scanner(System.in);
    AsciiArt artGen = new AsciiArt();
    String getName = ("What is your name?");
    String invalidStringMessage = "Please Enter a Valid Argument: ";
    String invalidStrErorr = " ";
    Thread time = new Thread(); 
    int timer = 1;
    public void helloMessageString(String name) {
        for (int i = 0; i < 20; i++){
           
            try {
                time.sleep((i * timer));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("|" + '\n');   
        }
    System.out.print("Hello " + name + '\n' + "Wait, what's that? \n ");

    for (int i = 0; i < 4; i++) {
        System.out.print(".");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException interruptError) {
            interruptError.printStackTrace();
        }
    }
    }

















    String boom = "@@@@@@@@@@@   @@@@@@@@@@    @@@@@@@@@@   @@@@@   @@@@@\n" +
                  "@@@@@@@@@@@   @@@@@@@@@@    @@@@@@@@@@   @@@@@   @@@@@\n" +
                  "@@@     @@@   @@@    @@@    @@@    @@@   @@@@@   @@@@@\n" +
                  "@@@     @@@  @@@      @@@  @@@      @@@  @@@@@   @@@@@\n" +
                  "@@@@@@@@@@   @@@      @@@  @@@      @@@  @@@ @@ @@ @@@\n" +
                  "@@@@@@@@@    @@@      @@@  @@@      @@@  @@@ @@ @@ @@@\n" +
                  "@@@@@@@@@@   @@@      @@@  @@@      @@@  @@@ @@ @@ @@@\n" +
                  "@@@     @@@  @@@      @@@  @@@      @@@  @@@ @@ @@ @@@\n" +
                  "@@@     @@@   @@@    @@@    @@@    @@@   @@@  @@@  @@@\n" +
                  "@@@@@@@@@@@   @@@@@@@@@@    @@@@@@@@@@   @@@  @@@  @@@\n" +
                  "@@@@@@@@@@     @@@@@@@@      @@@@@@@@    @@@  @@@  @@@\n" +
                  "@@@@@@@@@        @@@@          @@@@      @@@   @   @@@\n" +
                  "@@@@@@@@@        @@@@          @@@@      @@@       @@@";
        
        
          


    }