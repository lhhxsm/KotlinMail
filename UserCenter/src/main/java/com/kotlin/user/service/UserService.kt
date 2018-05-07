package com.kotlin.user.service

import rx.Observable

/**
 * Create in 2018/5/7 23:35.
 * @author lhh.
 */
interface UserService {
  fun register(
    mobile: String,
    verifyCode: String,
    password: String
  ): Observable<Boolean>
}