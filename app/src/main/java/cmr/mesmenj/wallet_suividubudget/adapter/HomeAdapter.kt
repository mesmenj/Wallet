package cmr.mesmenj.wallet_suividubudget.adapter

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import cmr.mesmenj.wallet_suividubudget.MainActivity
import cmr.mesmenj.wallet_suividubudget.PopupModification
import cmr.mesmenj.wallet_suividubudget.R

class HomeAdapter(
    val context: Activity,
): RecyclerView.Adapter<HomeAdapter.Holder>() {




    class Holder(view:View): RecyclerView.ViewHolder(view){

        val boutton= view.findViewById<TextView>(R.id.ajout)
        val ajout1= view.findViewById<TextView>(R.id.ajout1)
        val ajout2 = view.findViewById<TextView>(R.id.ajout2)
        val modifier= view.findViewById<View>(R.id.modifier)
        val setting = view.findViewById<ImageView>(R.id.setting)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
       val see = LayoutInflater.from(parent.context).inflate(R.layout.boite_a_design,parent,false)
        return Holder(see)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.boutton.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_home_frament_to_fragmentCalcul))
        holder.ajout1.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_home_frament_to_fragmentCalcul))
        holder.ajout2.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_home_frament_to_fragmentCalcul))
        holder.modifier.setOnClickListener{
            PopupModification(this).show()

        }
    }


    override fun getItemCount(): Int = 1
}