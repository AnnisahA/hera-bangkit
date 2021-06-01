package com.hera.bangkit.ui.main.search



import android.content.Intent
import androidx.recyclerview.widget.RecyclerView
import com.hera.bangkit.databinding.HastagItemBinding
import com.hera.bangkit.ui.main.search.hastagpage.HastagPageActivity

class HastagViewHolder(private val binding: HastagItemBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(hastag : HastagEntity){
         with(binding){
             tvCategory.text = hastag.Category
             tvCountPost.text = hastag.Count.toString()

             itemView.setOnClickListener {
                 val intent = Intent(itemView.context, HastagPageActivity::class.java)
                 intent.putExtra(HastagPageActivity.CATEGORY, hastag.Category)
                 itemView.context.startActivity(intent)
             }
         }
    }
}