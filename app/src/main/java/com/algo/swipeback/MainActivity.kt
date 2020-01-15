package com.algo.swipeback

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import cn.wj.android.swipeback.helper.SwipeBackHelper
import cn.wj.android.swipeback.helper.dispatchTouchEvent

class MainActivity : AppCompatActivity() {

    var mSwipeBackHelper: SwipeBackHelper? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mSwipeBackHelper = SwipeBackHelper(this)

        setContentView(R.layout.activity_main)
    }

    override fun dispatchTouchEvent(ev: MotionEvent?): Boolean =
        mSwipeBackHelper.dispatchTouchEvent(ev!!) {
            super.dispatchTouchEvent(ev)
        }
}