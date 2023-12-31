
package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    // İki tür işlem kuyruğu tanımlanıyor: Kısa süreli ve uzun süreli
    static Queue<MyProcess> shortTermQueue = new LinkedList<>();
    static Queue<MyProcess> longTermQueue = new LinkedList<>();

    public static void main(String[] args) {

        // Kuyruklara işlem ekleme örneği

        for (int i = 0; i < 10; i++) {   

        // 10 işlemi rastgele sürelerle oluşturup kuyruklara ekliyor

            MyProcess process = new MyProcess(i, getRandomDuration());
            if (process.getDuration() <= 5) {
                shortTermQueue.add(process);
            } else {
                longTermQueue.add(process);
            }
        }

        // Kuyrukları işle...
    }

    // 1 ile 10 arasında rastgele süre üreten metod
    private static int getRandomDuration() {
        return (int) (Math.random() * 10 + 1); 
    }
}

class MyProcess {
    private int id;
    private int duration;

    public MyProcess(int id, int duration) {
        this.id = id;
        this.duration = duration;
    }

    // İşlem ID'sini döndüren metod
    public int getId() {
        return id;
    }

    // İşlem süresini döndüren metod
    public int getDuration() {
        return duration;
    }
}
