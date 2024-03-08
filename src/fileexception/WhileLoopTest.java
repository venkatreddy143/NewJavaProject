package fileexception;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;
public class WhileLoopTest {
    public static void main(String[] args) {
        boolean fileOpened = false;
        String fileRead = null;
        Date fileExpire = null;

        while (!fileOpened) {
            try {
                FileInputStream fileInputStream = new FileInputStream("D:\\Whiletest\\hello.txt");
                fileOpened = true;
            } catch (FileNotFoundException e) {
                fileRead = UUID.randomUUID().toString();
                Calendar fileReadExpiry = Calendar.getInstance();
                fileReadExpiry.after(1);
                System.out.println("fileReadExpiry: " + fileReadExpiry.getTime());
                fileExpire = fileReadExpiry.getTime();
            } finally {
                System.out.println("from Finally block ");
            }
        }
        if (fileRead != null) {
            System.out.println("fileRead: " + fileRead);
        }
        if (fileExpire != null) {
            System.out.println("fileExpire: " + fileExpire);
        }
    }
}
//public static void main(String[] args) {
//
//    boolean fileFound = false;
//    while (!fileFound) {
//        try {
//            new FileInputStream("D:\\Whiletest \\hello.txt");
//            processFile();
//            fileFound = true;
//        } catch (FileNotFoundException e) {
//            System.out.println("File not found, retrying in 1 minute...");
//            System.out.println(e.getMessage());
//            try {
//                Thread.sleep(1 * 60 * 100);
//            } catch (InterruptedException ex) {
//                ex.printStackTrace();
//            }
//        }
//    }
//}
//    private static void processFile() throws FileNotFoundException {
//        File file = new File("D:\\Whiletest\\hello.txt");
//        if (!file.exists()) {
//            throw new FileNotFoundException();
//        }
//        System.out.println("File found! Processing...");
//    }
//}