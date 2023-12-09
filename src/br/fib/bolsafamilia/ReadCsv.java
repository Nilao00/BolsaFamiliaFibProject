package br.fib.bolsafamilia;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ReadCsv {

    private String path = "dados_bolsa_familia.csv";

    private List<BolsaFamilia> records = new ArrayList<>();

    public List<BolsaFamilia> getData(){

        Random rand = new Random();

        System.out.println(Double.parseDouble("400.00"));
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(";");
                records.add(new BolsaFamilia(values[0],
                        values[1].replace("\"", "").trim(),
                        values[2].replace("\"", "").trim(),
                        values[3].replace("\"", "").trim(),
                        values[4].replace("\"", "").trim(),
                        values[5].replace("\"", "").trim(),
                        values[6].replace("\"", "").trim(),
                        values[7].replace("\"", "").trim(),
                        rand.nextDouble() * 1000));
            }
            return records;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
