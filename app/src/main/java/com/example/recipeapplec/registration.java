package com.example.recipeapplec;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Map;

public class registration extends AppCompatActivity {
    Button btnlogin, btnchange;
    TextView email, username, password, cpassword;

    public boolean ck(TextView a){
        if(TextUtils.isEmpty(a.getText().toString())){
            return true;
        }
        return false;
    }

    public Integer cekPass(TextView a){
        String b=a.getText().toString();
        if(b.length()<5){
            return 1;
        }

        char[] x = a.getText().toString().toCharArray();

        for(int i=0;i<a.getText().toString().length();i++){
            if( !( (x[i]>='0' && x[i]<='9') || (x[i]>='A' && x[i]<='Z') || (x[i]>='a' && x[i]<='z') )){
                return 2;
            }
        }
        return 0;
    }

    public boolean pasmatch(TextView a, TextView b){
        if(a.getText().toString().matches(b.getText().toString())){
            return true;
        }
        return false;
    }

    public boolean cekEmail(TextView a){
        String b=a.getText().toString();
        if(b.contains(".com") && b.contains("@")){
            return true;
        }
        return false;
    }

    public void salert(String msg){
        Toast.makeText(this,msg, Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);


        Intent move = new Intent(this,registration.class);
        btnlogin = findViewById(R.id.btnlogin);
        btnchange = findViewById(R.id.btnchange);
        email = findViewById(R.id.email);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        cpassword = findViewById(R.id.cpassword);



        btnlogin.setOnClickListener(e->{
            Map<String, String> user = new HashMap<>();
//            System.out.println(db.collection("User").get().toString());

//            MASUKIN USER
            salert("udh ya");

//            if(ck(email) && ck(username) && ck(password) && ck(cpassword)){
//                Toast.makeText(this,"Please fill the credentials", Toast.LENGTH_SHORT).show(); return;
//            }
//            else{
//                if(!cekEmail(email)){
//                    salert("email has to contain '.com' and '@'"); return;
//                }
//
//                if(cekPass(password)==1){
//                    salert("password length has to be more than 5"); return;
//                }
//                else if(cekPass(password)==2){
//                    salert("password is only alphanumerical"); return;
//                }
//
//                if(!pasmatch(password, cpassword)){
//                    salert("password has to match"); return;
//                }
//                user.put("name",username.getText().toString());
//                user.put("email",email.getText().toString());
//                db.collection("User").add(user);
//                salert("registration successful");
//            }
//
        });


        btnchange.setOnClickListener(e->{
            startActivity(move);
        });



    }
}