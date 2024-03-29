package com.kVectorFoundation.KV.View.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import com.kVectorFoundation.KV.R
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val rotateAnimation=AnimationUtils.loadAnimation(this,
            R.anim.rotate_arrow
        )
        arrowIV.startAnimation(rotateAnimation)

        var mHun: Handler?
        var splashDaly:Long=800
        mHun= Handler()
        mHun.postDelayed(mru,splashDaly)
    }
    val mru:Runnable= Runnable {
        val i=Intent(this, HomeActivity::class.java)
        startActivity(i)
    }
}
