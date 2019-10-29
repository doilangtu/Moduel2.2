package Models;

public class Villa extends Services{

    private int poolArea;
    private String roomStandard;
    private String otherDescriptionOfUtilities;
    private double numberOfFloors;

    public Villa() {
    }

    public Villa(int poolArea, String roomStandard, String otherDescriptionOfUtilities, double numberOfFloors) {
        this.poolArea = poolArea;
        this.roomStandard = roomStandard;
        this.otherDescriptionOfUtilities = otherDescriptionOfUtilities;
        this.numberOfFloors = numberOfFloors;
    }

    public Villa(String id, String nameService, double useArea, double rentsCost, String typeOfRents, int amountPeople, int poolArea, String roomStandard, String otherDescriptionOfUtilities, double numberOfFloors) {
        super(id, nameService, useArea, rentsCost, typeOfRents, amountPeople);
        this.poolArea = poolArea;
        this.roomStandard = roomStandard;
        this.otherDescriptionOfUtilities = otherDescriptionOfUtilities;
        this.numberOfFloors = numberOfFloors;
    }

    public int getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(int poolArea) {
        this.poolArea = poolArea;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getOtherDescriptionOfUtilities() {
        return otherDescriptionOfUtilities;
    }

    public void setOtherDescriptionOfUtilities(String otherDescriptionOfUtilities) {
        this.otherDescriptionOfUtilities = otherDescriptionOfUtilities;
    }

    public double getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(double numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String showInformation(){
        return  "Name Service is : " + super.nameService
                +"\nThe Area Used is : " + super.useArea
                +"\n The Cost Of Rents :" +super.rentsCost
                +"\n The Type Of Rents :"+super.typeOfRents

                +"\n The Standard Of Room :" +this.roomStandard
                +"\n The Other Description Of Utilities :" +this.otherDescriptionOfUtilities
                +"\n The pool Area is :" +this.poolArea
                +"\n The number of floor is :" +this.numberOfFloors
                ;
    };
}
