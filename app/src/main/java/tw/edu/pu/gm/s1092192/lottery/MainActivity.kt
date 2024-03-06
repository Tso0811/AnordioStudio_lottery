package tw.edu.pu.gm.s1092192.lottery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var t:TextView=findViewById(R.id.txv)
        t.text = "0"
    }

    fun mainFun(v: View){
        var txv: TextView = findViewById(R.id.txv)
        if (v.id == R.id.btn_CreateNum){
            txv.text = (1..100).random().toString()
        }
        else{
            txv.text = ("0")
        }
    }
}