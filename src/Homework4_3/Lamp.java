package Homework4_3;

public class Lamp implements Switchable , Dimmable {

    int brightness=0;
    boolean on =false;

    @Override
    public void turnOn () {
        this.on =true;
    }
    @Override
    public void turnOff () {
        this.on =false;
    }
    @Override
    public boolean isOn (){
        return on;
    }
    @Override
    public void setBrightness (int level) {
        if (level>=0&&level<=100) this.brightness=level;
        else if (level>100) this.brightness = 100;
        else {
            this.brightness=0;
        }
    }
    @Override
    public int getBrightness () {
        return this.brightness;
    }
    public void dimToHalf () {
        setBrightness((int) (50));
    }
}
