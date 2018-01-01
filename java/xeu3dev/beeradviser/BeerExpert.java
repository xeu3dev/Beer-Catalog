package xeu3dev.beeradviser;


import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
    List<String> getBrands(String color) {
        List<String> brands = new ArrayList<String>();
        if (color.equals("light")){
            brands.add("Hoegaarden");
            brands.add("Spaten");
        }
        if (color.equals("amber")) {
            brands.add("Maine Beer Zoe");
            brands.add("Three Floyds Amber Smashed Face");
        }
        if (color.equals("brown")){
            brands.add("Surly Cacao Bender");
            brands.add("Hill Farmstead George");
        }
        if (color.equals("dark")){
            brands.add("Guinness");
            brands.add("Belhaven");
        }

        return brands;
    }
}
