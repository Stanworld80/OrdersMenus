public class Option {
    String name;
    Menu subMenu = null;

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
