package tw.edu.pu.csce.guess2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun Guess(v: View){
        var User:Int=0
        var Phone:Int=(0..2).random()
        var Result:TextView=findViewById(R.id.tvxResult)
        val Pictures= intArrayOf(R.drawable.paper,R.drawable.rock,R.drawable.scissors)
        val imagePhone:ImageView=findViewById(R.id.imagePhone)
         imagePhone.setImageResource(Pictures[Phone])
        if(v.id==R.id.imageP){
            User=0
        }else if(v.id==R.id.imageR){
            User=1
        }else{
            User=2
        }
        Result.text="玩家出" + GuessType(User)+";手機出"+GuessType(Phone)+"\n結果:"+Judge(User,Phone)

    }
    fun GuessType(x:Int):String{
        return when(x){
            0->"剪刀"
            1->"石頭"
            else->"布"
        }
    }
    fun Judge(u:Int,p:Int):String{
        var d:Int=u-p
        if(d==0){
            return "平手"
        }else if(d==1 || d==-2){
            return "玩家獲勝"
        }else{
            return "手機獲勝"
        }
    }

}