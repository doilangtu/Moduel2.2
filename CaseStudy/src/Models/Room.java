package Models;

public class Room extends Services {
    private String associatedServiceName;

    public Room() {
    }

    public Room(String id, String nameService, double useArea, double rentsCost, String typeOfRents, int amountPeople) {
        super(id, nameService, useArea, rentsCost, typeOfRents, amountPeople);
    }

    public Room(String associatedServiceName) {
        this.associatedServiceName = associatedServiceName;
    }

    public Room(String id, String nameService, double useArea, double rentsCost, String typeOfRents, int amountPeople, String associatedServiceName) {
        super(id, nameService, useArea, rentsCost, typeOfRents, amountPeople);
        this.associatedServiceName = associatedServiceName;
    }

    public String getAssociatedServiceName() {
        return associatedServiceName;
    }

    public void setAssociatedServiceName(String associatedServiceName) {
        this.associatedServiceName = associatedServiceName;
    }

    @Override
    public String showInformation(){
        return  "...."+super.toString()
                +"\n the associated Service Name "+this.associatedServiceName;
}
}
