package com.example.cathleen.test3;
/**
 * 如何同步显示checkBox和textView的信息？
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {
    Button editTextButton;
    EditText showButton;
    TextView showCheckBox,showRadioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /**
         * Button，EditText
         */
        editTextButton = (Button) findViewById(R.id.editTextButton);
        showButton = (EditText) findViewById(R.id.showButton);
        editTextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showButton.setText("按钮被点击");
            }
        });
    }
        /**
         * checkBox,textView
         */
        public void onCheckBoxClicked(View view){
            boolean checked = ((CheckBox)view).isChecked();
            showCheckBox = (TextView)findViewById(R.id.showCheckBox);
            switch (view.getId()){
                case R.id.C:
                    if(checked) {
                        showCheckBox.setText(showCheckBox.getText() + "C");
                    }break;
                case R.id.Cpp:
                    if(checked)
                        showCheckBox.setText(showCheckBox.getText() + "C++");
                    break;
                case R.id.java:
                    if(checked)
                        showCheckBox.setText(showCheckBox.getText() + "Java");
                    break;
        }
    }

    /**
     * RadioButton,TextView
     * @param view
     */
    public void onCheckRadioClicked(View view){
        showRadioButton = (TextView)findViewById(R.id.showRadioButton);
        boolean checked = ((RadioButton)view).isChecked();
        switch(view.getId()){
            case R.id.men:
                if(checked)
                    showRadioButton.setText("男人");
                break;
            case R.id.women:
                if(checked)
                    showRadioButton.setText("女人");
                break;
            case R.id.DCwomen:
                if(checked)
                    showRadioButton.setText("女博士");
                break;

        }
    }
    }
