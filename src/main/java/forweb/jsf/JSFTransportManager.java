package forweb.jsf;

import forweb.TransportMapHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import transport.storages.TransportStorage;

import javax.annotation.Resource;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

/**
 * Created by olomakovskyi on 11/6/2014.
 */
@Component
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

    @ManagedProperty("#{mapHolder}")
    private TransportMapHolder mapHolder;

    private TransportStorage storage;

    public JSFTransportManager() {
        mapHolder.getMap();
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

    public TransportStorage getStorage() {
        return storage;
    }

    public void setStorage(TransportStorage storage) {
        this.storage = storage;
    }

    public TransportMapHolder getMapHolder() {
        return mapHolder;
    }

    public void setMapHolder(TransportMapHolder mapHolder) {
        this.mapHolder = mapHolder;
    }
}
