/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Model.Mail;

public class MailListReader {
    
    public static List<Mail> read(String fileName) throws Exception {
        List<Mail> lista = new ArrayList<>();
        File file = new File(fileName);
         try {
             Scanner sc = new Scanner(file);
             while (sc.hasNextLine()) {
                String email = sc.nextLine();
                if (email.indexOf('@') != -1) {
                    lista.add(new Mail(email));
                }
            }
            sc.close();
        } 
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return lista;
    }
}
