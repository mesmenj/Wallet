package cmr.mesmenj.wallet_suividubudget

import android.annotation.SuppressLint
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import androidx.drawerlayout.widget.DrawerLayout
import androidx.drawerlayout.widget.DrawerLayout.LOCK_MODE_LOCKED_CLOSED
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_calcul.*
import javax.script.ScriptEngine
import javax.script.ScriptEngineManager
import javax.script.ScriptException

class FragmentCalcul: Fragment(){

    lateinit var button1: Button
    lateinit var button2: Button
    lateinit var button3: Button
    lateinit var button4: Button
    lateinit var button5: Button
    lateinit var button6: Button
    lateinit var button7: Button
    lateinit var button8: Button
    lateinit var button9: Button
    lateinit var button0: Button
    lateinit var buttonMulti: Button
    lateinit var buttonDiv: Button
    lateinit var buttonMoins: Button
    lateinit var buttonPoint: Button
    lateinit var buttonClear: ImageButton
    lateinit var buttonAdd: Button
    lateinit var buttonEqual: Button
    lateinit var inputtex: EditText
    lateinit var resultex: EditText

    var check = 0

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        // Inflate the layout for this fragment
       val views= inflater.inflate(R.layout.fragment_calcul, container, false)
        val drawer= views.findViewById<DrawerLayout>(R.id.myDrawer)
        val viewCarte= views.findViewById<TextView>(R.id.carte)
        viewCarte.setOnClickListener{
            Navigation.findNavController(viewCarte).navigate(R.id.action_fragmentCalcul_to_categorieFragment)
        }
        button1= views.findViewById(R.id.one)
        button2= views.findViewById(R.id.two)
        button3= views.findViewById(R.id.three)
        button4= views.findViewById(R.id.four)
        button5= views.findViewById(R.id.five)
        button6= views.findViewById(R.id.six)
        button7= views.findViewById(R.id.seven)
        button8= views.findViewById(R.id.huit)
        button9= views.findViewById(R.id.nine)
        button0= views.findViewById(R.id.zero)
        buttonPoint= views.findViewById(R.id.virgule)
        buttonMulti= views.findViewById(R.id.multi)
        buttonMoins= views.findViewById(R.id.soustr)
        buttonDiv= views.findViewById(R.id.div)
        buttonClear= views.findViewById(R.id.back)
        buttonAdd= views.findViewById(R.id.plus)
        buttonEqual= views.findViewById(R.id.equals)
        resultex= views.findViewById(R.id.inputNumber)
        inputtex= views.findViewById(R.id.inputNumber)
        inputtex.movementMethod= ScrollingMovementMethod()
        inputtex.isActivated
        inputtex.isPressed

        var text: String

        button1.setOnClickListener{
            text= inputtex.text.toString()+"1"
            inputtex.setText(text)
            check= check+1

        }
        button2.setOnClickListener{
            text= inputtex.text.toString()+"2"
            inputtex.setText(text)
            check= check+1

        }
        button3.setOnClickListener{
            text= inputtex.text.toString()+"3"
            inputtex.setText(text)

        }
        button4.setOnClickListener{
            text= inputtex.text.toString()+"4"
            inputtex.setText(text)
            check= check+1

        }
        button5.setOnClickListener{
            text= inputtex.text.toString()+"5"
            inputtex.setText(text)
            check= check+1

        }
        button6.setOnClickListener{
            text= inputtex.text.toString()+"6"
            inputtex.setText(text)
            check= check+1

        }
        button7.setOnClickListener{
            text= inputtex.text.toString()+"7"
            inputtex.setText(text)
            check= check+1

        }
        button8.setOnClickListener{
            text= inputtex.text.toString()+"8"
            inputtex.setText(text)
            check= check+1

        }
        button9.setOnClickListener{
            text= inputtex.text.toString()+"9"
            inputtex.setText(text)
            check= check+1

        }
        button0.setOnClickListener{
            text= inputtex.text.toString()+"0"
            inputtex.setText(text)
            check= check+1

        }
        buttonPoint.setOnClickListener{
            text= inputtex.text.toString()+"."
            inputtex.setText(text)

        }
        buttonAdd.setOnClickListener{
            text= inputtex.text.toString()+"+"
            inputtex.setText(text)
            check= check+1
        }

        buttonDiv.setOnClickListener{
            text= inputtex.text.toString()+"/"
            inputtex.setText(text)
            check= check+1
        }
        buttonMoins.setOnClickListener{
            text= inputtex.text.toString()+"-"
            inputtex.setText(text)
            check= check+1
        }
        buttonMulti.setOnClickListener{
            text= inputtex.text.toString()+"*"
            inputtex.setText(text)
            check= check+1
        }
        buttonEqual.setOnClickListener{
            text= inputtex.text.toString()
            result(text)


        }
        buttonClear.setOnClickListener{
           var clear: String?= null

            if(inputtex.text.length>0)
            {
                val stringBuilder: StringBuilder= java.lang.StringBuilder(inputtex.text)
                val find= inputtex.text.toString()
                val find2= find.last()

                if(find2.equals('+') || find2.equals('-') || find2.equals('*') || find2.equals('/'))
                {
                    check= check-1
                }
                stringBuilder.deleteCharAt(inputtex.text.length-1)
                clear=stringBuilder.toString()
                inputtex.setText(clear)

            }



        }

        return views
    }

    private fun result(text: String) {

       val engine: ScriptEngine? = ScriptEngineManager().getEngineByName("rhino")
       try {
           val result: Any= engine!!.eval(text)
           var mainr= result.toString()
           if (check==0)
           {
               resultex.setText(null)
           }
           else
           {
               resultex.setText(mainr)
           }
       }
       catch (e: ScriptException)
       {
           Log.d("TAG","ERREUR")
       }


    }


}

