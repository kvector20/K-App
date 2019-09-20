package com.kVectorFoundation.KV.View.Activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import com.kVectorFoundation.KV.R

class MagiActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_magi)

        val actionbar = supportActionBar
        actionbar!!.title = "Magazine"
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)


        val host=NavHostFragment.create(R.navigation.mag_navigation)
        supportFragmentManager.beginTransaction().replace(R.id.fram,host).setPrimaryNavigationFragment(host).commit()
      //  CallApi().call()



    }


    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }


}


