import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private ArrayList<Option> options = new ArrayList<>(); // a Menu is basically a list of option
    private Option chosenOption = null; //  here it is the cption chosen by the user, by default : no option chosen

    void addOption(Option o)
    {
        options.add(o);
    }

    void display() {
        for (int i = 0; i < options.size(); i++) {
            Option currentOption = options.get(i);
            System.out.println((i+1)+" - "+currentOption);   // adding 1 to the index displayed, otherway it would start by 0.
        }
    }

    private void displayChosen()
    {
        if (chosenOption != null)
            System.out.println("Vous avez choisi l'option : " + chosenOption);
    }

    private void runChosenOptionSubMenu()
    {
        if (chosenOption != null) {
            Menu subMenu = chosenOption.getSubMenu();
            if (subMenu != null)
                subMenu.run();
        }
    }

    public Option getChosenOption() {
        return chosenOption;
    }

    public void displayAllChosen()  // fixme that is bugged
    {
        if (chosenOption != null) {
            System.out.print("Vous avez choisi : " + chosenOption);
        /*    Menu subMenu = chosenOption.getSubMenu();
            Option subchosenOption   = subMenu.getChosenOption();
            while (subMenu != null && subchosenOption != null)  {
                subchosenOption  = subMenu.getChosenOption();
                subMenu = subchosenOption.getSubMenu();
                if (subchosenOption != null)  {
                    System.out.println(" avec " + subchosenOption);
                }
            }*/
        }
    }

    void run()
    {
        display();
        Scanner sc = new Scanner(System.in);

        int chosen;
        do
           chosen = sc.nextInt();
        while (chosen < 1 || chosen > (options.size() + 1));  // i am adding because normally arraylist start with 0, and we want start by 1

        chosenOption = options.get(chosen - 1); // i am removing the 1 to go back to array indexed started by 0;
        displayChosen();
        runChosenOptionSubMenu();
    }
}
