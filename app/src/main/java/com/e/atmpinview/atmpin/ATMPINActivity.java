package com.e.atmpinview.atmpin;

import android.os.Bundle;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.e.atmpinview.R;

public class ATMPINActivity extends AppCompatActivity {

    EditText one, two, three, four, five, six;
    private boolean transformed = false;
    private Button btn_show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_t_m_p_i_n);
        btn_show = findViewById(R.id.btn_show);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);

        one.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if ((event.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_DEL)) {
                    if (one.getText().toString().length() > 0)
                        one.setText("");
                    return true;
                }
                return false;
            }
        });
        two.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if ((event.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_DEL)) {
                    if (two.getText().toString().length() == 0)
                        one.requestFocus();
                    else
                        two.setText("");
                    return true;
                }
                return false;
            }
        });
        three.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if ((event.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_DEL)) {
                    if (three.getText().toString().length() == 0)
                        two.requestFocus();
                    else
                        three.setText("");
                    return true;
                }
                return false;
            }
        });
        four.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if ((event.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_DEL)) {
                    if (four.getText().toString().length() == 0)
                        three.requestFocus();
                    else
                        four.setText("");
                    return true;
                }
                return false;
            }
        });
        five.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if ((event.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_DEL)) {
                    if (five.getText().toString().length() == 0)
                        four.requestFocus();
                    else
                        five.setText("");
                    return true;
                }
                return false;
            }
        });
        six.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if ((event.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_DEL)) {
                    if (six.getText().toString().length() == 0)
                        five.requestFocus();
                    else
                        six.setText("");
                    return true;
                }
                return false;
            }
        });


        one.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (one.getText().toString().length() == 1)
                    two.requestFocus();
            }
        });
        two.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (two.getText().toString().length() == 1)
                    three.requestFocus();
            }
        });
        three.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (three.getText().toString().length() == 1)
                    four.requestFocus();
            }
        });
        four.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (four.getText().toString().length() == 1)
                    five.requestFocus();
            }
        });
        five.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (five.getText().toString().length() == 1)
                    six.requestFocus();
            }
        });
        six.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        btn_show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (transformed) {
                    transformed = false;
                    btn_show.setText("SHOW");
                    one.setTransformationMethod(new PasswordTransformationMethod());
                    two.setTransformationMethod(new PasswordTransformationMethod());
                    three.setTransformationMethod(new PasswordTransformationMethod());
                    four.setTransformationMethod(new PasswordTransformationMethod());
                    five.setTransformationMethod(new PasswordTransformationMethod());
                    six.setTransformationMethod(new PasswordTransformationMethod());
                } else {
                    transformed = true;
                    btn_show.setText("HIDE");
                    one.setTransformationMethod(null);
                    two.setTransformationMethod(null);
                    three.setTransformationMethod(null);
                    four.setTransformationMethod(null);
                    five.setTransformationMethod(null);
                    six.setTransformationMethod(null);
                }
            }
        });
    }

}
