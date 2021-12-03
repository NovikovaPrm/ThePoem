package com.example.thepoem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val multiLine2 = """
        Выпьем, добрая подружка
        Бедной юности моей,
        Выпьем с горя; где же кружка
        Сердцу будет веселей
        Спой мне песню, как синица
        Тихо за морем жила;
        Спой мне песню, как девица
        За водой поутру шла. 
        
        Буря мглою небо кроет,
        Вихри снежные крутя;
        То, как зверь, она завоет,
        То заплачет, как дитя.
        Выпьем, добрая подружка
        Бедной юности моей,
        Выпьем с горя: где же кружка?
        Сердцу будет веселей."""

        val textView3: TextView = findViewById(R.id.textView3)
        textView3.text = multiLine2

        val buttonPrevious: Button = findViewById(R.id.buttonPrevious)
        buttonPrevious.setOnClickListener {
            val intent = Intent(this@ThirdActivity, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}