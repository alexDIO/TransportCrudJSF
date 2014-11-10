package forweb.jsf;

import transport.TransportPropertiesHolder;
import transport.classes.Transport;
import transport.classes.TransportConverter;
import transport.classes.TransportFactory;
import transport.storages.TransportStorage;
import transport.storages.TransportStorageTXT;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.io.IOException;
import java.util.Map;

/**
 * Created by olomakovskyi on 11/6/2014.
 */

@ManagedBean(name = "manager", eager = true)
@RequestScoped
public class JSFTransportManager {
    private int id;
    private String transportType;
    private String mark;
    private String color;
    private int manufactureYear;
    private int passengersCount;
    private String energySource;
    private String transmission;
    private int load;
    private String action;
    private TransportStorage storage;
    private Map<Integer, Transport> storedTransport;

    public JSFTransportManager(){
        try {
            this.storage = new TransportStorageTXT(new TransportPropertiesHolder(), new TransportConverter(new TransportFactory()));
            storedTransport = storage.getAllTransport();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTransportType() {
        return transportType;
    }

    public void setTransportType(String transportType) {
        this.transportType = transportType;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public int getPassengersCount() {
        return passengersCount;
    }

    public void setPassengersCount(int passengersCount) {
        this.passengersCount = passengersCount;
    }

    public String getEnergySource() {
        return energySource;
    }

    public void setEnergySource(String energySource) {
        this.energySource = energySource;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public int getLoad() {
        return load;
    }

    public void setLoad(int load) {
        this.load = load;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
        switch (action){
            case "add":

        }
    }

    public Map<Integer, Transport> getStoredTransport() {
        return storedTransport;
    }

    public void setStoredTransport(Map<Integer, Transport> storedTransport) {
        this.storedTransport = storedTransport;
    }
}
