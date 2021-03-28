package com.hydok.mlkitface

import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

open class BindingActivity : AppCompatActivity() {
    protected fun <T : ViewDataBinding> myBinding(@LayoutRes resId: Int): Lazy<T> =
        lazy { DataBindingUtil.setContentView<T>(this, resId) }
}