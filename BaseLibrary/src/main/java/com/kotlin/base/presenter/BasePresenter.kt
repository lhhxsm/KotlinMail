package com.kotlin.base.presenter

import com.kotlin.base.presenter.view.BaseView

/**
 * Create in 2018/5/7 23:00.
 * @author lhh.
 */
open class BasePresenter<V : BaseView> {
  lateinit var mView: V
}