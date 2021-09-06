package omikuji02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public abstract class Omikuji implements Fortune{

    protected String negaigoto;
    protected String akinai;
    protected String gakumon;
    public abstract void setUnsei();

    protected String unsei;
    /**
     * @param unsei セットする unsei
     */
    public void setUnsei(String unsei) {
        this.unsei = unsei;
    }
    /**
     * @param negaigoto セットする negaigoto
     */
    public void setNegaigoto(String negaigoto) {
        this.negaigoto = negaigoto;
    }
    /**
     * @param akinai セットする akinai
     */
    public void setAkinai(String akinai) {
        this.akinai = akinai;
    }
    /**
     * @param gakumon セットする gakumon
     */
    public void setGakumon(String gakumon) {
        this.gakumon = gakumon;
    }


    public String disp() {


        //properties読み込み
        Properties properties = new Properties();
        String file1 = "src/omikuji02/fortune.properties";
        String str = "";

        try {
            FileInputStream fis = new FileInputStream(file1);
            try {
                properties.load(fis);
                String a = properties.getProperty("disp_str");
                str = String.format(a, this.unsei);

            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //StringBuilderでコンソール表示する文字列を作る
          StringBuilder sb = new StringBuilder();
          sb.append(str);
          sb.append(akinai);
          sb.append(negaigoto);
          sb.append(gakumon);

        return sb.toString();
        }

    }

