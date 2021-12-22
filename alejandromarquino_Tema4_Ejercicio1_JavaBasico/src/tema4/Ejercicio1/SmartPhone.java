package tema4.Ejercicio1;



public class SmartPhone extends SmartDevice {

    boolean camara;
    String tamanyo;

    public SmartPhone() {
    }

    public SmartPhone(String fabricante, String modelo, String color, int anyoFabricacion, Double versionSO, boolean conexionWifi, boolean camara, String tamanyo) {
        super(fabricante, modelo, color, anyoFabricacion, versionSO, conexionWifi);
        this.camara = camara;
        this.tamanyo = tamanyo;
    }

    public String toString(){
        return fabricante+" / "+modelo+" / "+ color+" / "+ anyoFabricacion+ " / "+versionSO+" / "+ conexionWifi+" / "+camara+" / "+tamanyo;
    }
}
