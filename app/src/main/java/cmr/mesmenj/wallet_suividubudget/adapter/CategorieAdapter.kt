package cmr.mesmenj.wallet_suividubudget.adapter

import android.content.Context
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import cmr.mesmenj.wallet_suividubudget.BudgetModel
import cmr.mesmenj.wallet_suividubudget.R
import com.bumptech.glide.Glide


class CategorieAdapter(
    private val context: Context,
    private val budgetModel: List<BudgetModel>,

): RecyclerView.Adapter<CategorieAdapter.Holder1>() {

    class Holder1(view: View): RecyclerView.ViewHolder(view){

    val voir= view.findViewById<RelativeLayout>(R.id.categorie)
        val image = view.findViewById<ImageView>(R.id.dining)
        val name = view.findViewById<TextView>(R.id.foods)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategorieAdapter.Holder1 {
       val vue= LayoutInflater.from(parent.context).inflate(R.layout.categorie_design,parent,false)
        return Holder1(vue)
    }

    override fun onBindViewHolder(holder: CategorieAdapter.Holder1, position: Int) {
        holder.voir.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_categorieFragment_to_itemCategorie))
        val currentObj = budgetModel[position]

        Glide.with(context).load(Uri.parse(currentObj.imageUrl)).into(holder.image)
        holder.name.text = currentObj.name
    }

    override fun getItemCount(): Int= budgetModel.size
}