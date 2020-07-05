import java.util.Calendar;
import java.util.Date;

public class DateProgram {

    public static void main(String[] args){

        //Obtain a long of ref. string date
        dateLong birthLong = new dateLong("24/10/1988");
        dateLong toCompareLong = new dateLong("15/05/2010");

        //Convert longs to Date object
        Date birthDate = new Date(birthLong.getDateLong());
        Date toCompareDate = new Date (toCompareLong.getDateLong());

        boolean isAFter = birthDate.after(toCompareDate);
        boolean isBefore = birthDate.before(toCompareDate);

        if(isAFter)
            System.out.println("The date of birthday is after to 15/05/2010");

        if(isBefore)
            System.out.println("The date of birthday is before to 15/05/2010");


    }
    }

