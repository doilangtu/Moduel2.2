package Models;

public class House extends Services{
    private String numberOfFloors;
    private String roomStandard;
    private String otherDescriptionOfUtilities;

    public House() {
    }

    public House(String numberOfFloors, String roomStandard, String otherDescriptionOfUtilities) {
        this.numberOfFloors = numberOfFloors;
        this.roomStandard = roomStandard;
        this.otherDescriptionOfUtilities = otherDescriptionOfUtilities;
    }

    public House(String id, String nameService, double useArea, double rentsCost, String typeOfRents, double amountPeople, String numberOfFloors, String roomStandard, String otherDescriptionOfUtilities) {
        super(id, nameService, useArea, rentsCost, typeOfRents, amountPeople);
        this.numberOfFloors = numberOfFloors;
        this.roomStandard = roomStandard;
        this.otherDescriptionOfUtilities = otherDescriptionOfUtilities;
    }

    public String getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(String numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
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

    @Override
    public String showInformation() {
        return  "...." +super.toString()


                +"\n The number of floor is :" +this.numberOfFloors
                +"\n The Standard Of Room :" +this.roomStandard
                +"\n The Other Description Of Utilities :" +this.otherDescriptionOfUtilities
                ;
    }

}
