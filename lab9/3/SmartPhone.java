class SmartPhone {
    String number;
    String brand;
    String os;
    int ram;
    int rom;

    SmartPhone(String number, String brand, String os, int ram, int rom) {
        this.number = number;
        this.brand = brand;
        this.os = os;
        this.ram = ram;
        this.rom = rom;
    }

    public String getNumber() {
        return number;
    }

    public String getBrand() {
        return brand;
    }

    public int getRom() {
        return rom;
    }

    public String getOs() {
        return os;
    }

    public int getRam() {
        return ram;
    }

    public String toString() {
        return "Number: " + number + ", Brand: " + brand + ", OS: " + os + ", RAM: " + ram + " GB, ROM: " + rom + " GB";
    }
}
