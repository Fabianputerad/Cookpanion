package com.example.recipeapplec;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


import java.util.HashMap;
import java.util.Map;

public class login extends AppCompatActivity {
    Button btnlogin, btnchange;
    TextView email, password;

    public boolean ck(TextView a){
        if(TextUtils.isEmpty(a.getText().toString())){
            return true;
        }
        return false;
    }

    public boolean cekPass(TextView a){
        String b=a.getText().toString();
        if(b.length()<3){
            return false;
        }
        else if(b.isEmpty()){
            //kondisi password ga kena
            return false;
        }
        return true;
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
        setContentView(R.layout.activity_login);

//        Map<String, String> user = new HashMap<>();
//        user.put("name","budi");
//        user.put("email","budi@gmail.com");
//        db.collection("User").add(user);
//        db.collection("User").document("User1").set(user);




        Intent move = new Intent(this,registration.class);
        btnlogin = findViewById(R.id.btnlogin);
        btnchange = findViewById(R.id.btnchange);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        Intent tohome = new Intent(this, Home.class);

//        BACA DATA DARI FIREBASE



        btnlogin.setOnClickListener(e->{

            startActivity(tohome);

//            if(ck(email)&&ck(password)){
//                salert("please fill all credentials");
//            }
//            else{
//                String uEmail = email.getText().toString();
//                String uPass = password.getText().toString();
//                startActivity(tohome);
////                BACA DATA DARI FIREBASE
//                db.collection("User").get().addOnCompleteListener(
//                        task -> {
//                            if(task.isSuccessful()){
//                                for(QueryDocumentSnapshot x: task.getResult()){
//                                    if(x.get("name")==uEmail && x.get("password")==uPass){
//                                        //LOGIN SUCESSS
//                                        System.out.println(x.get("name"));
//                                        System.out.println(x.get("password"));
//                                    }
////                                Log.d("Name", x.get("name").toString());
//                                    salert("user not found");
//                                }
//
//
////                           AMBIL SALAH SATU DATA
//
//                                task.getResult().getDocuments();
//                            }
//                        }
//                );
//            }
        });


        btnchange.setOnClickListener(e->{
            startActivity(move);
        });
    }
}