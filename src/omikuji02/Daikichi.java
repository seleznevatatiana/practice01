package omikuji02;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Daikichi extends  Omikuji{

    @Override
    public String disp() {
        return disp();
    }

    @Override
    public void setUnsei() {
        // ArrayListの生成
        List <String> list = new ArrayList<>();

        // 要素の追加
        list.add("大吉");
        list.add("中吉");
        list.add("小吉");
        list.add("末吉");
        list.add("吉");
        list.add("凶");

        int index = new Random().nextInt(list.size());
        String result = list.get(index);
        System.out.println(result);

    }

}
