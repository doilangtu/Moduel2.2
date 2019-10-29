package Controllers;
//import Commons.FunctionWriteAndReadFileCSV;

import Common.CheckValidate;
import Common.FunctionWriteAndReadFileCSV;
import Common.SortName;
import Models.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class MainController {
    public static Scanner sc = new Scanner(System.in);


    MainController mainController = new MainController();

    private static Services addNewService(Services services) {
        String content = "";
        String erMes = "";
        services.setId(UUID.randomUUID().toString().replace("-", ""));
        sc.nextLine();
        System.out.println("Enter Name Service");
        services.setNameService(sc.nextLine());

        while (!CheckValidate.checkNameServies(services.getNameService())) {
            System.out.println("Name Service In Valid.Please Try Again");
            System.out.println("Enter Name Service");
            services.setNameService(sc.nextLine());
        }

//Enter Area used
        content = "Enter Area Used";
        erMes = "Area Used Is Invalid (Area >30,Area Must Be A Double).Please Try Again";
        services.setUseArea(CheckValidate.checkDouble(content, erMes));
        while (services.getUseArea() > 30) {
            System.out.println(erMes);
            services.setUseArea(CheckValidate.checkDouble(content, erMes));
        }
        //Enter rent cost
        content = "Enter Rent cost";
        erMes = "Area Used Is Invalid (Rent Cost <0,Area Must Be A Double).Please Try Again";
        services.setRentsCost(CheckValidate.checkDouble(content, erMes));
        while (services.getRentsCost() <= 0) {
            System.out.println(erMes);
            services.setRentsCost(CheckValidate.checkDouble(content, erMes));
        }


        System.out.println("Enter Type Of Rent");
        sc.nextLine();
        while (!CheckValidate.checkNameServies(services.getTypeOfRents())) {
            System.out.println("Enter Type Of Rent");
            sc.nextLine();
        }
        services.setTypeOfRents(sc.nextLine());

        content = "Enter Amount People";
        erMes = "Amount In People InValid!!!(Number Of People >0 And <20";
        services.setAmountPeople(CheckValidate.checkDouble(content, erMes));
        while (services.getAmountPeople() <= 0 || services.getAmountPeople() >= 20) {
            System.out.println(erMes);
            services.setAmountPeople(CheckValidate.checkDouble(content, erMes));
        }

        return services;
    }

    private static void backToMenu() {
        System.out.println("===========press any key to back to menu=============");
        sc.nextLine();
        displayMainMenu();
    }

    private static void addNewVilla() {
        System.out.println("==============Villa===========");
        ArrayList<Villa> oldlist = FunctionWriteAndReadFileCSV.getVillaFromCSV();
        Services villa = new Villa();
        addNewService(villa);
        System.out.println("Enter Pool Area");
        ((Villa) villa).setPoolArea(sc.nextInt());
        System.out.println("Enter room standard");
        sc.nextLine();
        ((Villa) villa).setRoomStandard(sc.nextLine());
        while (!CheckValidate.checkNameServies(((Villa) villa).getRoomStandard())) {
            System.out.println("Enter room standard");

            ((Villa) villa).setRoomStandard(sc.nextLine());
        }
        ;
        System.out.println("Enter Description");
        ((Villa) villa).setOtherDescriptionOfUtilities(sc.nextLine());


        CheckValidate.checkInteger("Enter Amount Floors", "Failed");
        while (!(((Villa) villa).getNumberOfFloors() > 0)) {
            System.out.println("Enter Amount Floor");
            ((Villa) villa).setNumberOfFloors(sc.nextDouble());
        }

//        ArrayList<Villa> listVilla = new ArrayList<Villa>();
        oldlist.add((Villa) villa);
        FunctionWriteAndReadFileCSV.writeVillaToCSV(oldlist);
        System.out.println("\nAdd Villa: " + villa.getNameService() + " Successfully");
        sc.nextLine();
        backToMenu();
    }

    private static void addNewHouse() {
        System.out.println("==============House===========");
        ArrayList<House> oldlist = FunctionWriteAndReadFileCSV.getHouseFromCSV();
        Services house = new House();
        addNewService(house);

        System.out.println("Enter number of Floors");

        ((House) house).setNumberOfFloors(sc.nextLine());
        System.out.println("Enter room Standard");
        ((House) house).setRoomStandard(sc.nextLine());
        System.out.println("Enter other Description Of Utilities ");
        ((House) house).setOtherDescriptionOfUtilities(sc.nextLine());

//        ArrayList<House> listHouse = new ArrayList<House>();
        oldlist.add((House) house);
        FunctionWriteAndReadFileCSV.writeHouseToCSV(oldlist);
        System.out.println("\nAdd House: " + house.getNameService() + " Successfully");
        sc.nextLine();
        backToMenu();
    }

    private static void addNewRoom() {
        System.out.println("==============Room===========");
        ArrayList<Room> oldlist = FunctionWriteAndReadFileCSV.getRoomFromCSV();
        Services room = new Room();
        addNewService(room);

        System.out.println("Enter associatedServiceName");
        ((Room) room).setAssociatedServiceName(sc.nextLine());

        ArrayList<Room> listRoom = new ArrayList<Room>();
        oldlist.add((Room) room);
        FunctionWriteAndReadFileCSV.writeRoomToCSV(oldlist);
        System.out.println("\nAdd Room: " + room.getNameService() + " Successfully");
        sc.nextLine();
        backToMenu();
    }

    public static void displayMainMenu() {
        System.out.println("1.Add new service");
        System.out.println("2.Show service");
        System.out.println("3.Add New customer");
        System.out.println("4.Show Information Customer");
        System.out.println("5.Add New Booking Resort");
        System.out.println("6.Exit");
        int input = sc.nextInt();
        switch (input) {
            case 1:
                addNewServices();
                break;
            case 2:
                showServices();
                break;
            case 3:
                addNewCustomer();
                break;
            case 4:
                showInformationCustomer();
                break;
            case 5:
                addNewBookingResort();
                break;
            case 6:
                System.exit(5);
            default:
                System.out.println("false");
                break;
        }
    }

    private static void addNewServices() {
        System.out.println("1.Add new Villa");
        System.out.println("2.Add new House");
        System.out.println("3.Add new Room");
        System.out.println("4.Back to menu");
        System.out.println("5.Exit");
        int input = sc.nextInt();
        switch (input) {
            case 1:
                addNewVilla();
                break;
            case 2:
                addNewHouse();
                break;
            case 3:
                addNewRoom();
                break;
            case 4:
                displayMainMenu();
                break;
            case 5:
                System.exit(0);
            default:
                System.out.println("false");
                backToMenu();
        }
    }

    public static void addNewCustomer() {
        String content = "";
        String erMes = "";
        Customer cus = new Customer();
        cus.setId(UUID.randomUUID().toString().replace("-", ""));

        System.out.println("=========Customer===========");
        ArrayList<Customer> oldlist = FunctionWriteAndReadFileCSV.getCustomerFromCSV();
        sc.nextLine();
        System.out.println("Enter Name Customer :");
        cus.setCustomerName(sc.nextLine());
        while (!CheckValidate.checkNameCustomer(cus.getCustomerName())) {
            System.out.println("Enter Name Customer :");
            cus.setCustomerName(sc.nextLine());
        }


        System.out.println("BirthDay of Customer (Ex:dd/MM/yyyy):");
        cus.setBirthdayCustomer(sc.nextLine());
        while (!CheckValidate.checkBirthday(cus.getBirthdayCustomer())) {
            System.out.println("This is not birth day.Please Try Again");
            System.out.println("BirthDay of Customer (Ex:dd/MM/yyyy):");
            cus.setBirthdayCustomer(sc.nextLine());
        }

        System.out.println("Enter Gender Of Customer(Male/Female/Unknow:");
        cus.setGender(sc.nextLine());
        CheckValidate.checkGender(cus.getGender());

        //Check IdCard
        content = "Id Card Of Customer(From 10000000 To 999999999";
        erMes = "IdCard should be from 100000000 to 999999999 And one number integer";
        cus.setIdCard(CheckValidate.checkInteger(content, erMes));
        while (cus.getIdCard() <= 10000000 || cus.getIdCard() >= 999999999) {
            System.out.println(erMes);
            cus.setIdCard(CheckValidate.checkInteger(content, erMes));
        }
        content = "Mobile Phone Of Customer(From 0350000000 To 999999999";
        erMes = "Mobile should be from 100000000 to 999999999 And one number integer";
        cus.setMobilePhone(CheckValidate.checkInteger(content, erMes));
        while (cus.getMobilePhone() <= 10000000 || cus.getMobilePhone() >= 900000000) {
            System.out.println(erMes);
            cus.setIdCard(CheckValidate.checkInteger(content, erMes));
        }

        System.out.println("Enter Email Of Customer(Ex:...@gmail.com) :");
        cus.setEmail(sc.nextLine());
        while (!CheckValidate.checkEmail(cus.getEmail())) {
            System.out.println("Enter Email Of Customer(Ex:...@gmail.com) :");
            cus.setEmail(sc.nextLine());
        }
        System.out.println("Type Of Customer :");
        cus.setTypeOfCustomer(sc.nextLine());
        System.out.println("Enter Address Of Customer :");
        cus.setAddress(sc.nextLine());
        oldlist.add(cus);
        FunctionWriteAndReadFileCSV.writeCustomerToCSV(oldlist);
        System.out.println("Add New Customer " + cus.getCustomerName() + "Successfully");
        backToMenu();
    }

    public static void showInformationCustomer() {
        System.out.println("========ShowInfo Customer ==========");
        ArrayList<Customer> listCus = FunctionWriteAndReadFileCSV.getCustomerFromCSV();
        //sort
        listCus.sort(new SortName());
        for (Customer cus : listCus) {
            System.out.println("-------------");
            System.out.println(cus.toString());
        }

    }

    private static void showServices() {
        System.out.println("\n==========ShowInfo==========" +
                "\n1.Show All Villa." +
                "\n2.Show All House." +
                "\n3.Show All Room." +
                "\n4.Show All Name Villa Not Duplicate." +
                "\n5. Show All Name House Not Duplicate" +
                "\n6. Show All Name Name Not Duplicate\n" +
                "\n7.Back to Menu." +
                "\n8.Exit.");
        switch (sc.nextInt()) {
            case 1:
                showAllVilla();
                displayMainMenu();
            case 2:
                showAllHouse();
                break;
            case 3:
                showAllRoom();
                break;
            case 4:
                displayMainMenu();
                break;
            case 5:
                System.exit(0);
            default:
                System.out.println("Error");
                backToMenu();
        }
    }

    private static void showAllVilla() {
        ArrayList<Villa> listVilla = FunctionWriteAndReadFileCSV.getVillaFromCSV();
        for (Villa villa : listVilla) {
            System.out.println("\n=================");
            System.out.println(villa.showInformation());
            System.out.println("\n=================");
        }
    }

    private static void showAllHouse() {
        ArrayList<House> listHouse = FunctionWriteAndReadFileCSV.getHouseFromCSV();
        for (House house : listHouse) {
            System.out.println("\n=================");
            System.out.println(house.showInformation());
            System.out.println("\n=================");
        }
    }

    private static void showAllRoom() {
        ArrayList<Room> listRoom = FunctionWriteAndReadFileCSV.getRoomFromCSV();
        for (Room room : listRoom) {
            System.out.println("\n=================");
            System.out.println(room.showInformation());
            System.out.println("\n=================");
        }
    }
    private static void addNewBookingResort(){
        ArrayList<Customer> listCustomer = FunctionWriteAndReadFileCSV.getCustomerFromCSV();

        listCustomer.sort(new SortName());
        int i=1;
        for (Customer customer: listCustomer)
             {
                 System.out.println("-----------");
                 System.out.println("No: " +i);
                 System.out.println("-----------");
                 i++;
        }
        System.out.println("Choose customer Booking");
        Customer customer = listCustomer.get(sc.nextInt()-1);
        System.out.println("\n1.  Booking Villa"+
        "\n2. Booking  House"+
        "\n3. Booking  Room"
);
        int choose = sc.nextInt();
        switch (choose){
            case 1:
                i = 1;
                ArrayList<Villa> listVillas = FunctionWriteAndReadFileCSV.getVillaFromCSV();
                for (Villa villa: listVillas
                     ) {
                    System.out.println("--------------");
                    System.out.println("No" +i);
                    System.out.println(villa.showInformation());
                    System.out.println("===============");
                    i++;
                }
                System.out.println("Choose Villa booking");
                Villa villa = listVillas.get(sc.nextInt()-1);
                customer.setServices(villa);
                break;
            case 2:
                ArrayList<House> listHouse = FunctionWriteAndReadFileCSV.getHouseFromCSV();
                i=1;
                for (House house:listHouse
                     ) {
                    System.out.println("==============");
                    System.out.println("No "+i);
                    System.out.println(house.showInformation());
                    System.out.println("==============");
                    i++;
                }
                System.out.println("Choose Hosed Booking");
                House house  = listHouse.get(sc.nextInt()-1);
                customer.setServices(house);
                break;
            case 3:
                ArrayList<Room> listRoom = FunctionWriteAndReadFileCSV.getRoomFromCSV();
                i=1;
                for (Room room:listRoom
                ) {
                    System.out.println("==============");
                    System.out.println("No "+i);
                    System.out.println(room.showInformation());
                    System.out.println("==============");
                    i++;
                }
                System.out.println("Choose Hosed Booking");
                Room room  = listRoom.get(sc.nextInt()-1);
                customer.setServices(room);
            default:
                backToMenu();
                break;
        }
        ArrayList<Customer> oldListBooking = FunctionWriteAndReadFileCSV.getBookingFromCSV();
        oldListBooking.add(customer);
        FunctionWriteAndReadFileCSV.writeCustomerToCSV(oldListBooking);
        System.out.println("\n Add Booking for :"+ customer.getCustomerName() +"Successfully");
        sc.nextLine();
        backToMenu();
    }

}





