package test.com.idteam.omarreal

import android.annotation.SuppressLint
import android.app.Fragment
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

/**
 * Created by omarreal on 1/27/18.
 */
class Frone() : android.support.v4.app.Fragment(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {

        var view = inflater!!.inflate(R.layout.fraqone,container,false)

        var but = view.findViewById<Button>(R.id.button2)

        but.setOnClickListener {
            var fragment = Frtwo()
            var manager = activity.supportFragmentManager
            var trans = manager.beginTransaction()
            trans.replace(R.id.ch1,fragment)
            trans.commit()
        }


        return view

    }


}