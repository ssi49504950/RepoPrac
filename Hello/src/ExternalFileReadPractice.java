import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ExternalFileReadPractice {

	public Properties readProperties(String path) throws IOException {
		
		File sourcePath = new File(path);
		FileInputStream readPath = new FileInputStream(sourcePath); 
		Properties propertiesObject = new Properties();
		propertiesObject.load(readPath);
		return propertiesObject;
	}
}
