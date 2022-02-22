package ec.com.learning.creational.abstractFactory.inter.impl;

import ec.com.learning.creational.abstractFactory.inter.RESTConnection;
import java.io.IOException;
import java.io.InputStream;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Steven Guamán - February 2022
 */
public class RESTConnectionSales implements RESTConnection {

    @Override
    public void readURL(String url) {
        System.out.println("Sales - Connecting to " + url);
    }

    @Override
    public void readInputStream(InputStream inputStream, String word) {
        StringBuilder sb = new StringBuilder();
        try {
            for (int ch; (ch = inputStream.read()) != -1;) {
                sb.append((char) ch);
            }
            System.out.println("word: " + word + ", stirng: " + sb.toString());
            String[] separator = sb.toString().split(word);
            System.out.println("Sales: " + (separator.length - 1));
        } catch (IOException ex) {
            Logger.getLogger(RESTConnectionSales.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
