package Common;

import Models.*;
import com.opencsv.CSVWriter;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import sun.reflect.generics.tree.Tree;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.TreeSet;

public class FunctionWriteAndReadFileCSV {
    // the delimiter to use for separating entries
    private static final char DEFAULT_SEPARATOR = ',';
    // the character to use for quoted elements
    private static final char DEFAULT_QUOTE = '"';
    private static final String pathVilla = "src/Data/Villa.csv";
    private static final String pathRoom = "src/Data/Room.csv";
    private static final String pathHouse = "src/Data/House.csv";
    private static final String pathCustomer = "src/Data/Customer.csv";
    private static final String pathBooking = "src/Data/Booking.csv";
    private static final String pathEmployees = "src/Data/Employees.csv";


    private static String[] headerRecordVilla = new String[]{"id", "nameService",
            "useArea", "rentsCost", "typeOfRents",
            "amountPeople", "poolArea", "roomStandard", "otherDescriptionOfUtilities", "numberOfFloors"};
    private static String[] headerRecordRoom = new String[]{
            "id", "nameService", "useArea", "rentsCost", "typeOfRents" , "amountPeople", "associatedServiceName"
    };
    private static String[] headerRecordHouse = new String[]{
            "id", "nameService", "useArea", "rentsCost", "typeOfRents",
            "amountPeople", "numberOfFloors", "roomStandard", "otherDescriptionOfUtilities"};
    private static String [] headerRecordCustomer = new String []{
            "id","customerName","birthdayCustomer","gender","idCard","mobilePhone","email","typeOfCustomer","address"
    };
    private static String [] headerRecordBooking = new String []{
            "id","customerName","birthdayCustomer","gender","idCard","mobilePhone","email","typeOfCustomer","address",
            "id", "nameService",
            "useArea", "rentsCost", "typeOfRents","amountPeople"
    };
    private static String [] headerRecordEmployees = new String []{ "id","employeeName","employeeAddress","age"};
    // the line number to skip for start reading

    private static final int NUM_OF_LINE_SKIP = 1;


