package ec.com.learning.creational.abstractFactory.inter;

import java.io.InputStream;

/**
 *
 * @author Steven Guamán - February 2022
 */
public interface RESTConnection {

    void readURL(String url);

    void readInputStream(InputStream inputStream, String word);

}
