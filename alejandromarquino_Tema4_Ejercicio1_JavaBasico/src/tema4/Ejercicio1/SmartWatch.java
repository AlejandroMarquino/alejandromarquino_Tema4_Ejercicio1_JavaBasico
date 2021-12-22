package tema4.Ejercicio1;

public class SmartWatch extends SmartDevice {

    boolean despertador;
    String colorCorrea;

    public SmartWatch() {}

    public SmartWatch(String fabricante, String modelo, String color, int anyoFabricacion, Double versionSO, boolean conexionWifi, boolean despertador, String colorCorrea) {
        super(fabricante, modelo, color, anyoFabricacion, versionSO, conexionWifi);
        this.despertador = despertador;
        this.colorCorrea = colorCorrea;
    }

    public String toString(){
        return fabricante+" / "+modelo+" / "+ color+" / "+ anyoFabricacion+ " / "+versionSO+" / "+ conexionWifi+" / "+despertador+" / "+colorCorrea;
    }

}


