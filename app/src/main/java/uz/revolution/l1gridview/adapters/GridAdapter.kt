package uz.revolution.l1gridview.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.item.view.*
import uz.revolution.l1gridview.R
import uz.revolution.l1gridview.models.OS

class GridAdapter(var list: ArrayList<OS>) : BaseAdapter() {

    private var onItemClickListener: OnItemClickListener? = null

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {

        var view = LayoutInflater.from(p2?.context).inflate(R.layout.item, null, false)

        var d = getItem(p0)

        view.text_view.text = d.name
        view.image_view.setImageResource(d.image)

        view.setOnClickListener {
            if (onItemClickListener != null) {
                onItemClickListener?.onClick(d)
            }
        }

        return view
    }

    override fun getItem(p0: Int): OS {
        return list.get(p0)
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getCount(): Int {
        if (list != null) {
            return list.size
        } else {
            return 0
        }
    }

    interface OnItemClickListener {
        fun onClick(data: OS)
    }

    fun setOnItemClickListener(onItemClickListener1: OnItemClickListener) {
        onItemClickListener = onItemClickListener1
    }
}