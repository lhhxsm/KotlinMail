package com.kotlin.user.presenter.view

import com.kotlin.base.presenter.view.BaseView

/**
 * Create in 2018/5/7 23:18.
 * @author lhh.
 */
interface RegisterView : BaseView {
  fun onRegisterResult(result: Boolean)
}