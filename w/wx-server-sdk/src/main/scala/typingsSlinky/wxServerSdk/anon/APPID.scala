package typingsSlinky.wxServerSdk.anon

import typingsSlinky.wxServerSdk.wxServerSdkStrings.wx_client
import typingsSlinky.wxServerSdk.wxServerSdkStrings.wx_devtools
import typingsSlinky.wxServerSdk.wxServerSdkStrings.wx_http
import typingsSlinky.wxServerSdk.wxServerSdkStrings.wx_unknown
import typingsSlinky.wxServerSdk.wxServerSdkStrings.其他
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait APPID extends js.Object {
  var APPID: String
  var ENV: String
  var OPENID: String
  var SOURCE: wx_devtools | wx_client | wx_http | wx_unknown | 其他
  var UNIONID: String
}

object APPID {
  @scala.inline
  def apply(
    APPID: String,
    ENV: String,
    OPENID: String,
    SOURCE: wx_devtools | wx_client | wx_http | wx_unknown | 其他,
    UNIONID: String
  ): APPID = {
    val __obj = js.Dynamic.literal(APPID = APPID.asInstanceOf[js.Any], ENV = ENV.asInstanceOf[js.Any], OPENID = OPENID.asInstanceOf[js.Any], SOURCE = SOURCE.asInstanceOf[js.Any], UNIONID = UNIONID.asInstanceOf[js.Any])
    __obj.asInstanceOf[APPID]
  }
}

