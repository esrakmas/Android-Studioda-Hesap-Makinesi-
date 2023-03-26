package com.example.hesapmakinesi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView HesaplamaPaneli;
    TextView SonucPaneli;
    Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button0;
    Button buttontopla,buttoncikar,buttoncarp,buttonsil,buttonbol,buttonesit,buttonnokta;
    boolean topla,cıkar,carp,bol;
    float n1;
    float n2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0=findViewById(R.id.button0);
        button1=findViewById(R.id.button1);
        button2=findViewById(R.id.button2);
        button3=findViewById(R.id.button3);
        button4=findViewById(R.id.button4);
        button5=findViewById(R.id.button5);
        button6=findViewById(R.id.button6);
        button7=findViewById(R.id.button7);
        button8=findViewById(R.id.button8);
        button9=findViewById(R.id.button9);
        buttontopla=findViewById(R.id.buttontopla);
        buttoncikar=findViewById(R.id.buttoncikar);
        buttoncarp=findViewById(R.id.buttoncarp);
        buttonbol=findViewById(R.id.buttonbol);
        buttonesit=findViewById(R.id.buttonesit);
        buttonsil=findViewById(R.id.buttonsil);
        buttonnokta=findViewById(R.id.buttonnokta);

        HesaplamaPaneli=findViewById(R.id.HesaplamaPaneli);
        SonucPaneli=findViewById(R.id.SonucPaneli);



        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                HesaplamaPaneli.setText(HesaplamaPaneli.getText() + "0");
                SonucPaneli.setText(HesaplamaPaneli.getText());
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HesaplamaPaneli.setText(HesaplamaPaneli.getText() + "1");
                SonucPaneli.setText(HesaplamaPaneli.getText());
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HesaplamaPaneli.setText(HesaplamaPaneli.getText() + "2");
                SonucPaneli.setText(HesaplamaPaneli.getText());
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HesaplamaPaneli.setText(HesaplamaPaneli.getText() + "3");
                SonucPaneli.setText(HesaplamaPaneli.getText());            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HesaplamaPaneli.setText(HesaplamaPaneli.getText() + "4");
                SonucPaneli.setText(HesaplamaPaneli.getText());            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HesaplamaPaneli.setText(HesaplamaPaneli.getText() + "5");
                SonucPaneli.setText(HesaplamaPaneli.getText());
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HesaplamaPaneli.setText(HesaplamaPaneli.getText() + "6");
                SonucPaneli.setText(HesaplamaPaneli.getText());
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HesaplamaPaneli.setText(HesaplamaPaneli.getText() + "7");
                SonucPaneli.setText(HesaplamaPaneli.getText());
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HesaplamaPaneli.setText(HesaplamaPaneli.getText() + "8");
                SonucPaneli.setText(HesaplamaPaneli.getText());
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HesaplamaPaneli.setText(HesaplamaPaneli.getText() + "9");
                SonucPaneli.setText(HesaplamaPaneli.getText());
            }
        });

        buttonsil.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HesaplamaPaneli.setText("");
            }
        }));

        buttonnokta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HesaplamaPaneli.setText(HesaplamaPaneli.getText()+".");
                SonucPaneli.setText(HesaplamaPaneli.getText());
            }
        });

        buttontopla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                n1 = Float.parseFloat(HesaplamaPaneli.getText() + "");
                topla = true;
                HesaplamaPaneli.setText(null);
            }
        });

        buttoncikar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1 = Float.parseFloat(HesaplamaPaneli.getText() + "");
                cıkar = true;
                HesaplamaPaneli.setText(null);
            }
        });

        buttoncarp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1 = Float.parseFloat(HesaplamaPaneli.getText() + "");
                carp = true;
                HesaplamaPaneli.setText(null);
            }
        });

        buttonbol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1 = Float.parseFloat(HesaplamaPaneli.getText() + "");
                bol = true;
                HesaplamaPaneli.setText(null);
            }
        });

        buttonesit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n2 = Float.parseFloat(HesaplamaPaneli.getText().toString());
                String islem = "";
                if (topla) {
                    HesaplamaPaneli.setText(n1 + n2 + "");
                    islem = "+";
                }
                else if (cıkar) {
                    HesaplamaPaneli.setText(n1 - n2 + "");
                    islem = "-";
                }
                else if (carp) {
                    HesaplamaPaneli.setText(n1 * n2 + "");
                    islem = "*";
                }
                else if (bol) {
                    HesaplamaPaneli.setText(n1 / n2 + "");
                    islem = "/";
                }
                SonucPaneli.setText(n1 + islem + n2);
                topla = false;
                cıkar = false;
                carp = false;
                bol = false;
            }
        });



    }
}