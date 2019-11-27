/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.util.HashMap;
import java.util.List;
import Model.Histogram;
import Model.Mail;

public class MailHistogramBuilder {
    
    public static Histogram<String>  build(List<Mail> lista) {
        Histogram<String> histogram = new Histogram<>();
        for (int i = 0;i < lista.size();i++) {
            histogram.increment(lista.get(i).getDomain());
        }
        return histogram;
    }
    
}
