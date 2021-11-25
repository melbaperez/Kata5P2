package kata4.main;

import java.util.List;
import kata4.model.Histogram;
import kata4.model.Mail;
import kata4.view.HistogramDisplay;
import kata4.view.MailHistogramBuilder;
import kata4.view.MailListReader;

public class KATA4 {
    private static List<Mail> mailList;
    private static Histogram<String> histogram;

    public static void main(String[] args){
        execute(); 
    }
    
    public static void input(){
        String fileName = new String("email.txt");
        mailList = MailListReader.read(fileName);
    }
    
    public static void process(){
       histogram = MailHistogramBuilder.built(mailList);
    }
    
    public static void output(){
        HistogramDisplay histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
    }
    
    public static void execute(){
        input();
        process();
        output();
    }

}
