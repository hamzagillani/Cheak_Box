package com.digicon_valley.cheak_box;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> selection=new ArrayList<String>();
    TextView final_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final_text=(TextView)findViewById(R.id.final_result);
        final_text.setEnabled(false);
    }

    public void selectItem(View view){

        boolean checked =((CheckBox) view).isChecked();

        switch (view.getId()){

            case R.id.fruit_apple:
                if (checked){
                selection.add("Apple");
                }else selection.remove("Apple");
                break;
            case R.id.oragne:
            if(checked) {
                selection.add("Orange");
                }else selection.remove("Orange");
                break;
            case R.id.grapes:
                if(checked) {
                    selection.add("Grapes");
                }else selection.remove("Grapes");
                break;


        }

    }
    public void finalselection(View view){

        String final_fruits_selection=" ";
        for (String Selections:selection){
            final_fruits_selection=final_fruits_selection+Selections + "\n";
        }
        final_text.setText(final_fruits_selection);
        final_text.setEnabled(true);

    }
}
