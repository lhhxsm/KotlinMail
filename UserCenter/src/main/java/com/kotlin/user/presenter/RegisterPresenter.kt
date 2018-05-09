package com.kotlin.user.presenter

import com.kotlin.base.ext.execute
import com.kotlin.base.presenter.BasePresenter
import com.kotlin.base.rx.BaseSubscriber
import com.kotlin.user.presenter.view.RegisterView
import com.kotlin.user.service.impl.UserServiceImpl

/**
 * Create in 2018/5/7 23:16.
 * @author lhh.
 */
class RegisterPresenter : BasePresenter<RegisterView>() {
  fun register(
    mobile: String,
    verifyCode: String,
    password: String
  ) {
    /**
     * 业务逻辑
     */
    val userService = UserServiceImpl()

    userService.register(mobile, verifyCode, password)
        .execute(object : BaseSubscriber<Boolean>() {
          override fun onNext(t: Boolean) {
            mView.onRegisterResult(t)
          }
        })
  }
}