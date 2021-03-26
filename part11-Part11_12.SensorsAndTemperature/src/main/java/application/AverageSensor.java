/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author musa
 */
public class AverageSensor implements Sensor {

    private List<Sensor> sensorList;
    private List<Integer> averagesList;

    public AverageSensor() {
        this.sensorList = new ArrayList<>();
        this.averagesList = new ArrayList<>();
    }

    public void addSensor(Sensor toAdd) {
        sensorList.add(toAdd);
    }

    @Override
    public boolean isOn() {
        boolean isOn = false;

        for (Sensor sensor : sensorList) {
            if (sensor.isOn() == true) {
                isOn = true;
            } else {
                isOn = false;
                break;
            }
        }
        return isOn;
    }

    @Override
    public void setOn() {
        sensorList.forEach((sensor) -> {
            sensor.setOn();
        });
    }

    @Override
    public void setOff() {
        sensorList.forEach((sensor) -> {
            sensor.setOff();
        });
    }

    @Override
    public int read() {
        int sum = 0;
        if (isOn() && !sensorList.isEmpty()) {
            //I've used a functional operation but a basic forEach loop also works:
            /*
            for(Sensor sensor : sensorList){
            sum += sensor.read()
            }
             */
            sum = sensorList.stream()
                    .map((sensor) -> sensor.read())
                    .reduce(sum, Integer::sum);

            int average = sum / sensorList.size();
            averagesList.add(average);

            return average;
        } else {
            throw new IllegalStateException();
        }
    }

    public List<Integer> readings() {
        return averagesList;
    }

}
