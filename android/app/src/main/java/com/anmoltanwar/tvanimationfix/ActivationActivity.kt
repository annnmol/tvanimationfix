package com.anmoltanwar.tvanimationfix

import android.app.Activity
import android.os.Bundle

class ActivationActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        applyAnimationScales()
        finish()
    }
}
