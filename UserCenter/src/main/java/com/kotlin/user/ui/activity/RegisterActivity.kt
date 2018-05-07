package com.kotlin.user

import android.os.Bundle
import android.widget.Toast
import com.kotlin.base.ui.activity.BaseMvpActivity
import com.kotlin.user.presenter.RegisterPresenter
import com.kotlin.user.presenter.view.RegisterView
import kotlinx.android.synthetic.main.activity_register.mBtnRegister

class RegisterActivity : BaseMvpActivity<RegisterPresenter>(), RegisterView {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_register)
    mPresenter = RegisterPresenter();
    mPresenter.mView = this
    mBtnRegister.setOnClickListener {
      mPresenter.register("", "", "")
    }
  }

  override fun onRegisterResult(result: Boolean) {
    Toast.makeText(this, "result--   adfa->" + result, Toast.LENGTH_LONG)
        .show()
  }
}
