package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {

	private Properties p;

	public Properties init_p() throws IOException {
		p = new Properties(); 

		try 
		(FileInputStream ip = new FileInputStream("./src/test/resources/config/config.properties")) {
			p.load(ip);
		} catch (IOException e) {
			e.printStackTrace();
			throw new IOException("Could not load config.properties file.");
		}

		return p;
	}

}
