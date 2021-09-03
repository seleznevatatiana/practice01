package omikuji02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public interface Fortune {

        Properties properties = new Properties();
        String file = "src/omikuji02/fortune.properties";

        try {
            FileInputStream fis = new FileInputStream(file);
            try {
                properties.load(fis);
                String a = properties.getProperty("disp_str");
                String str = String.format(a, data[0]);

                System.out.println(str);

            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
