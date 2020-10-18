package jp.techacademy.takuto.kotlinlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android .util.Log  //ここを追加

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human = Human("修二", 17, "彼女")

        human.say()
//        Log.d("kotlintest", "私の名前は" + human.name + "です。")
//        Log.d("kotlintest", "年は" + human.age + "歳です。")

        val human2 = Human("彰", 18,"あの子")

        human2.say()
//        Log.d("kotlintest", "私の名前は" + human2.name + "です。")
//        Log.d("kotlintest", "年は" + human2.age + "歳です。")



        human.think()

        human2.think()
}
}
