import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.HiSkyTech.statussaverapp.R

class TabLayoutAdapter(private val context: Context) : RecyclerView.Adapter<TabLayoutAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_view_pager, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // Do nothing here, as fragments will be handled by ViewPager2 and TabLayout
    }

    override fun getItemCount(): Int {

        return 3 // Change this value based on the number of tabs
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}
