package Drone;

public class drone1 {
    
        int energi;
        int ketinggian;
        int kecepatan;
        String merek;
    
        void terbang() {
            energi--;
            if (energi > 10) {
                ketinggian++;
                System.out.println("drone terbang...");
            } else {
                System.out.println("Energi lemah: drone nggak bisa terbang");
            }
        }
        
        void matikanMesin() {
            if (ketinggian > 0) {
                System.out.println("mesin tidak bisa dimatikan karena sedang terbang");
            } else {
                System.out.println("mesin dimatikan");
            }
        }
        void merek() {
            System.out.println("Merek Drone : " + merek);
        }
    
        void turun() {
            ketinggian--;
            energi--;
            System.out.println("Drone turun");
        }
    
        void belok() {
            energi--;
            System.out.println("drone belok");
        }
    
        void maju() {
            energi--;
            System.out.println("Drone maju ke depan");
            kecepatan++;
        }
    
        void mundur()  {
            energi--;
            System.out.println("drone mundur");
            kecepatan++;
        }
    }
