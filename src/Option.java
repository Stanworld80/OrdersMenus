public class Option {
    String name;
    Menu subMenu = null; // choosing a option in a Menu can provoque a subMenu for the user .  subMenu is a Menu

    public Option(String name) {
        this.name = name;
    }

    public void setSubMenu(Menu subMenu) {
        this.subMenu = subMenu;
    }

    public Menu getSubMenu() {
        return subMenu;
    }

    @Override
    public String toString() {
        return name;
    }
}
