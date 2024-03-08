package fileexception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Calendar;
import java.util.Date;

public class FileNotException {
    public static void main(String[] args) {

        try{
            Date currentDate=new Date();
            System.out.println("Before while loop currentDate:"+currentDate);
            Calendar cal= Calendar.getInstance();
            cal.add(Calendar.MINUTE,2);
            Date futureDate=cal.getTime();
            System.out.println("Before while loop futureDate:"+futureDate);
            boolean continueWhile=true;

            //while(currentDate.before(futureDate)){
                while(continueWhile){
                try{
                    FileInputStream fileInputStream = new FileInputStream("D:\\Whiletest\\hello.txt");
                    System.out.println("File Found");
                    continueWhile=true;

                }catch (FileNotFoundException f){
                    currentDate=new Date();
                }
            }
        }catch(Exception e){

        }
    }

}
