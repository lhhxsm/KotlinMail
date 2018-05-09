package com.kotlin.user.data.protocol

data class RegisterReq(
  val mobile: String,
  val password: String,
  val verifyCode: String
) {
}