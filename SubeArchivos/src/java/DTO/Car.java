
package DTO;

public class Car {
private String id;
private String brand;
private int year;
private String color;
private int price; 
private boolean soldState;
    
    
  public  Car(String randomId, String randomBrand, int randomYear, String randomColor, int randomPrice, boolean randomSoldState) {
        this.id = randomId;
        this.brand = randomBrand;
        this.year = randomYear;
        this.color = randomColor;
        this.price = randomPrice; 
        this.soldState = randomSoldState;
    }

    /**
     * @return the randomId
     */
    public String getId() {
        return id;
    }

    /**
     * @param randomId the randomId to set
     */
    public void setId(String randomId) {
        this.id = randomId;
    }

    /**
     * @return the randomBrand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param randomBrand the randomBrand to set
     */
    public void setBrand(String randomBrand) {
        this.brand = randomBrand;
    }

    /**
     * @return the randomYear
     */
    public int getYear() {
        return year;
    }

    /**
     * @param randomYear the randomYear to set
     */
    public void setYear(int randomYear) {
        this.year = randomYear;
    }

    /**
     * @return the randomColor
     */
    public String getColor() {
        return color;
    }

    /**
     * @param randomColor the randomColor to set
     */
    public void setColor(String randomColor) {
        this.color = randomColor;
    }

    /**
     * @return the randomPrice
     */
    public int getPrice() {
        return price;
    }

    /**
     * @param randomPrice the randomPrice to set
     */
    public void setPrice(int randomPrice) {
        this.price = randomPrice;
    }

    /**
     * @return the randomSoldState
     */
    public boolean isSoldState() {
        return soldState;
    }

    /**
     * @param randomSoldState the randomSoldState to set
     */
    public void setSoldState(boolean randomSoldState) {
        this.soldState = randomSoldState;
    }
    
    
}