    //function write Villa to file Csv
    public static void writeVillaToCSV(ArrayList<Villa> arrayList) {
        try (Writer writer = new FileWriter(pathVilla);
             CSVWriter csvWriter = new CSVWriter(writer,
                     CSVWriter.DEFAULT_SEPARATOR
                     , CSVWriter.NO_QUOTE_CHARACTER, CSVWriter.DEFAULT_ESCAPE_CHARACTER, CSVWriter.DEFAULT_LINE_END)) {
            csvWriter.writeNext(headerRecordVilla);
            for (Villa villa : arrayList) {

                csvWriter.writeNext(new String[]{
                        villa.getId(),
                        villa.getNameService(),
                        String.valueOf(villa.getUseArea()),
                        String.valueOf(villa.getRentsCost()),
                        villa.getTypeOfRents(),
                        String.valueOf(villa.getAmountPeople()),
                        String.valueOf(villa.getPoolArea()),
                        villa.getRoomStandard(),
                        villa.getOtherDescriptionOfUtilities(),
                        String.valueOf(villa.getNumberOfFloors())
                });
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    //function write from Room to CSV
    public static void writeRoomToCSV(ArrayList<Room> arrayList) {
        try (Writer writer = new FileWriter(pathRoom);
             CSVWriter csvWriter = new CSVWriter(writer,
                     CSVWriter.DEFAULT_SEPARATOR
                     , CSVWriter.NO_QUOTE_CHARACTER, CSVWriter.DEFAULT_ESCAPE_CHARACTER, CSVWriter.DEFAULT_LINE_END)) {
            csvWriter.writeNext(headerRecordRoom);
            for (Room room : arrayList) {
                csvWriter.writeNext(new String[]{
                        room.getId(),
                        room.getNameService(),
                        String.valueOf(room.getUseArea()),
                        String.valueOf(room.getRentsCost()),
                        room.getTypeOfRents(),
                        String.valueOf(room.getAmountPeople()),

                        room.getAssociatedServiceName()

                });
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }



        public static void writeHouseToCSV(ArrayList<House> arrayList) {
        try (Writer writer = new FileWriter(pathHouse);
             CSVWriter csvWriter = new CSVWriter(writer,
                     CSVWriter.DEFAULT_SEPARATOR
                     , CSVWriter.NO_QUOTE_CHARACTER, CSVWriter.DEFAULT_ESCAPE_CHARACTER, CSVWriter.DEFAULT_LINE_END)) {
            csvWriter.writeNext(headerRecordHouse);
            for (House house : arrayList) {
                csvWriter.writeNext(new String[]{
                        house.getId(), house.getNameService(),
                        String.valueOf(house.getUseArea()),
                        String.valueOf(house.getRentsCost()),
                        house.getTypeOfRents(),

                        house.getNumberOfFloors(),
                        house.getRoomStandard(),
                        house.getOtherDescriptionOfUtilities()
                });
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
//Write Customer In File CSV

    public static void writeCustomerToCSV(ArrayList<Customer> arrayList){
        try (Writer writer = new FileWriter(pathCustomer);
             CSVWriter csvWriter = new CSVWriter(writer,
                     CSVWriter.DEFAULT_SEPARATOR
                     , CSVWriter.NO_QUOTE_CHARACTER, CSVWriter.DEFAULT_ESCAPE_CHARACTER, CSVWriter.DEFAULT_LINE_END)) {
            csvWriter.writeNext(headerRecordHouse);
            for (Customer customer : arrayList) {
                csvWriter.writeNext(new String[]{
                       customer.getId(), customer.getCustomerName(), customer.getBirthdayCustomer(),
                        customer.getGender(),
                        String.valueOf(customer.getIdCard()),
                        String.valueOf(customer.getMobilePhone()),
                        customer.getEmail(),
                        customer.getTypeOfCustomer(),customer.getAddress()

                });

            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    //function write Booking to File CSV
    public static void writeBookingToCSV(ArrayList<Customer> arrayList){
        try (Writer writer = new FileWriter(pathBooking);
             CSVWriter csvWriter = new CSVWriter(writer,
                     CSVWriter.DEFAULT_SEPARATOR
                     , CSVWriter.NO_QUOTE_CHARACTER, CSVWriter.DEFAULT_ESCAPE_CHARACTER, CSVWriter.DEFAULT_LINE_END)) {
            csvWriter.writeNext(headerRecordBooking);
            for (Customer customer : arrayList) {
                csvWriter.writeNext(new String[]{
                       customer.getId(), customer.getCustomerName(), customer.getBirthdayCustomer(),
                        customer.getGender(),
                        String.valueOf(customer.getIdCard()),
                        String.valueOf(customer.getMobilePhone()),
                        customer.getEmail(),
                        customer.getTypeOfCustomer(),
                        customer.getAddress(),customer.getServices().getId(),
                        customer.getServices().getNameService(),String.valueOf(customer.getServices().getUseArea()),
                        String.valueOf(customer.getServices().getRentsCost()),
                        customer.getServices().getTypeOfRents(),String.valueOf(customer.getServices().getAmountPeople())

                });

            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    //Write Employees to CSV
    public static void writeEmployeesToCSV(ArrayList<Employee> arrayList){
        try (Writer writer = new FileWriter(pathEmployees);
             CSVWriter csvWriter = new CSVWriter(writer,
                     CSVWriter.DEFAULT_SEPARATOR
                     , CSVWriter.NO_QUOTE_CHARACTER, CSVWriter.DEFAULT_ESCAPE_CHARACTER, CSVWriter.DEFAULT_LINE_END)) {
            csvWriter.writeNext(headerRecordEmployees);
            for (Employee employee : arrayList) {
                csvWriter.writeNext(new String[]{
                      String.valueOf( employee.getId()),
                        employee.getEmployeeName(),
                        employee.getEmployeeAddress()
                        ,String.valueOf(employee.getAge())
                });

            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    //Booking get from CSV

    //ban sao
    public static ArrayList<Customer>getBookingFromCSV(){
        ArrayList<Customer> listArrCustomer = new ArrayList<Customer>();
        BufferedReader br = null;
        try {
            String line;
            br = new BufferedReader(new FileReader(pathBooking));

            // How to read file in java line by line?
            while ((line = br.readLine()) != null) {

                Customer customer = new Customer();
                Villa villa = new Villa();
               String[] dataSplit = line.split(",");
               if (dataSplit[0].equals("id")){
                   continue;
               }
               customer.setId(dataSplit[0]) ;
               customer.setCustomerName(dataSplit[1]);
               customer.setBirthdayCustomer(dataSplit[2]);
               customer.setGender(dataSplit[3]);
               customer.setIdCard(Integer.parseInt(dataSplit[4]));
               customer.setMobilePhone(Integer.parseInt(dataSplit[5]));
               customer.setEmail(dataSplit[6]);
               customer.setTypeOfCustomer(dataSplit[7]);
               customer.setAddress(dataSplit[8]);
               villa.setId(dataSplit[9]);
               villa.setNameService(dataSplit[10]);
               villa.setUseArea(Double.parseDouble(dataSplit[11]));
               villa.setRentsCost(Double.parseDouble(dataSplit[12]));
               villa.setAmountPeople(Double.parseDouble(dataSplit[13]));
               listArrCustomer.add(customer);
               customer.setServices(villa);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException crunchifyException) {
                crunchifyException.printStackTrace();
            }
        }
        return listArrCustomer;
    }




    //function get list Villa From File Csv
    public static ArrayList<Villa> getVillaFromCSV() {
        Path path = Paths.get(pathVilla);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(pathVilla);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        ColumnPositionMappingStrategy<Villa> strategy = new ColumnPositionMappingStrategy<>();
        strategy.setType(Villa.class);
        strategy.setColumnMapping(headerRecordVilla);
        CsvToBean<Villa> csvToBean = null;
        try {
            csvToBean = new CsvToBeanBuilder<Villa>(new FileReader(pathVilla))
                    .withMappingStrategy(strategy)
                    .withSeparator(DEFAULT_SEPARATOR)
                    .withQuoteChar(DEFAULT_QUOTE)
                    .withSkipLines(NUM_OF_LINE_SKIP)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return (ArrayList<Villa>) csvToBean.parse();
    }

//function get list Customer From Fle Csv
        public static ArrayList<Customer> getCustomerFromCSV() {
            Path path = Paths.get(pathCustomer);
            if (!Files.exists(path)) {
                try {
                    Writer writer = new FileWriter(pathCustomer);
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
            //mapping of columns with their positions//mapping of columns with their positions
            ColumnPositionMappingStrategy<Customer> strategy = new ColumnPositionMappingStrategy<>();
            //Set mappingStrategy type to Customer Type//Set mappingStrategy type to Customer Type
            strategy.setType(Customer.class);
            strategy.setColumnMapping(headerRecordCustomer);

            CsvToBean<Customer> csvToBean = null;
            try {
                csvToBean = new CsvToBeanBuilder<Customer>(new FileReader(pathCustomer))
                        .withMappingStrategy(strategy)
                        .withSeparator(DEFAULT_SEPARATOR)
                        .withQuoteChar(DEFAULT_QUOTE)
                        .withSkipLines(NUM_OF_LINE_SKIP)
                        .withIgnoreLeadingWhiteSpace(true)
                        .build();
            } catch (FileNotFoundException ex) {
                System.out.println(ex.getMessage());
            }
            return (ArrayList<Customer>) csvToBean.parse();
        }
    //
    public static ArrayList<Room> getRoomFromCSV() {
        Path path = Paths.get(pathRoom);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(pathRoom);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        ColumnPositionMappingStrategy<Room> strategy = new ColumnPositionMappingStrategy<>();
        strategy.setType(Room.class);
        strategy.setColumnMapping(headerRecordRoom);
        CsvToBean<Room> csvToBean = null;
        try {
            csvToBean = new CsvToBeanBuilder<Room>(new FileReader(pathRoom))
                    .withMappingStrategy(strategy)
                    .withSeparator(DEFAULT_SEPARATOR)
                    .withQuoteChar(DEFAULT_QUOTE)
                    .withSkipLines(NUM_OF_LINE_SKIP)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return (ArrayList<Room>) csvToBean.parse();
    }

    //
    public static ArrayList<House> getHouseFromCSV() {
        Path path = Paths.get(pathHouse);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(pathHouse);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        ColumnPositionMappingStrategy<House> strategy = new ColumnPositionMappingStrategy<>();
        strategy.setType(House.class);
        strategy.setColumnMapping(headerRecordHouse);
        CsvToBean<House> csvToBean = null;
        try {
            csvToBean = new CsvToBeanBuilder<House>(new FileReader(pathHouse))
                    .withMappingStrategy(strategy)
                    .withSeparator(DEFAULT_SEPARATOR)
                    .withQuoteChar(DEFAULT_QUOTE)
                    .withSkipLines(NUM_OF_LINE_SKIP)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return (ArrayList<House>) csvToBean.parse();
    }


public static TreeSet<String >getNameServiceFromToCSV(String path){
        BufferedReader br = null;
    TreeSet<String > result = new TreeSet<String>();
    try{
        String line;
        br = new BufferedReader(new FileReader(path));
        while ( br.readLine()!=null){
            line = br.readLine();
            if (getNameServiceFromfile(line).equals("nameService")){
                continue;
            }
            result.add(getNameServiceFromfile(line));
        };
    }catch (IOException ex){
        System.out.println(ex.getMessage());
    }
        return result;
}
public static String getNameServiceFromfile(String csvline){
        String name = "";
        if (csvline !=null){
            String[]  splitData = csvline.split(",");
            name = splitData[1];
        }
        return name;
}
    public static ArrayList<Employee> getEmployees() {
        Path path = Paths.get(pathEmployees);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(pathEmployees);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        ColumnPositionMappingStrategy<Employee> strategy = new ColumnPositionMappingStrategy<>();
        strategy.setType(Employee.class);
        strategy.setColumnMapping(headerRecordEmployees);
        CsvToBean<Employee> csvToBean = null;
        try {
            csvToBean = new CsvToBeanBuilder<Employee>(new FileReader(pathEmployees))
                    .withMappingStrategy(strategy)
                    .withSeparator(DEFAULT_SEPARATOR)
                    .withQuoteChar(DEFAULT_QUOTE)
                    .withSkipLines(NUM_OF_LINE_SKIP)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return (ArrayList<Employee>) csvToBean.parse();
    }

}
