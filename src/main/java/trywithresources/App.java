package trywithresources;

public class App {

    public static void main(String[] args) {
        String fileName = "D:\\Git\\mentoring-sessions\\src\\main\\resources\\readertest.txt";
        FileReadHelper fileReadHelper = new FileReadHelper();

        fileReadHelper.readFileWithBufferedReader(fileName);
        fileReadHelper.readFileWithTryWithResources(fileName);
    }
}
