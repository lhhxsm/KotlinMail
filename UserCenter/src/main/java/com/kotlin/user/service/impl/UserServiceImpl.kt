package com.kotlin.user.service.impl

import com.kotlin.user.service.UserService
import rx.Observable

/**
 * Create in 2018/5/7 23:37.
 * @author lhh.
 */
class UserServiceImpl : UserService {
  override fun register(
    mobile: String,
    verifyCode: String,
    password: String
  ): Observable<Boolean> {
    return Observable.just(true)
  }
}