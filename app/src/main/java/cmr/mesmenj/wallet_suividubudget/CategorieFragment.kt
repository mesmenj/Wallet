package cmr.mesmenj.wallet_suividubudget

import android.app.Activity
import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.view.WindowManager
import androidx.recyclerview.widget.RecyclerView
import cmr.mesmenj.wallet_suividubudget.adapter.CategorieAdapter


class CategorieFragment(

) : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       val inject= inflater.inflate(R.layout.fragment_categorie, container, false)

        val budgetList= arrayListOf<BudgetModel>()
        budgetList.add(BudgetModel(
                "Nourritures et Boissons",
                "https://img1.freepng.fr/20180615/ipk/kisspng-plate-cloth-napkins-stock-photography-knife-cuttin-couvert-de-table-5b23458bd1d7c5.7794145715290382198595.jpg"
        ))
        budgetList.add(BudgetModel(
            "Revenu",
            "https://png.pngtree.com/png-clipart/20190520/original/pngtree-income-glyph-black-icon-png-image_4008312.jpg"
        ))
        budgetList.add(BudgetModel(
            "Achats",
            "https://img2.freepng.fr/20180610/uxv/kisspng-shopping-cart-online-shopping-retail-service-5b1d888b66fb52.2465693315286621554218.jpg"
        ))
        budgetList.add(BudgetModel(
            "Logement",
            "https://img2.freepng.fr/20180710/uol/kisspng-housing-house-home-apartment-clip-art-fair-housing-5b4486038241e5.0062711615312174115335.jpg"
        ))
        budgetList.add(BudgetModel(
            "Transports",
            "https://d2v9ipibika81v.cloudfront.net/uploads/sites/220/244-2445340_transportation-icon-free-transportation-icon-png-transparent-png.png"
        ))
        budgetList.add(BudgetModel(
            "Vehicule",
            "https://static.vecteezy.com/system/resources/previews/001/193/767/non_2x/compact-car-png.png"
        ))
        budgetList.add(BudgetModel(
            "Loisirs",
            "https://img.freepik.com/vecteurs-libre/propos-moi-concept-pack-interets-loisirs_23-2148885158.jpg?w=2000"
        ))
        budgetList.add(BudgetModel(
            "Multimedia,PC",
            "https://png.pngtree.com/element_pic/17/01/08/b712e9fa483d9e7384d44478e0a175d5.jpg"
        ))
        budgetList.add(BudgetModel(
            "Frais financiers",
            "https://png.pngtree.com/element_our/20190529/ourlarge/pngtree-financial-investment-rising-illustration-image_1224257.jpg"
        ))
        budgetList.add(BudgetModel(
            "Investissements",
            "https://w7.pngwing.com/pngs/705/241/png-transparent-income-business-accounting-service-revenue-coin-saving-service-people-thumbnail.png"
        ))
        budgetList.add(BudgetModel(
            "autres",
            "https://assets.stickpng.com/images/588a6507d06f6719692a2d15.png"
        ))

        val cateRecycler= inject.findViewById<RecyclerView>(R.id.recycler_categorie)
        cateRecycler.adapter= CategorieAdapter(requireContext(),budgetList)

        return inject
    }


}