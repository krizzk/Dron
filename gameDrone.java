package Drone;

// import Drone.drone1;

public class gameDrone {
        public static void main(String[] args) {
        drone1 epep = new drone1();

        epep.energi = 100;
        epep.kecepatan = 50;
        epep.ketinggian = 20;
        epep.merek = "Kriz";

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//
        
        epep.merek();
        epep.terbang();
        epep.mundur();
        epep.belok();
        epep.turun();
        epep.turun();
        epep.matikanMesin();
    }
}