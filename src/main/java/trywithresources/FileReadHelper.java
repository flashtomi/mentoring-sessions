package trywithresources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadHelper {

    public void readFileWithBufferedReader(String fileName) {
        BufferedReader br = null;
        FileReader fr = null;

        try {
            br = new BufferedReader(new FileReader(fileName));

            String currentLine;

            while ((currentLine = br.readLine()) != null) {
                System.out.println(currentLine);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public void readFileWithTryWithResources(String fileName) {

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String currentLine;

            while ((currentLine = br.readLine()) != null) {
                System.out.println(currentLine);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
