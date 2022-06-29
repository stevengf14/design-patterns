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
public class RESTConnectionNoArea implements RESTConnection {

    @Override
    public void readURL(String url) {
        System.out.println("No area selected");
    }

    @Override
    public void readInputStream(InputStream inputStream, String word) {
        System.out.println("No area selected");
    }

}
