package test.com.idteam.omarreal

import android.app.Fragment
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by omarreal on 1/27/18.
 */
class Frtwo : android.support.v4.app.Fragment(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {


        return inflater!!.inflate(R.layout.frtwo,container,false)
    }

}