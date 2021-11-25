package kata4.view;

import java.util.List;
import kata4.model.Histogram;
import kata4.model.Mail;

public class MailHistogramBuilder {
    
    public static Histogram<String> built(List<String> mailList){
        Histogram<String> histogram = new Histogram<>();
        
        for (String mail: mailList){
            histogram.increment(mail);
        }
        
        return histogram;
    }

   
}
