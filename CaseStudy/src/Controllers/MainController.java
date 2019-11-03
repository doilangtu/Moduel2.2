package Controllers;
//import Commons.FunctionWriteAndReadFileCSV;

import Common.CheckValidate;
import Common.FunctionWriteAndReadFileCSV;
import Common.SortName;
import Models.*;

import java.util.HashMap;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class MainController {
    public static Scanner sc = new Scanner(System.in);
    private static Queue<Customer> customerQueue = new LinkedList<Customer>();

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
        services.setTypeOfRents(sc.nextLine());
        while (!CheckValidate.checkNameServies(services.getTypeOfRents())) {
            System.out.println("Enter Type Of Rent");
            services.setTypeOfRents(sc.nextLine());
        }


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
        sc.nextLine();
        System.out.println("Enter room standard");

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

    public static void addNewEmployees() {
        System.out.println("==================ADD NEW EMPLOYEES================");
        ArrayList<Employee> oldlist = FunctionWriteAndReadFileCSV.getEmployees();
        Employee employee = new Employee();
        System.out.println("Enter Id Emloyees");
        sc.nextLine();
        employee.setId(sc.nextInt());

        System.out.println(" Enter Name Emloyees");
        employee.setEmployeeName(sc.nextLine());
        System.out.println("Enter Address Emloyees");
        employee.setEmployeeAddress(sc.nextLine());
        System.out.println("Age Emloyees");
        employee.setAge(sc.nextInt());
        oldlist.add(employee);
        FunctionWriteAndReadFileCSV.writeEmployeesToCSV(oldlist);
        System.out.println("\nAdd Name Employees: " + employee.getEmployeeName() + " Id : " + employee.getId() + " Successfully");
        sc.nextLine();
        backToMenu();
    }

    public static void displayMainMenu() {
        System.out.println("1.Add new service");
        System.out.println("2.Show service");
        System.out.println("3.Add New customer");
        System.out.println("4.Add New Employees");
        System.out.println("5.Show Information Customer");
        System.out.println("6.Add New Booking Resort");
        System.out.println("7.Show Information Employee");
        System.out.println("8.Show List Customer BuyTicket");
        System.out.println("9.Find Employees In Cabinet ");

        System.out.println("10.Exit");
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
                addNewEmployees();
                break;
            case 5:
                showInformationCustomer();
                break;
            case 6:
                addNewBookingResort();
                break;
            case 7:
                showInformationEmployee();
                break;
            case 8:
                ListCustomerBuyMovieTicker4D();
                break;
            case 9:
                findInformationEmployee();
                break;
            case 10:
                System.exit(10);
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
        cus.setGender(CheckValidate.checkGender(sc.nextLine()));
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
                showAllNameVillaNotDuplicate();
                break;
            case 5:
                showAllNameHouseNotDuplicate();

                break;
            case 6:
                showAllNameRoomNotDuplicate();
                break;
            case 7:
                displayMainMenu();
                break;
            case 8:
                System.exit(7);
                break;
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

    private static void addNewBookingResort() {
        ArrayList<Customer> listCustomer = FunctionWriteAndReadFileCSV.getCustomerFromCSV();

        listCustomer.sort(new SortName());
        int i = 1;
        for (Customer customer : listCustomer) {
            System.out.println("-----------");
            System.out.println("No: " + i);
            System.out.println("-----------");
            i++;
        }
        System.out.println("Choose customer Booking");
        Customer customer = listCustomer.get(sc.nextInt() - 1);
        System.out.println("\n1.  Booking Villa" +
                "\n2. Booking  House" +
                "\n3. Booking  Room"
        );
        int choose = sc.nextInt();
        switch (choose) {
            case 1:
                i = 1;
                ArrayList<Villa> listVillas = FunctionWriteAndReadFileCSV.getVillaFromCSV();
                for (Villa villa : listVillas
                ) {
                    System.out.println("--------------");
                    System.out.println("No" + i);
                    System.out.println(villa.showInformation());
                    System.out.println("===============");
                    i++;
                }
                System.out.println("Choose Villa booking");
                Villa villa = listVillas.get(sc.nextInt() - 1);
                customer.setServices(villa);
                break;
            case 2:
                ArrayList<House> listHouse = FunctionWriteAndReadFileCSV.getHouseFromCSV();
                i = 1;
                for (House house : listHouse
                ) {
                    System.out.println("==============");
                    System.out.println("No " + i);
                    System.out.println(house.showInformation());
                    System.out.println("==============");
                    i++;
                }
                System.out.println("Choose Hosed Booking");
                House house = listHouse.get(sc.nextInt() - 1);
                customer.setServices(house);
                break;
            case 3:
                ArrayList<Room> listRoom = FunctionWriteAndReadFileCSV.getRoomFromCSV();
                i = 1;
                for (Room room : listRoom
                ) {
                    System.out.println("==============");
                    System.out.println("No " + i);
                    System.out.println(room.showInformation());
                    System.out.println("==============");
                    i++;
                }
                System.out.println("Choose Hosed Booking");
                Room room = listRoom.get(sc.nextInt() - 1);
                customer.setServices(room);
            default:
                backToMenu();
                break;
        }
        ArrayList<Customer> oldListBooking = FunctionWriteAndReadFileCSV.getBookingFromCSV();
        oldListBooking.add(customer);
        FunctionWriteAndReadFileCSV.writeBookingToCSV(oldListBooking);
        System.out.println("\n Add Booking for :" + customer.getCustomerName() + "Successfully");
        sc.nextLine();
        backToMenu();
    }

    private static void showAllNameVillaNotDuplicate() {
        String pathVilla = "src/Data/Villa.csv";
        Path path = Paths.get(pathVilla);
        if (!Files.exists(path)) {
            System.out.println("File villa doew note exist");
        } else {
            TreeSet<String> listVillaTreeSet = FunctionWriteAndReadFileCSV.getNameServiceFromToCSV(pathVilla);
            System.out.println("\n List name service Villa not Duplicate");
            for (String str : listVillaTreeSet
            ) {
                System.out.println("==================");
                System.out.println(str);
                System.out.println("==================");

            }
        }
        sc.nextLine();
        backToMenu();
    }

    private static void showAllNameHouseNotDuplicate() {
        String pathHouse = "src/Data/House.csv";
        Path path = Paths.get(pathHouse);
        if (!Files.exists(path)) {
            System.out.println("File House doew note exist");
        } else {
            TreeSet<String> listHouseTreeSet = FunctionWriteAndReadFileCSV.getNameServiceFromToCSV(pathHouse);
            System.out.println("\n List name service House not Duplicate");
            for (String str : listHouseTreeSet
            ) {
                System.out.println("==================");
                System.out.println(str);
                System.out.println("==================");

            }
        }
        sc.nextLine();
        backToMenu();
    }

    private static void showAllNameRoomNotDuplicate() {
        String pathRoom = "src/Data/Room.csv";
        Path path = Paths.get(pathRoom);
        if (!Files.exists(path)) {
            System.out.println("File villa doew note exist");
        } else {
            TreeSet<String> listRoomTreeSet = FunctionWriteAndReadFileCSV.getNameServiceFromToCSV(pathRoom);
            System.out.println("\n List name service Villa not Duplicate");
            for (String str : listRoomTreeSet
            ) {
                System.out.println("==================");
                System.out.println(str);
                System.out.println("==================");

            }
        }

        sc.nextLine();
        backToMenu();
    }


    private static void showInformationEmployee() {
        Map<Integer, Employee> map = addEmployeeToMap();
        Set<Integer> set = map.keySet();
        for (Integer key : set) {
            System.out.println(map.get(key));
        }
    }

    private static Map<Integer, Employee> addEmployeeToMap() {
        Employee employee1 = new Employee(1, "Hung", "gia lai", 20);
        Employee employee2 = new Employee(2, "Hung", "gia lai", 20);
        Employee employee3 = new Employee(3, "Lan", "Thuan an", 24);
        Employee employee4 = new Employee(4, "Chanh", "Khai hoan", 32);
        Employee employee5 = new Employee(5, "Bun", "Duc pho", 21);
        Employee employee6 = new Employee(6, "Anh", "Kon tum", 34);
        Employee employee7 = new Employee(7, "Minh", "Khanh Hoa", 23);
        Employee employee8 = new Employee(8, "Khai", "An giang", 12);
        Employee employee9 = new Employee(9, "Khon", "Binh phuoc", 56);
        Employee employee10 = new Employee(10, "Rung", "Hoa Thinh", 14);
        Map<Integer, Employee> map = new HashMap<Integer, Employee>();
        map.put(employee1.getId(), employee1);
        map.put(employee1.getId(), employee2);
        map.put(employee1.getId(), employee3);
        map.put(employee1.getId(), employee4);
        map.put(employee1.getId(), employee5);
        map.put(employee1.getId(), employee6);
        map.put(employee1.getId(), employee7);
        map.put(employee1.getId(), employee8);
        map.put(employee1.getId(), employee9);
        map.put(employee1.getId(), employee10);
        return map;
    }

    private static void findInformationEmployee() {
        Stack<Employee> stackEmployee = FillingCaBinNet.addToFilingCabinet();
        System.out.print("Enter key of employee: ");
        int key = sc.nextInt();
        try {
            while (true) {
                if (stackEmployee.peek().getId() != key) {
                    stackEmployee.pop();
                } else {
                    System.out.println(stackEmployee.peek().toString());
                    break;
                }
            }
        } catch (EmptyStackException ex) {
            System.out.print("key invalid, please try again");
            findInformationEmployee();
        }
    }

    private static void addCustomerBuyTicker4D() {
        ArrayList<Customer> listCus = FunctionWriteAndReadFileCSV.getCustomerFromCSV();
        listCus.sort(new SortName());
        int i = 1;
        for (Customer customer : listCus) {
            System.out.println("-----------");
            System.out.println("No: " + i + "Name customer :" + customer.getCustomerName());
            System.out.println("-----------");
            i++;
        }
        System.out.println("====choose list customer buy ticker=======");
        Customer customer = listCus.get((sc.nextInt() - 1));
        customerQueue.add(customer);
        System.out.println("Add Customer In List :" + customer.getCustomerName() + " Successfully");
        sc.nextLine();
        backToMenu();

    }

    private static void showInformationCustomerBuyTicker() {
        int i = 1;
        for (Customer customer : customerQueue) {
            System.out.println("==================");
            System.out.print("No. : " + i);
            System.out.println( " " +customer.getCustomerName());
            i++;
        }

        sc.nextLine();
        backToMenu();
    }

    private static void ListCustomerBuyMovieTicker4D() {
        System.out.println("\n1.Add movie ticker" +
                "\n2.Show customer list buy movie ticker" +
                "\n3.Exit");
        switch (sc.nextInt()) {
            case 1:
                addCustomerBuyTicker4D();
                sc.nextLine();
                displayMainMenu();
                break;
            case 2:
                showInformationCustomerBuyTicker();
                sc.nextLine();
                displayMainMenu();
                break;
            case 3:
                System.exit(3);
            default:
                System.out.println("Error!!!Backing to menu");
                backToMenu();
        }
    }

}




