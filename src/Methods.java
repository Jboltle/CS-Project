import java.util.Scanner;
class Methods {
    
    Scanner sc = new Scanner(System.in);
    public String getName(){ return "What is your name?";}
    String invalidStrErorr = "";


        
    public String invalidIntMessage() {
        String intval = sc.nextLine();
        if (intval.contains("1") || intval.contains("2") || intval.contains("3")) {
            return "";
        }
        else {
        return "Please Enter a Valid Integer ";
        }
    }


    // Fixed the recursive call in the timesleep method
    public void timesleep(int timesleep) {
        try {
            Thread.sleep(timesleep);
        } catch (Exception e) {
            System.out.println("Error trying to sleep");
        }
    }
    public void helloMessageString(String name) {
        for (int i = 0; i < 20; i++){
           
           timesleep(10);
            System.out.print("|" + '\n');   
        }
    System.out.print("Hello " + name + '\n' );
    timesleep(1000);
     System.out.println("Wait, what's that? \n ");

    for (int i = 0; i < 3; i++) {
        System.out.print(".");
        timesleep(1000);
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

    System.out.print(boom);
    timesleep(1000);
     for (int i = 0; i < 30; i++){
           
           timesleep(5);
            System.out.print("|" + '\n');   
        }
}





    String dragon = "                                                                                            \r\n" + //
            "                                                       @@@@@             @@@                        \r\n" + //
            "                                                     @%*++**#@@         @#-*%@                      \r\n" + //
            "                                                     @#====+++#%@@      @*..-%@                     \r\n" + //
            "                                                     @%+======++*#%@@@@@#: ..-%                     \r\n" + //
            "                                                     @%+========+++++**%:...::#@                    \r\n" + //
            "                                                     @#=======+*++*++++**=::::#@                    \r\n" + //
            "                                             @#*%@  @%+=======++..+*++++++****%@                    \r\n" + //
            "                                            @#: .+@@#+=========+***++==++++++++#@@                  \r\n" + //
            "                                            @+.. ..-=+*+===--=====*++#++++++++++*%@                 \r\n" + //
            "                                            @*:.  ..::+*=-------==+++#++==+++++++*#@                \r\n" + //
            "                                             @*:...::-*=----------========++++++++*#@@              \r\n" + //
            "                     @@@@@                 @@@%%#+=+**==-----------========++++++++*#%@             \r\n" + //
            "          @@@@%###***********##%@@@      @@%#***%+++====-----------=========+++++++***#@@           \r\n" + //
            "     @@%##*+===+++++++++=========+#@@  @@%*****#%+======------------=========+++++++****%@          \r\n" + //
            "  @@%#*+*###***********###*++++++++#@@@#*******%*+=======-----------=========++**%#+*****%@         \r\n" + //
            " @@%#**+=-------------+##*##%#+++++*%%********#%++========---------===========+##@@#+****+@         \r\n" + //
            "    %*=:::::::::::::=##*##*+##+##+++%#********##++===========-=================*%@#*+****+#@        \r\n" + //
            "      @#-:::::::::=#*+##+===%**@%*++#@@@@%****%#++============+*%#=============++++++****=%@        \r\n" + //
            "       @%=::::::=**+##+=---+#+%*##*+*@@  @%***%#+++===========%%@@*============+*##****+==@         \r\n" + //
            "         @-:::-***##=-:::--***%+*%**+%@  @@***#%*+++==========*%%*======*=====+++++**#+==%@         \r\n" + //
            "         @%::=**#*=-::::::-#+%+=+#%***%@ @@***#%*+++++=================#+====++++++**#*+%@          \r\n" + //
            "          @-****=:::::::::+**#===+##***@@@@%@@%%#+++++++++++++++============+++++***#%%@@           \r\n" + //
            "          @###*==--:::::::**%=--==+##***#@@   @@@#+++++++++++++++++++++++++++++****#%@@             \r\n" + //
            "          @@@@   @@@%*=::-*#*-----==#%#***#%@@ @#@#+=+++++++++++**+++++++++++*****#%@               \r\n" + //
            "                      @#-=*#=::-----=+#%##**##%@%**#*=----=----=*####*********##%@@                 \r\n" + //
            "                        ##%#*#@@@@#*====+*##%%#+++++*###**++++**##==%@%%%@@@%##@                    \r\n" + //
            "                        @@@         @%#***##*++++++++++++******+++********++==+@        @@          \r\n" + //
            "                                       @%*+=======++++++++*+*+================+@@@@@@@#+=%*%@       \r\n" + //
            "                                     @%+===========+++*##=-##+*+===============%#%#####*+%+#@       \r\n" + //
            "                                   @%*=============#**--**++=+*#-----==========@#####*+===##@       \r\n" + //
            "                                  @%+==============*@#++------=*=--------======@*###*+====%@        \r\n" + //
            "                                 @#================*+=--------=*+---------=====@###**===-*@         \r\n" + //
            "         @@                     @#==================+=--------=*=-----=========@#*#*+=--+@          \r\n" + //
            "        @#*%@                  @%+==========++====++++=-------+*----------=====@****+-=#@           \r\n" + //
            "        @+=+*%@@            @@%@*===========*#+++++++++=----=**-::---------====@%###%@@@            \r\n" + //
            "        @+====+##%@@@@@@@%##*++%=============+##++++++++++*#*=-:::-------=====+@                    \r\n" + //
            "        @%==========+++=======*#==============+*####****#*=----------------==-*@                    \r\n" + //
            "         @*===================#*==============++++=====-----:::::::-----------%@                    \r\n" + //
            "         @@+=+++++++++++++++++##===========+*###*=-------::::::::::----------+%                     \r\n" + //
            "          @%+=++++++++++++++++*%=========+**++++*%*--:::----------------=====%@                     \r\n" + //
            "           @%+=++++++++++++++++%+=============+++*##----:::::::::-----------#@@                     \r\n" + //
            "            @@*==++++++++++++++*%++============++*#*#+++--::::::::--------=*##@                     \r\n" + //
            "              @%+===++**********##++++=======+**+#=.:++-*+-::::::--------=##**#@                    \r\n" + //
            "                @%*=-==++++++++++*#*++++====*#*::=#++*+**#=------------=*%#****@                    \r\n" + //
            "                  @@#*=-==========+##*#++==+++**+------==*=----------=*%#*****+@                    \r\n" + //
            "                     @@@#**+==--=====*%++=====----------+#=-------+*##******++*@                    \r\n" + //
            "                          @@@@@@%%%%%%@%++===-----------*#*+***###****+++++++*%@                    \r\n" + //
            "                                       @*++=-::--------+%@  @=+++++++++++++*%@                      \r\n" + //
            "                                       @@+==-::::-----+%@   @#+++++++*#####*%@                      \r\n" + //
            "                                         @#=:::::::-+#@      @#++++++++++++*%@                      \r\n" + //
            "                                          @@#**+**%@@         @#++++++++**#*+%@                     \r\n" + //
            "                                                               @@#*++++%-:+%%@                      \r\n" + //
            "                                                                  @#++#@##@                         \r\n";


    
        
        public void dragonMessageString(String dragon, String name) {
        System.out.print(dragon);
        System.out.print("Oh no! It's a dragon! \n"); //this is becuase the fucking thing wont work unlesss its in a try block 
        timesleep(1000);
        System.out.print("What do you do? \n 1. Run \n 2. Fight \n 3. Hide \n");
<<<<<<< HEAD
        
            try {
                if (sc.nextLine().equals("2")){
                
                int rand = (int)(Math.random()* 1000) + 100;
                int damage = rand;
            
                if (damage % 2 == 0) {
                    damage = 0;
                }
                            
                if (damage >= 500){
                    
                    System.out.println(String.format("You got Lucky and have enough power: %d damage ", damage));
                    timesleep(1000);
                    System.out.println(String.format("You have defeated the dragon %s dealing %d damage", name, damage));
                    if (damage <= 500) { 
                        System.out.println(String.format("You have damaged the dragon by %d damage %s" , damage, name));
                    }

                }  
            
                
            }
            } catch (Exception e) { e.printStackTrace();        }
            
            try {

                if (sc.next().equals("1") || sc.next().equals("3")) {
                System.out.println("The dragon destroyed your viliage");
            }
                
                
            } catch (ArithmeticException e) {
             e.printStackTrace();
             System.out.println(invalidIntMessage());
=======
        if (sc.nextLine().equals("2")){
            
            int rand = (int)(Math.random()* 1000) + 100;
            int damage = rand;
        
            if (damage % 2 == 0) {
                damage = 0;
            }
                        
            if (damage >= 500){
                
                System.out.println(String.format("You got Lucky and have enough power: %d damage ", damage));
                timesleep(1000);
                System.out.println(String.format("You have defeated the dragon %s dealing %d damage", name, damage));
                if (damage <= 500) { 
                    System.out.println(String.format("You have damaged the dragon by %d damage %s" , damage, name));
                }

            }  
           
            
        }
        if (sc.next().equals("1") || sc.next().equals("3")) {
            System.out.println("The dragon destroyed your viliage");
        }
            
        else {
            System.out.println(invalidIntMessage());
        }
>>>>>>> refs/remotes/origin/main
        }
    
    }
}

    












          


    