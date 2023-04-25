package com.vetl.oop.lesson2;

public class Computer {
    private int ssd = 500;
    private long ram;

    Computer(int newSsd) {
        ssd = newSsd;
    }

    protected Computer(int ssd, long newRam) {
        this.ssd = ssd;
        ram = newRam;
    }

    public Computer() {
        System.out.println("Я был создан");
    }

//    Computer(long newRam, int ssd) {
//        this.ssd = ssd;
//        ram = newRam;
//    }
    void load() {
        System.out.println("Я загрузился");
    }

    void load(boolean open) {
        System.out.println("Я загрузился");
        if (open) {
            System.out.println("Я открыл крышку");
        }

    }
//      [модификаторы] returnValue name([params])
    void printState() {
        System.out.println("Ssd: " + ssd);
        System.out.println("Ram: " + ram);
        System.out.println();
    }
}
