package Models;

public abstract class Services {
    protected String id;
    protected String nameService;
    protected double useArea;
    protected double rentsCost;
    protected String typeOfRents;
    protected double amountPeople;

    public Services() {
    }

    public Services(String id, String nameService, double useArea, double rentsCost, String typeOfRents, double amountPeople) {
        this.id = id;
        this.nameService = nameService;
        this.useArea = useArea;
        this.rentsCost = rentsCost;
        this.typeOfRents = typeOfRents;
        this.amountPeople = amountPeople;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getUseArea() {
        return useArea;
    }

    public void setUseArea(double useArea) {
        this.useArea = useArea;
    }

    public double getRentsCost() {
        return rentsCost;
    }

    public void setRentsCost(double rentsCost) {
        this.rentsCost = rentsCost;
    }

    public String getTypeOfRents() {
        return typeOfRents;
    }

    public void setTypeOfRents(String typeOfRents) {
        this.typeOfRents = typeOfRents;
    }

    public double getAmountPeople() {
        return amountPeople;
    }

    public void setAmountPeople(double amountPeople) {
        this.amountPeople = amountPeople;
    }

    @Override
    public String toString() {
        return "Services{" +
                "nameService='" + nameService + '\'' +
                ", useArea=" + useArea +
                ", rentsCost=" + rentsCost +
                ", typeOfRents='" + typeOfRents + '\''+
                ", amount people ='" + amountPeople + '\'';
    }

    public abstract String showInformation();
}
