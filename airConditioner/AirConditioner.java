package airConditioner;

public class AirConditioner {
    private boolean acState;
    private int temperature;
    public boolean isOn() {
        return acState;
    }

    public void turnOn() {
        acState = true;
        temperature  = 16;

    }

    public void turnOff() {
        acState = false;
    }

    public int checkTemperature() {
        return temperature;
    }

    public void increaseTemperature() {
        if(temperature<30)
            temperature +=1;
    }

    public void decrease() {
        if (temperature >16)
            temperature -=1;
    }
}
