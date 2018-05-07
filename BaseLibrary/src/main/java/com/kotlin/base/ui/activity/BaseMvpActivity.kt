package com.kotlin.base.ui.activity

import com.kotlin.base.presenter.BasePresenter
import com.kotlin.base.presenter.view.BaseView

/**
 * Create in 2018/5/7 23:04.
 * @author lhh.
 */
open class BaseMvpActivity<P : BasePresenter<*>> : BaseActivity(), BaseView {
  lateinit var mPresenter: P

  override fun showLoading() {
  }

  override fun hideLoading() {
  }

  override fun onError() {
  }
}