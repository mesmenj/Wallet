package cmr.mesmenj.wallet_suividubudget

import android.content.Context
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.Navigation
import androidx.navigation.ui.setupWithNavController
import androidx.recyclerview.widget.RecyclerView
import cmr.mesmenj.wallet_suividubudget.adapter.HomeAdapter
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.floatingactionbutton.FloatingActionButton


class Home_frament() : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val views = inflater.inflate(R.layout.fragment_home_frament, container, false)
        val recyclerHori = views.findViewById<RecyclerView>(R.id.recycler)
        recyclerHori.adapter = HomeAdapter(requireActivity())

        val add = views.findViewById<FloatingActionButton>(R.id.add)
        add.setOnClickListener {
            Navigation.findNavController(add).navigate(R.id.fragmentCalcul)
        }
        val notif = views.findViewById<ImageView>(R.id.notification)
       notif.setOnClickListener {
            Navigation.findNavController(notif).navigate(R.id.action_home_frament_to_notificationFragment)
        }

        return views
    }



}


