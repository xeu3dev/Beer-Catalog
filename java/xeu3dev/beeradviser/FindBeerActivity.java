package xeu3dev.beeradviser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.List;

import static xeu3dev.beeradviser.R.id.textBeer;

public class FindBeerActivity extends AppCompatActivity {
    private BeerExpert expert = new BeerExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);


    }
    public void onClickFindBeer (View view) {
        TextView brands = (TextView) findViewById(textBeer);
        Spinner color = (Spinner) findViewById(R.id.typeBeer);
        String beerType = String.valueOf(color.getSelectedItem());
        List<String> brandList = expert.getBrands(beerType);
        StringBuilder brandsFormatted = new StringBuilder();
        for (String brand : brandList) {
            brandsFormatted.append(brand).append('\n');
        }
        brands.setText(brandsFormatted);
    }
    public void onClickClearBeer (View view) {
        TextView textView = (TextView) findViewById(R.id.textBeer);
        textView.setText("");
    }
}
