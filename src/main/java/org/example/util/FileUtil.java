package org.example.util;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.model.Flight;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileUtil {

    public static List<Flight> readFromFile(){
        File file = new File("C:\\Users\\coshq\\Desktop\\Java\\projects\\StepProjectBooking1\\docs\\flights.json");
        try (InputStream is = new FileInputStream(file)) {
            byte[] bytes = is.readAllBytes();

            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(bytes, new TypeReference<>() {
            });
        } catch (IOException ex) {
            throw new RuntimeException(ex.getMessage());
        }
    }
}
