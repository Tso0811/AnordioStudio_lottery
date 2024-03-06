package tw.edu.pu.gm.s1092192.lottery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var t:TextView=findViewById(R.id.txv)
        t.text = "0"
    }
}