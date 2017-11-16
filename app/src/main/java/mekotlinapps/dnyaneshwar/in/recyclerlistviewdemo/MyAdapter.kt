package mekotlinapps.dnyaneshwar.`in`.recyclerlistviewdemo

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.inflate_list.view.*
import org.jetbrains.anko.toast


/**
 * Created by Dnyaneshwar Dalvi on 16/11/17.
 */
class MyAdapter(var context: Context, var list: List<String>) : RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text = list.get(position)

        holder.itemView.setOnClickListener {
            context.toast(list.get(position))
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        var v = LayoutInflater.from(context).inflate(R.layout.inflate_list, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textView = itemView.text_view
    }
}