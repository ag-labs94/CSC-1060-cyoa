import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------------------------");
        System.out.println("Choose Your Own Adventure");
        System.out.println("       Space Explorer");
        System.out.println("--------------------------");
        System.out.println();

        String ship = "                     `. ___\n" +
                "                    __,' __`.                _..----....____\n" +
                "        __...--.'``;.   ,.   ;``--..__     .'    ,-._    _.-'\n" +
                "  _..-''-------'   `'   `'   `'     O ``-''._   (,;') _,'\n" +
                ",'________________                          \\`-._`-','\n" +
                " `._              ```````````------...___   '-.._'-:\n" +
                "    ```--.._      ,.                     ````--...__\\-.\n" +
                "            `.--. `-`                       ____    |  |`\n" +
                "              `. `.                       ,'`````.  ;  ;`\n" +
                "                `._`.        __________   `.      \\'__/`\n" +
                "                   `-:._____/______/___/____`.     \\  `\n" +
                "                               |       `._    `.    \\\n" +
                "                               `._________`-.   `.   `.___\n" +
                "                                             SSt  `------'`";

        System.out.println(ship);

        // Read user input to navigate the story
        Scanner scanner = new Scanner(System.in);

        System.out.println("What would you like to do?");
        System.out.println("1. Wake up");
        System.out.println("2. Stay asleep");

        int answer = scanner.nextInt();
        System.out.println("answer from user is: " + answer);

        //Start the adventure

        if  (answer == 1) {
            //Wake up
            String wakeupDesrciption =
                    "You wake to the soft thrum of the ship and the taste of recycled air,\n"
                            + "blinking against the dim cabin lights as my head clears. A single amber\n"
                            + "indicator on the computer systems blinks steadily—logs waiting—casting a\n"
                            + "tiny pulse across the console. Still half-dreaming, You float to the viewport\n"
                            + "and there it is: an immense planet turning in silence, while a powerful sun\n"
                            + "burns nearby like a white-gold furnace. Its light floods the clouds with\n"
                            + "molten edges and paints the atmosphere in a faint, glowing halo, as if the\n"
                            + "world is rimmed with fire.";

            System.out.println(wakeupDesrciption);
            System.out.println();
            System.out.println("What would you like to do?");
            System.out.println("1. Open the shuttle doors to the outside");
            System.out.println("2. Check the computer logs blinking");

            answer = scanner.nextInt();
            System.out.println("answer from user is: " + answer);
            if (answer == 1) {
                //Planet Description
                String planetDesrciption =
                        "The hatch unlocks with a sharp click, and the door swings outward.\n"
                                + "You step down onto the surface, boots crunching into fine dust.\n"
                                + "A bright sun floods the horizon with white-gold light, fierce and heavy.\n"
                                + "Heat shimmers over dark rock, and my visor blooms with glare warnings.\n"
                                + "Near the landing strut, a low plant clings to the soil like it belongs here.\n"
                                + "Its thick leaves are waxy and blue-green, and from its stem hangs one fruit—\n"
                                + "smooth, purple, and luminous—like a bruise lit from within.\n"
                                + "For a moment you just stand there, breathing slow, staring at the impossible.";
                String asciiTree =
                        "   \\  |  /\n" +
                                " --  ☼  --\n" +
                                "   /  |  \\\n" +
                                "\n" +
                                "\n" +
                                "      &&& &&  & &&\n" +
                                "   && &\\/&\\|& ()|/ @, &&\n" +
                                "   &\\/(/&/&||/& /_/)_&/_&\n" +
                                " &() &\\/&|()|/&\\/ '%\" & ()\n" +
                                " &_\\_&&_\\ |& |&&/&__%_/_& &&\n" +
                                "&&   && & &| &| /& & % ()& /&&\n" +
                                " ()&_---()&\\&\\|&&-&&--%---()~\n" +
                                "     &&     \\|||\n" +
                                "             |||\n" +
                                "             |||\n" +
                                "            /___\\";

                System.out.println(asciiTree);
                System.out.println(planetDesrciption);

                System.out.println();
                System.out.println("What would you like to do?");
                System.out.println("1. Stare at the strange bright sun.");
                System.out.println("2. Pick and eat the strange fruit.");

                answer = scanner.nextInt();
                System.out.println("answer from user is: " + answer);
                    if(answer == 1) {
                        //Sun go blind and die
                        String stareSun = "You tilt your helmet up and the sun hits like a hammer—white, ruthless.\n" +
                                " Your visor blooms with glare until the horizon disappears into pure light.\n" +
                                " Red warnings strobe across the HUD: RADIATION SPIKE. VISOR SATURATION.\n" +
                                " Pain behind your eyes and panic tightens your chest.\n" +
                                " You stagger back toward the hatch, one arm raised against the blaze.\n" +
                                " With a sharp hiss, Your vision of the world snaps dark.\n" +
                                " You breathe hard in the sudden shadow, as your vision is no more.\n" +
                                " You step forward to fall into a bottomless crater and you are no more.";

                        System.out.println(stareSun);
                        System.out.println();
                        System.out.println("-----GAME OVER-----");

                    } else if (answer == 2) {
                        //Eat fruit become immortal
                        String eatFruit =
                                "You twist the purple fruit free and take a bite.\n"
                                        + "Sweet lightning floods your mouth, and warmth spreads through your body.\n"
                                        + "Your breathing turns calm.\n"
                                        + "The world snaps into perfect focus, and time feels wide and slow.\n"
                                        + "You rise with a grin, you feel you could live forever as you are now immortal.\n";

                        System.out.println(eatFruit);
                        System.out.println();
                        System.out.println("-----GAME OVER-----");



                    }

            } else if (answer == 2) {
                //Oxygen trouble
                String logWarning =  "You lean over the console and the system logs scroll in shaky bursts.\n"
                        + "One indicator blinks CRITICAL in red, pulsing like a heartbeat.\n"
                        + "Beside it, another light flickers a new message across the display.\n"
                        + "The words resolve between static lines: YOU ARE NOT ALONE.\n"
                        + "The cabin suddenly feels smaller, and far too quiet.\n";

                String asciiDashboard = "+-----------------------------------------------------------+\n" +
                        "|  SHUTTLE DASHBOARD                         [ 12:07:33 ]   |\n" +
                        "+-----------------------------------------------------------+\n" +
                        "|  O2 LEVEL:  17%  [########..............]   <!! BLINK !!> |\n" +
                        "|  PRESSURE:  OK   [####################]                   |\n" +
                        "|  POWER:     62%  [#############.......]                   |\n" +
                        "|                                                           |\n" +
                        "|  LOGS:                                                      |\n" +
                        "|   [CRITICAL]  * * *  BLINKING  * * *   OXYGEN LEAK DETECTED |\n" +
                        "|   [MESSAGE ]  * * *  BLINKING  * * *   YOU ARE NOT ALONE    |\n" +
                        "|                                                           |\n" +
                        "|  SYSTEM:  LIFE SUPPORT ACTIVE     NAV: STANDBY             |\n" +
                        "+-----------------------------------------------------------+\n" +
                        "|  (A small amber light pulses on the console:     o  o  o ) |\n" +
                        "+-----------------------------------------------------------+";

                System.out.println(asciiDashboard);
                System.out.println();
                System.out.println(logWarning);
                System.out.println();
                System.out.println("What would you like to do?");
                System.out.println("1. Click on the critical warning log.");
                System.out.println("2. Click on the mysterious message.");

                answer = scanner.nextInt();
                System.out.println("answer from user is: " + answer);

                if(answer == 1) {
                    //Low oxygen warning
                    String fixOxygen = "A sharp beep cuts through the cabin as my HUD flashes OXYGEN LOW.\n"
                            + "The gauge dips into the red—18%... 17%—and each breath sounds louder.\n"
                            + "The air feels thinner, colder, like the ship is quietly slipping away.\n"
                            + "On the console, a pressure map blooms with a pulsing red dot near the aft seal.\n"
                            + "An oxygen leak—small, steady, deadly—needs patching now.\n"
                            + "You find the leak and patch it, and now you are safe in your shuttle and can relax.";
                    System.out.println(fixOxygen);
                    System.out.println();
                    System.out.println("-----GAME OVER-----");
                }
                else  if(answer == 2) {
                    //Search the ship
                    String searchShip = "You tear through the ship, yanking open panels and scanning every shadow.\n"
                            + "In the last compartment you find the culprit: a hamster in a tiny cage, "
                            + "running calmly on its wheel like nothing is wrong.\n"
                            + "Then your lungs tighten as my breaths become thin and sharp."
                            + "You collapse to the floor of the cabin.\n"
                            + "The hamster keeps running, and you slowly suffocate from a lack of oxygen\n"
                            + "As your vision slowly gets blurry and fades as you think how lucky the hamster is to have its own O2 supply.\n"
                            + "You die from a lack of oxygen.";

                    String hamsterWheel = "            .-=====================-.\n" +
                            "         .-'                         '-.\n" +
                            "       .'                               '.\n" +
                            "      /                                   \\\n" +
                            "     ;                                     ;\n" +
                            "     |              .-\"\"\"-.                |\n" +
                            "     |            .'  (\\_/)'.              |\n" +
                            "     |           /   ( o o ) \\             |\n" +
                            "     |          ;      \\_/    ;            |\n" +
                            "     |          |    .-----.. |            |\n" +
                            "     |          ;   /  ___  \\ ;            |\n" +
                            "     |           \\  \\_/   \\_/ /             |\n" +
                            "     |            '._  ___ _.'              |\n" +
                            "     |               \"\"\" \"\"\"                |\n" +
                            "     ;                                     ;\n" +
                            "      \\                                   /\n" +
                            "       '.                               .'\n" +
                            "         '-.                         .-'\n" +
                            "            '-.___________________.-'\n" +
                            "                  ||        ||\n" +
                            "                  ||        ||\n" +
                            "                  ||________||\n" +
                            "                 /__________\\";

                    System.out.println(hamsterWheel);
                    System.out.println();
                    System.out.println(searchShip);
                    System.out.println();
                    System.out.println("-----GAME OVER-----");


                }



            }



        }else {
            //Stay asleep
            System.out.println("You stay asleep and miss a grand adventure!");
        }
    }

}