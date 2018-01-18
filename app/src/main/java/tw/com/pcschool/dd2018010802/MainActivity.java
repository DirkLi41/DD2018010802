package tw.com.pcschool.dd2018010802;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    ArrayList<Map<String, Object>> mylist1 = new ArrayList<>();
    ListView lv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv1 = (ListView)findViewById(R.id.listView) ;

        HashMap<String, Object> hm1 = new HashMap<>();  //Object才可以放字串或整數
        hm1.put("city","台北");
        hm1.put("code", "02");
        hm1.put("img", R.drawable.tp);
        mylist1.add(hm1);
        HashMap<String, Object> hm2 = new HashMap<>();
        hm2.put("city", "台中");
        hm2.put("code", "04");
        hm2.put("img", R.drawable.tc);
        mylist1.add(hm2);
        HashMap<String, Object> hm3 = new HashMap<>();
        hm3.put("city", "台南");
        hm3.put("code", "06");
        hm3.put("img", R.drawable.tn);
        mylist1.add(hm3);
        HashMap<String, Object> hm4 = new HashMap<>();
        hm4.put("city", "高雄");
        hm4.put("code", "07");
        hm4.put("img", R.drawable.kh);
        mylist1.add(hm4);

        /*SimpleAdapter sada1 = new SimpleAdapter(
                                MainActivity.this,
                                mylist1,
                                android.R.layout.simple_list_item_2,
                                new String[] {"city","code"},
                                new int[] {android.R.id.text1, android.R.id.text2}
                );*/
        SimpleAdapter sada1 = new SimpleAdapter(
                MainActivity.this,
                mylist1,
                R.layout.mylayout,
                new String[] {"city","code","img"},
                new int[] {R.id.textView, R.id.textView2, R.id.imageView}
        );

        lv1.setAdapter(sada1);



    }
}
