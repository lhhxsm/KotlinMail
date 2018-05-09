package com.kotlin.user

import android.os.Bundle
import com.kotlin.base.ui.activity.BaseMvpActivity
import com.kotlin.user.presenter.RegisterPresenter
import com.kotlin.user.presenter.view.RegisterView
import kotlinx.android.synthetic.main.activity_register.mBtnRegister
import kotlinx.android.synthetic.main.activity_register.mEtMobile
import kotlinx.android.synthetic.main.activity_register.mEtPassword
import kotlinx.android.synthetic.main.activity_register.mEtVerifyCode

class RegisterActivity : BaseMvpActivity<RegisterPresenter>(), RegisterView {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_register)
    mPresenter = RegisterPresenter()
    mPresenter.mView = this
    mBtnRegister.setOnClickListener {
      mPresenter.register(
          mEtMobile.text.toString(), mEtVerifyCode.text.toString(), mEtPassword.text.toString()
      )
    }
  }

  override fun onRegisterResult(result: Boolean) {

  }
}
