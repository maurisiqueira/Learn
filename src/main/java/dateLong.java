import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class dateLong {

    Date dateParsed = null;
    private String dateRef;
    private Long dateLong;

    public dateLong(String dateRef){
        this.dateRef = dateRef;
        formataData();
    }

    public void formataData(){

        SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy");

        try{
        dateParsed = formater.parse(this.dateRef);
        this.dateLong =  dateParsed.getTime();
        }catch(ParseException e){
            System.err.println(e);

        }
    }

    public Long getDateLong(){
        return this.dateLong;
    }
}
