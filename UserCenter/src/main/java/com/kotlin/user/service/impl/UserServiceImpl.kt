package com.kotlin.user.service.impl

import com.kotlin.base.data.protocol.BaseResp
import com.kotlin.base.rx.BaseException
import com.kotlin.user.data.repository.UserRepository
import com.kotlin.user.service.UserService
import rx.Observable
import rx.functions.Func1

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
    val repository = UserRepository()

    return repository.register(mobile, password, verifyCode)
        .flatMap(object : Func1<BaseResp<String>, Observable<Boolean>> {
          override fun call(t: BaseResp<String>): Observable<Boolean> {
            if (t.status != 0) {//成功
              return Observable.error(BaseException(t.status, t.message))
            }
            return Observable.just(true)
          }
        })
  }
}