import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class main
{
    public static void main(String[] args) throws MalformedURLException
    {
        ObjectMapper mapper = new ObjectMapper();
        Weather pogoda;
        String city = "glasgow";
        URL url = new URL("http://api.apixu.com/v1/current.json?key=3e11d5ea24914379b62120104191003&q="+city);
        try
        {
           pogoda = mapper.readValue(url ,Weather.class);
            System.out.println(pogoda);
        } catch(IOException e)
        {
            e.printStackTrace();
        }

    }
}
