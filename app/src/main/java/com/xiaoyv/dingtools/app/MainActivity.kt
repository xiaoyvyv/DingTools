package com.xiaoyv.dingtools.app

import android.view.LayoutInflater
import com.xiaoyv.blueprint.base.binding.BaseBindingActivity
import com.xiaoyv.dingtools.databinding.ActivityMainBinding

class MainActivity : BaseBindingActivity<ActivityMainBinding>() {

    override fun createContentBinding(layoutInflater: LayoutInflater): ActivityMainBinding {
        return ActivityMainBinding.inflate(layoutInflater)
    }

    override fun initView() {

    }

    override fun initData() {

    }
}