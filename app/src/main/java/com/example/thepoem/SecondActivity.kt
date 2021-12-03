package com.example.thepoem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var user = intent.extras?.getString("username")
        val textview_second_info: TextView = findViewById(R.id.textView)
        textview_second_info.text = "$user, прочитайте замечательное стихотворение"

        val multiLine1 = """
            Пушкин А.С. "Зимний вечер"

        Буря мглою небо кроет,
        Вихри снежные крутя;
        То, как зверь, она завоет,
        То заплачет, как дитя,
        То по кровле обветшалой
        Вдруг соломой зашумит,
        То, как путник запоздалый,
        К нам в окошко застучит.

        Наша ветхая лачужка
        И печальна и темна.
        Что же ты, моя старушка,
        Приумолкла у окна?
        Или бури завываньем
        Ты, мой друг, утомлена,
        Или дремлешь под жужжаньем
        Своего веретена?"""

        val textView2: TextView = findViewById(R.id.textView2)
        textView2.text = multiLine1

        val buttonNext: Button = findViewById(R.id.buttonNext)
        buttonNext.setOnClickListener {
            val intent = Intent(this@SecondActivity, ThirdActivity::class.java)
            startActivity(intent)
        }
        val buttonPrevious2: Button = findViewById(R.id.buttonPrevious2)
        buttonPrevious2.setOnClickListener {
            val intent = Intent(this@SecondActivity, MainActivity::class.java)
            startActivity(intent)
        }
    }
}