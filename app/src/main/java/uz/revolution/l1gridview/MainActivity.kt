package uz.revolution.l1gridview

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import uz.revolution.l1gridview.adapters.GridAdapter
import uz.revolution.l1gridview.models.OS

class MainActivity : AppCompatActivity() {

    var list = ArrayList<OS>()
    var adapter: GridAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadData()

        adapter = GridAdapter(list)
        grid_view.adapter = adapter


        adapter?.setOnItemClickListener(object : GridAdapter.OnItemClickListener {
            override fun onClick(data: OS) {


                val intent = Intent(this@MainActivity, MainActivity2::class.java).apply {
                    putExtra("info", data.info)
                    Log.d("AAAA", "onClick: " + data.info)
                }
                startActivity(intent)
            }
        })


    }

    private fun loadData() {
        list.add(OS(R.drawable.cupcake, "Cupcake", R.string.cupcake))
        list.add(OS(R.drawable.donut, "Donut", R.string.donut))
        list.add(OS(R.drawable.eclair, "Eclair", R.string.eclair))
        list.add(OS(R.drawable.froyo, "Froyo", R.string.froyo))
        list.add(OS(R.drawable.gingerbread, "Gingerbread", R.string.Gingerbread))
        list.add(OS(R.drawable.kitkat, "KitKat", R.string.kitkat))
        list.add(OS(R.drawable.lollipop, "Lollipop", R.string.lollipop))
        list.add(OS(R.drawable.marshmallow, "Marshmallow", R.string.marshmallow))
        list.add(OS(R.drawable.nougat, "Nougat", R.string.nougat))
        list.add(OS(R.drawable.oreo, "Oreo", R.string.oreo))
        list.add(OS(R.drawable.pie, "Pie", R.string.pie))

    }

}