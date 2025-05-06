package Homework4_3;

public interface Dimmable {
    final int MAX_BRIGHTNESS=100;
    public void setBrightness (int level);
    public int getBrightness () ;
    default void dimToHalf (){
        setBrightness(MAX_BRIGHTNESS/2);
    }
}
