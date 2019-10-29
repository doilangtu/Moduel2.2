package Common;

import Models.Customer;
import Models.House;
import Models.Room;
import Models.Villa;
import com.opencsv.CSVWriter;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FunctionWriteAndReadFileCSV {
    private static final char DEFAULT_SEPARATOR = ',';
    private static final char DEFAULT_QUOTE = '"';
    private static final String pathVilla = "src/Data/Villa.csv";
    private static final String pathRoom = "src/Data/Room.csv";
    private static final String pathHouse = "src/Data/House.csv";
    private static final String pathCustomer = "src/Data/Customer.csv";


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
                        customer.getId(), customer.getCustomerName(),
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
            ColumnPositionMappingStrategy<Customer> strategy = new ColumnPositionMappingStrategy<>();
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


}
