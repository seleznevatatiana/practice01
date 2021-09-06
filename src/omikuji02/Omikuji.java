package omikuji02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public abstract class Omikuji implements Fortune{

    protected String unsei;
    protected String negaigoto;
    protected String akinai;
    protected String gakumon;
    public abstract void setUnsei();

    Public String disp() {
        String result = "";
        //properties読み込み

        Properties properties = new Properties();
        String file1 = "src/omikuji02/fortune.properties";

        try {
            FileInputStream fis = new FileInputStream(file1);
            try {
                properties.load(fis);
                String a = properties.getProperty("disp_str");
                String str = String.format(a, setUnsei());

                System.out.println(str);

            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

          String s= unsei;
        //StringBuilderでコンソール表示する文字列を作る
        Return result;

    }
}
