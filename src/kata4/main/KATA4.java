package kata4.main;

import java.util.List;
import kata4.model.Histogram;
import kata4.view.HistogramDisplay;
import kata4.view.MailHistogramBuilder;
import kata4.view.MailListReaderBD;

public class KATA4 {
    private static List<String> mailList;
    private static Histogram<String> histogram;

    public static void main(String[] args){
        execute(); 
    }
    
    public static void input(){
        mailList = MailListReaderBD.read();
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
