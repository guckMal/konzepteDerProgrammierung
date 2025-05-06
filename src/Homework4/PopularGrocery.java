package Homework4;

public abstract class PopularGrocery extends GroceryItem{
    int popularityLevel;
    int quantity;
    public PopularGrocery(int popularityLevel){
        this.isPopular=true;
        this.popularityLevel= popularityLevel;
    }
    public boolean showWarning(){
        return quantity > householdLimit;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
