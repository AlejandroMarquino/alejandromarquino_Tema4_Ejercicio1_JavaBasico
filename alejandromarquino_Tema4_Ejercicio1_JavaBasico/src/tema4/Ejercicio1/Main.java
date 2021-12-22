package tema4.Ejercicio1;

public class Main {


    public static void main(String[] args){

    SmartWatch appleWatch = new SmartWatch();
    appleWatch.fabricante = "Apple";
    appleWatch.modelo = "Apple Watch";
    appleWatch.color = "Blanco";
    appleWatch.anyoFabricacion = 2017;
    appleWatch.versionSO = 3.01;
    appleWatch.conexionWifi = true;
    appleWatch.despertador = true;
    appleWatch.colorCorrea = "Gris";

    SmartPhone iPhone = new SmartPhone("Apple", "iPhone 13", "Negro", 2019, 15.1, true, true, "MAX" );

        System.out.println(appleWatch);
        System.out.println(" ");
        System.out.println(iPhone);

    /*       SmartDevice.SmartPhone iPhone13max = new SmartDevice.SmartPhone("Apple", "iPhone 13 pro", 2021, 15.01, true, true, "Max");
        System.out.println(SmartDevice.SmartPhone.fabricante);
        System.out.println(SmartDevice.SmartPhone.modelo);
        System.out.println(SmartDevice.SmartPhone.anyoFabricacion);
        System.out.println(SmartDevice.SmartPhone.versionSO);
        System.out.println(SmartDevice.SmartPhone.conexionWifi);
        System.out.println(SmartDevice.SmartPhone.camara);
        System.out.println(SmartDevice.SmartPhone.tamanyo);


        SmartDevice.SmartWatch appleWatch = new SmartDevice.SmartWatch ("Apple", "Apple Watch", 2017, 3.1, false, true, "Blanca");
        System.out.println(SmartDevice.SmartWatch.fabricante);
        System.out.println(SmartDevice.SmartWatch.modelo);
        System.out.println(SmartDevice.SmartWatch.anyoFabricacion);
        System.out.println(SmartDevice.SmartWatch.versionSO);
        System.out.println(SmartDevice.SmartWatch.conexionWifi);
        System.out.println(SmartDevice.SmartWatch.despertador);
        System.out.println(SmartDevice.SmartWatch.colorCorrea);

        System.out.println("Fin del programa");

  */

   }
}
