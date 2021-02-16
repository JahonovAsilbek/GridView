package uz.revolution.l1gridview

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.item_info.view.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val info: Int = intent.getIntExtra("info", R.string.notfound)
        Log.d("AAAA", info.toString())

        val itemView = LayoutInflater.from(this).inflate(R.layout.item_info, null, false)
        itemView.text_info.setText(info)
        container.addView(itemView)
//        val arrayAdapter=ArrayAdapter<String>(this,info,info)

    }
}