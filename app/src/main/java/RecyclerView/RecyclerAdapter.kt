package RecyclerView

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myplanner.R

class RecyclerAdapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    var list = listOf<String>()
        set(value) {
            field= value
            notifyDataSetChanged()
        }
    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val task: TextView = itemView.findViewById(R.id.textView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.list_item_layout, parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.task.text = list[position]
    }

    override fun getItemCount(): Int = list.size
}