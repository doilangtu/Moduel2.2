package Models;

public class accompaniedService  {
    private String nameAssociatedService;
    private String Unit;
    private float Price;

    public accompaniedService() {
    }

    public accompaniedService(String nameAssociatedService, String unit, float price) {
        this.nameAssociatedService = nameAssociatedService;
        Unit = unit;
        Price = price;
    }

    public String getNameAssociatedService() {
        return nameAssociatedService;
    }

    public void setNameAssociatedService(String nameAssociatedService) {
        this.nameAssociatedService = nameAssociatedService;
    }

    public String getUnit() {
        return Unit;
    }

    public void setUnit(String unit) {
        Unit = unit;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float price) {
        Price = price;
    }
}
