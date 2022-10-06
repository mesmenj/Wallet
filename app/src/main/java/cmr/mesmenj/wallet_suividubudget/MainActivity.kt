package cmr.mesmenj.wallet_suividubudget

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation

import androidx.navigation.findNavController
import androidx.navigation.ui.*
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import cmr.mesmenj.wallet_suividubudget.databinding.ActivityMainBinding

import com.google.android.material.navigation.NavigationView
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.tabs.TabLayout

class MainActivity  : AppCompatActivity() {
    private lateinit var appBarConfiguration: AppBarConfiguration

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.barMain.toolbar)
        val navController= findNavController(R.id.fragmentContainerView)
        val drawerLayout: DrawerLayout = binding.myDrawer
        val navView: NavigationView =binding.nav


        appBarConfiguration = AppBarConfiguration(setOf(R.id.home_frament,R.id.objectif), drawerLayout)


        setupActionBarWithNavController(navController,appBarConfiguration)
            navView.setupWithNavController(navController)



    }


    override fun onSupportNavigateUp(): Boolean {
        val navController= findNavController(R.id.fragmentContainerView)


        return  navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }



}