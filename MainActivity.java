package ru1iz.cobalagi;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    String[] listArray = {"Nonton", "komen", "Buat projek", "Buat projek lagi", "Nonton", "Komen", "Nonton", "Buat projek lagi lagi"};
    List<Controller> controller = new ArrayList<Controller>();
    ArrayAdapter<Controller> adapter = null;
ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
listView = (ListView)findViewById(R.id.array_list);
        adapter = new ArrayAdapter<Controller>(this, android.R.layout.simple_list_item_1);
listView.setAdapter(adapter);
        Button button;
        final EditText editText;
        final ArrayAdapter adapter = new ArrayAdapter(this, R.layout.activity_listview, listArray);
        ListView listview = (ListView) findViewById(R.id.array_list);
        listview.setAdapter(adapter);

        editText = (EditText)findViewById(R.id.editText);
        button = (Button)findViewById(R.id.button);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                Controller c = new Controller();
                c.setIsi(editText.getText().toString());
                adapter.add(c);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
