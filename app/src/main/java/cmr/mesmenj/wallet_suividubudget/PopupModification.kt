package cmr.mesmenj.wallet_suividubudget

import android.app.Dialog
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.Navigation
import cmr.mesmenj.wallet_suividubudget.adapter.HomeAdapter
import com.google.android.material.navigation.NavigationView
import kotlinx.coroutines.flow.callbackFlow

class PopupModification(
    private val context: HomeAdapter
): Dialog(context.context) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.popup_modification)

        bouttonAnnuler()
    }

    private fun bouttonAnnuler() {
        findViewById<TextView>(R.id.annuler).setOnClickListener{
          dismiss()
        }
    }


}