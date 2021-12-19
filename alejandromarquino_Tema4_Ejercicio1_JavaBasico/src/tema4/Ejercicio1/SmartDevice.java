package tema4.Ejercicio1;

public class SmartDevice {
    public static String fabricante;
    public static String modelo;
    public String color;
    public static int anyoFabricacion;
    public static Double versionSO;
    public static boolean conexionWifi;


    public SmartDevice() {
    }

    public SmartDevice(String fabricante, String modelo, int anyoFabricacion, Double versionSO, boolean conexionWifi) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.anyoFabricacion = anyoFabricacion;
        this.versionSO = versionSO;
        this.conexionWifi = conexionWifi;
    }


    public static class SmartPhone extends SmartDevice {
        public static boolean version;
        public static boolean camara;
        public static String tamanyo;

        public SmartPhone() {
        }


        public SmartPhone(String fabricante, String modelo, int anyoFabricacion, Double versionSO, boolean conexionWifi, boolean camara, String tamanyo) {
            super(fabricante, modelo, anyoFabricacion, versionSO, conexionWifi);
            this.camara = camara;
            this.tamanyo = tamanyo;
        }

    }

    public static class SmartWatch extends SmartDevice {
        public static boolean despertador;
        public static String colorCorrea;

        public SmartWatch() {
        }


        public SmartWatch(String fabricante, String modelo, int anyoFabricacion, Double versionSO, boolean conexionWifi, boolean despertador, String colorCorrea) {
            super(fabricante, modelo, anyoFabricacion, versionSO, conexionWifi);
            this.despertador = despertador;
            this.colorCorrea = colorCorrea;
        }
    }
}


















