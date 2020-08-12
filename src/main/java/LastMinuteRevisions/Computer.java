package LastMinuteRevisions;

public class Computer {

    String name;
    int ram;
    int price;

    public Computer(String name, int ram, int price) {
        super();
        this.name = name;
        this.ram = ram;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public int getRam() {
        return ram;
    }
    public void setRam(int ram) {
        this.ram = ram;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

}