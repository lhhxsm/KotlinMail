package com.kotlin.user.data.repository

import com.kotlin.base.data.net.RetrofitFactory
import com.kotlin.base.data.protocol.BaseResp
import com.kotlin.user.data.api.UserApi
import com.kotlin.user.data.protocol.RegisterReq
import rx.Observable

class UserRepository {

  fun register(
    mobile: String,
    password: String,
    verifyCode: String
  ): Observable<BaseResp<String>> {
    return RetrofitFactory.instance.create(UserApi::class.java)
        .regiseter(RegisterReq(mobile, password, verifyCode))
  }
}