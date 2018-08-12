package WebService;


import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebService
public class Dws {
    @WebMethod
    public String getCurDate (){

        Date dt = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-dd-MM hh.mm.ss");
        return df.format(dt);
    }

    public static void main (String[] args){
        Object imp = new Dws();
        String address ="http://localhost:1111/Dws?wsdl";
        Endpoint.publish(address,imp);
    }
}
