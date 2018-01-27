package test.com.idteam.omarreal

import android.app.FragmentManager
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    var active = true
     var manager = supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        frone()


    }

    fun frone(){
        var trans = manager.beginTransaction()
        var fragmemt = Frone()
        trans.replace(R.id.ch,fragmemt)
        trans.addToBackStack(null)
        trans.commit()
        active = true
    }

    fun frtwo(){
        var trans = manager.beginTransaction()
        var fragmemt = Frtwo()
        trans.replace(R.id.ch,fragmemt)
        trans.addToBackStack(null)
        trans.commit()
        active = false
    }


}