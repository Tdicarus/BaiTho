package ngothuctridat.sv61133478.baitho;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private AdapterView adapterView;
    private ArrayAdapter arrayAdapter;
    private ListView listView;
    private Button them;
    private Button xoa;
    private EditText nhapten;
    private ArrayList arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        them = (Button) findViewById(R.id.them);
        xoa = (Button) findViewById(R.id.xoa);
        listView = (ListView) findViewById(R.id.listView);
        


    }



}