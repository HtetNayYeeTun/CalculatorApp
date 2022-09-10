package com.hnytun.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv_input_number, tv_output_number;
    String number="",out;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InitView();

    }

    private void InitView() {
        tv_input_number = findViewById(R.id.tv_input_number);
        tv_output_number = findViewById(R.id.tv_output_number);
    }

    public void HandleClick(View view) {
        String input = tv_input_number.getText().toString();
        switch (view.getId()) {
            case R.id.btn_1:
                input += "1";
                break;
            case R.id.btn_2:
                input += "2";
                break;
            case R.id.btn_3:
                input += "3";
                break;
            case R.id.btn_4:
                input += "4";
                break;
            case R.id.btn_5:
                input += "5";
                break;
            case R.id.btn_6:
                input += "6";
                break;
            case R.id.btn_7:
                input += "7";
                break;
            case R.id.btn_8:
                input += "8";
                break;
            case R.id.btn_9:
                input += "9";
                break;
            case R.id.btn_0:
                input += "0";
                break;
            case R.id.btn_Point:
                input += ".";
                break;
            case R.id.btn_Plus:
                input += "+";
                break;
            case R.id.btn_Minus:
                input += "-";
                break;
            case R.id.btn_Multiply:
                input += "*";
                break;
            case R.id.btn_Div:
                input += "/";
                break;
            case R.id.btn_Per:
                input += "%";
                break;
            case R.id.btn_Equal:
                input +=number;
                break;
            case R.id.btn_Cl:
                input="";
                tv_output_number.setText("");
                break;
            case R.id.btn_Del:
                input =input.substring(0,input.length()-1);
                tv_input_number.setText(input);
        }
        tv_input_number.setText(input);
    }


    public void EqualClick(View view) {
        number = tv_input_number.getText().toString();
        if (number.split("\\*").length == 2) {
            String num[] = number.split("");
            try {
                double mul = Double.parseDouble(num[0]) * Double.parseDouble(num[2]);
                out = mul + "";
            } catch (Exception e) {

            }

        } else if (number.split("/").length == 2) {
            String num[] = number.split("");
            try {
                double div = Double.parseDouble(num[0]) / Double.parseDouble(num[2]);
                out = div + "";
            } catch (Exception e) {

            }

        }
        else if (number.split("\\+").length == 2) {
            String num[] = number.split("");
            try {
                double plus = Double.parseDouble(num[0]) + Double.parseDouble(num[2]);
                out += plus + "";
            } catch (Exception e) {

            }

        }else if (number.split("-").length == 2) {
            String num[] = number.split("");
            try {
                double minus = Double.parseDouble(num[0]) - Double.parseDouble(num[2]);
                out = minus + "";
            } catch (Exception e) {

            }

        }else if (number.split("%").length == 2) {
            String num[] = number.split("");
            try {
                double per = Double.parseDouble(num[0]) / 100;
                out = per + "";
            } catch (Exception e) {

            }

        }tv_output_number.setText(out);
    }
}