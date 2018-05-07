package com.kotlin.base.presenter.view

/**
 * Create in 2018/5/7 23:00.
 * @author lhh.
 */
interface BaseView {
  fun showLoading()
  fun hideLoading()
  fun onError()
}