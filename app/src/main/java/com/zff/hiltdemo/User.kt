package com.zff.hiltdemo

import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
data class User(var name:String = "张三",var age:Int = 28) {
    @Inject constructor() : this("李四",80)
}