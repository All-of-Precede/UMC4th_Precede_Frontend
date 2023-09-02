package com.example.precede1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.content.Intent
import android.util.Log
import android.widget.EditText
import android.widget.Toast
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val retrofit = Retrofit.Builder()
            .baseUrl("http://3.34.113.4:8080/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        val restApi : RestApi = retrofit.create(RestApi::class.java)


        var stab_btn : Button = findViewById(R.id.btn_use3)
        stab_btn.setOnClickListener {
            var Intent = Intent(this, UseActivity::class.java)

            startActivity(Intent)
        }
        var sta_btn : Button = findViewById(R.id.btn_finder)
        sta_btn.setOnClickListener {
            var Intent = Intent(this, IDPWActivity::class.java)

            startActivity(Intent)
        }
        var muse_btn : Button = findViewById(R.id.btn_firstWatch)
        muse_btn.setOnClickListener {
            var Intent = Intent(this, HomeActivity::class.java)

            startActivity(Intent)
        }
        var mpriv_btn : Button = findViewById(R.id.btn_use)
        mpriv_btn.setOnClickListener {
            var Intent = Intent(this, UseActivity::class.java)

            startActivity(Intent)
        }
        var mpol_btn : Button = findViewById(R.id.btn_policy)
        mpol_btn.setOnClickListener {
            var Intent = Intent(this, MainprivActivity::class.java)

            startActivity(Intent)
        }

        val loginBtn = findViewById<Button>(R.id.loginButton)
        loginBtn.setOnClickListener {
            val name = findViewById<EditText>(R.id.editTextTextEmailAddress).text.toString()
            val pwd = findViewById<EditText>(R.id.editTextTextPassword2).text.toString()
            val person = Person(name, pwd)

            val call : Call<Person> = restApi.sendlogin(person)

            call.enqueue(object : Callback<Person> {
                override fun onResponse(call: Call<Person>, response: Response<Person>) {
                    if (response.isSuccessful) {
                        if (response.code() == 409) {

                        }
                        else if (response.code() == 400) {

                        }
                        else {
                            Toast.makeText(this@LoginActivity, "로그인이 성공했습니다.", Toast.LENGTH_SHORT).show()
                        }
                    }
                    else {
                        Toast.makeText(this@LoginActivity, "로그인이 실패했습니다", Toast.LENGTH_SHORT).show()
                        Log.d("E", response.code().toString())
                    }
                }
                override fun onFailure(call: Call<Person>, t: Throwable) {
                    Toast.makeText(this@LoginActivity, "이건 뭘까ㅣ.", Toast.LENGTH_SHORT).show()
                }
            })

        val intent = Intent(this@LoginActivity, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}