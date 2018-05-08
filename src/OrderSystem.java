public class OrderSystem {
    public static void main(String[] args) {
        System.out.println("Hello World !!");

        Menu mainMenu = new Menu();
        Menu allSides = new Menu();
        Menu limitedSides = new Menu();
        Menu drinkMenu = new Menu();

        Option veganOption = new Option("Vegetarien");
        Option chickenOption = new Option("Poulet");
        Option beefOption = new Option("Boeuf");

        mainMenu.addOption(veganOption);
        mainMenu.addOption(chickenOption);
        mainMenu.addOption(beefOption);

        Option vegetableSide = new Option ("Legumes");
        Option frieSide = new Option ("Frites");
        Option riceSide = new Option ("Riz");
        Option noriceSide = new Option ("Pas de riz");

        allSides.addOption(vegetableSide);
        allSides.addOption(frieSide);
        allSides.addOption(riceSide);

        limitedSides.addOption(riceSide);
        limitedSides.addOption(noriceSide);

        veganOption.setSubMenu(limitedSides);
        chickenOption.setSubMenu(allSides);
        beefOption.setSubMenu(allSides);

        Option flatWaterDrink = new Option("Eau Plate");
        Option gazedWaterDrink = new Option("eau gazeuze");
        Option sodaDrink = new Option("soda");

        drinkMenu.addOption(flatWaterDrink);
        drinkMenu.addOption(gazedWaterDrink);
        drinkMenu.addOption(sodaDrink);

        mainMenu.run();
        drinkMenu.run();


        System.out.println("================");
        //mainMenu.displayAllChosen(); // fixme bugged function in Menu , to correct
        //drinkMenu.displayAllChosen();
    }

}
