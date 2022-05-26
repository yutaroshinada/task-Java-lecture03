package task03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        List<String> menus = new ArrayList<>();
        menus.add("濃厚バター醤油ポップコーン");
        menus.add("チキンナゲット");
        menus.add("ストロベリーチョコレートクレープ");

        System.out.println(menus.size());
        System.out.println(menus.get(0));
        System.out.println(menus.get(1));
        System.out.println(menus.get(2));


        Map<String, String> menusMap = new HashMap<>();
        menusMap.put("濃厚バター醤油ポップコーン", "Sサイズ:¥350,Mサイズ:¥400,Lサイズ:¥450");
        menusMap.put("チキンナゲット", "¥380");
        menusMap.put("ストロベリーチョコレートクレープ", "¥450");

        System.out.println(menusMap.get("濃厚バター醤油ポップコーン"));
        System.out.println(menusMap.get("チキンナゲット"));
        System.out.println(menusMap.get("ストロベリーチョコレートクレープ"));

        String[] menusInfo = {"濃厚バター醤油ポップコーン", "チキンナゲット", "ストロベリーチョコレートクレープ", "キャンディ", "ミルクチョコチップアイス"};
        int index = 4;
        try {
            if (index < 0 || 2 < index) {
                throw new ArrayIndexOutOfBoundsException();
            }
            System.out.println(menusInfo[index] + "は販売しております。");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("その商品は取り扱っておりません。");
        }
    }
}

