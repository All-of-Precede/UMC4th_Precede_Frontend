package com.example.precede1

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RegisterActivity_abc_4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_abc4)

        val retrofit = Retrofit.Builder()
            .baseUrl("http://3.34.113.4:8080/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        val restApi : RestApi = retrofit.create(RestApi::class.java)

        var dele_btn : ImageButton = findViewById(R.id.delete)
        dele_btn.setOnClickListener{
            var intent = Intent(this, MainActivity::class.java)

            startActivity(intent)
        }

        var befo_btn : Button = findViewById(R.id.button26)
        befo_btn.setOnClickListener{
            var intent = Intent(this, RegisterActivity_abc_3::class.java)

            startActivity(intent)
        }


        var stab_btn : Button = findViewById(R.id.button25)
        stab_btn.setOnClickListener {
            val pwd = findViewById<EditText>(R.id.editTextTextPassword).text.toString()
            val pwdCheck = findViewById<EditText>(R.id.editPasswordCheck).text.toString()

            if (pwd==pwdCheck) {
                val name = intent.getStringExtra("name").toString()
                val birth = intent.getStringExtra("birth").toString()
                val email = intent.getStringExtra("email").toString()
                val register = Register(name, birth, email, pwd)

                val call : Call<Register> = restApi.sendregisters(register)

                call.enqueue(object : Callback<Register> {
                    override fun onResponse(call: Call<Register>, response: Response<Register>) {
                        if (response.isSuccessful) {
                            if (response.code() == 409) {

                            }
                            else if (response.code() == 400) {

                            }
                            else {
                                Toast.makeText(this@RegisterActivity_abc_4, "회원가입이 성공했습니다.", Toast.LENGTH_SHORT).show()
                            }
                        }
                        else {
                            Toast.makeText(this@RegisterActivity_abc_4, "실패했습니다", Toast.LENGTH_SHORT).show()
                            Log.d("E", response.code().toString())
                        }
                    }
                    override fun onFailure(call: Call<Register>, t: Throwable) {
                        Toast.makeText(this@RegisterActivity_abc_4, "정상적으로 가입됐습니다.", Toast.LENGTH_SHORT).show()
                    }
                })

            }
            var newIntent = Intent(this, HomeActivity::class.java)
            startActivity(newIntent)
        }
    }
}