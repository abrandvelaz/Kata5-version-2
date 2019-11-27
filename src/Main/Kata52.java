/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.List;
import Model.Histogram;
import Model.Mail;
import View.HistogramDisplay;
import static View.MailHistogramBuilder.build;
import static View.MailListReader.read;
import static View.MailListReaderBD.read;
/**
 *
 * @author Alber
 */
public class Kata52 {
    
    private final String fileName;
    private List<Mail> mailList;
    private Histogram<String> histogram;
    private HistogramDisplay histoDisplay;
    
    public static void main(String[] args) {
       Kata52 k = new Kata52("C:\\Users\\Alber\\Documents\\NetBeansProjects\\Kata5.2\\src\\Main\\email.txt");
       k.execute();
    }
     public Kata52(String fileName) {
        this.fileName = fileName;
    }
    
    public void execute() {
        input();
        process();
        output();
    }
    
    public void input() {
        try {
           mailList = read(); 
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error con el fichero");
        }
    }
    
    public void process() {
        histogram = build(mailList);
    }
    
    public void output() {
        histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute(); 
    }
    
}
