package com.hnytun.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    ImageView iv_1, iv_2, iv_3, iv_4, iv_5, iv_6, iv_7, iv_8, iv_9, iv_0, iv_Cl, iv_Del, iv_Per, iv_Div, iv_Minus, iv_Multiply, iv_Plus, iv_Point, iv_Equal;
    TextView tv_input_number, tv_output_number;
    String data, out,number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initView();
        HandleClick();
    }

    private void initView() {
        tv_input_number = findViewById(R.id.tv_input_number);
        tv_output_number = findViewById(R.id.tv_output_number);

        iv_1 = findViewById(R.id.iv_1);
        iv_2 = findViewById(R.id.iv_2);
        iv_3 = findViewById(R.id.iv_3);
        iv_4 = findViewById(R.id.iv_4);
        iv_5 = findViewById(R.id.iv_5);
        iv_6 = findViewById(R.id.iv_6);
        iv_7 = findViewById(R.id.iv_7);
        iv_8 = findViewById(R.id.iv_8);
        iv_9 = findViewById(R.id.iv_9);
        iv_0 = findViewById(R.id.iv_0);
        iv_Cl = findViewById(R.id.iv_Cl);
        iv_Del = findViewById(R.id.iv_Del);
        iv_Per = findViewById(R.id.iv_Per);
        iv_Div = findViewById(R.id.iv_Div);
        iv_Minus = findViewById(R.id.iv_Minus);
        iv_Multiply = findViewById(R.id.iv_Multiply);
        iv_Plus = findViewById(R.id.iv_Plus);
        iv_Point = findViewById(R.id.iv_Point);
        iv_Equal = findViewById(R.id.iv_Equal);
    }

    private void HandleClick() {
        iv_0.setOnClickListener(view -> {
            data = tv_input_number.getText().toString();
            tv_input_number.setText(data + "0");
        });
        iv_1.setOnClickListener(view -> {
            data = tv_input_number.getText().toString();
            tv_input_number.setText(data + "1");
        });
        iv_2.setOnClickListener(view -> {
            data = tv_input_number.getText().toString();
            tv_input_number.setText(data + "2");
        });
        iv_3.setOnClickListener(view -> {
            data = tv_input_number.getText().toString();
            tv_input_number.setText(data + "3");
        });
        iv_4.setOnClickListener(view -> {
            data = tv_input_number.getText().toString();
            tv_input_number.setText(data + "4");
        });
        iv_5.setOnClickListener(view -> {
            data = tv_input_number.getText().toString();
            tv_input_number.setText(data + "5");
        });
        iv_6.setOnClickListener(view -> {
            data = tv_input_number.getText().toString();
            tv_input_number.setText(data + "6");
        });
        iv_7.setOnClickListener(view -> {
            data = tv_input_number.getText().toString();
            tv_input_number.setText(data + "7");
        });
        iv_8.setOnClickListener(view -> {
            data = tv_input_number.getText().toString();
            tv_input_number.setText(data + "8");
        });
        iv_9.setOnClickListener(view -> {
            data = tv_input_number.getText().toString();
            tv_input_number.setText(data + "9");
        });
        iv_Point.setOnClickListener(view -> {
            data = tv_input_number.getText().toString();
            tv_input_number.setText(data + ".");
        });
        iv_Per.setOnClickListener(view -> {
            data = tv_input_number.getText().toString();
            tv_input_number.setText(data + "%");
        });
        iv_Div.setOnClickListener(view -> {
            data = tv_input_number.getText().toString();
            tv_input_number.setText(data + "/");
        });
        iv_Multiply.setOnClickListener(view -> {
            data = tv_input_number.getText().toString();
            tv_input_number.setText(data + "*");
        });
        iv_Minus.setOnClickListener(view -> {
            data = tv_input_number.getText().toString();
            tv_input_number.setText(data + "-");
        });
        iv_Plus.setOnClickListener(view -> {
            data = tv_input_number.getText().toString();
            tv_input_number.setText(data + "+");
        });
        iv_Cl.setOnClickListener(view -> {
            tv_input_number.setText("");
            tv_output_number.setText("");
        });
        iv_Del.setOnClickListener(view -> {
            data = tv_input_number.getText().toString();
            tv_input_number.setText(data.substring(0, data.length() - 1));
        });
       /* iv_Equal.setOnClickListener(view -> {
            data=tv_input_number.getText().toString();
            tv_output_number.setText(out);
            String [] num = data.split("");
            switch (num[1].charAt(0)){
                case '+':
                    out =  Double.toString(Double.parseDouble (num[0])+Double.parseDouble(num[2])) ;
                    break;
                case '-':
                    out =  Double.toString(Double.parseDouble (num[0])-Double.parseDouble(num[2])) ;
                    break;
                case '*':
                    out =  Double.toString(Double.parseDouble (num[0])*Double.parseDouble(num[2])) ;
                    break;
                case '/':
                    out =  Double.toString(Double.parseDouble (num[0])/Double.parseDouble(num[2])) ;
                    break;
                case '%':
                    out =  Double.toString(Double.parseDouble (num[0])/100) ;
                    break;
            }

        });*/

    }
    public void EqualClick(View view) {
        number = tv_input_number.getText().toString();
        if (number.split("\\*").length == 2) {
            String num[] = number.split("");
            try {
                double mul = Double.parseDouble(num[0]) * Double.parseDouble(num[2]);
                out = mul + "";
            } catch (Exception e) {
               e.printStackTrace();
            }

        } else if (number.split("/").length == 2) {
            String num[] = number.split("");
            try {
                double div = Double.parseDouble(num[0]) / Double.parseDouble(num[2]);
                out = div + "";
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        else if (number.split("\\+").length == 2) {
            String num[] = number.split("");
            try {
                double plus = Double.parseDouble(num[0]) + Double.parseDouble(num[2]);
                out = plus +" " ;
            } catch (Exception e) {
                e.printStackTrace();
            }

        }else if (number.split("-").length == 2) {
            String num[] = number.split("");
            try {
                double minus = Double.parseDouble(num[0]) - Double.parseDouble(num[2]);
                out = minus + "";
            } catch (Exception e) {
                e.printStackTrace();
            }

        }else if (number.split("%").length == 2) {
            String num[] = number.split("");
            try {
                double per = Double.parseDouble(num[0]) / 100;
                out = per + "";
            } catch (Exception e) {
                e.printStackTrace();
            }

        }tv_output_number.setText(out);
    }

}