package typingsSlinky.wxServerSdk

import typingsSlinky.wxServerSdk.wxServerSdkStrings.wx_client
import typingsSlinky.wxServerSdk.wxServerSdkStrings.wx_devtools
import typingsSlinky.wxServerSdk.wxServerSdkStrings.wx_http
import typingsSlinky.wxServerSdk.wxServerSdkStrings.wx_unknown
import typingsSlinky.wxServerSdk.wxServerSdkStrings.其他
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAPPID extends js.Object {
  var APPID: String = js.native
  var ENV: String = js.native
  var OPENID: String = js.native
  var SOURCE: wx_devtools | wx_client | wx_http | wx_unknown | 其他 = js.native
  var UNIONID: String = js.native
}

object AnonAPPID {
  @scala.inline
  def apply(
    APPID: String,
    ENV: String,
    OPENID: String,
    SOURCE: wx_devtools | wx_client | wx_http | wx_unknown | 其他,
    UNIONID: String
  ): AnonAPPID = {
    val __obj = js.Dynamic.literal(APPID = APPID.asInstanceOf[js.Any], ENV = ENV.asInstanceOf[js.Any], OPENID = OPENID.asInstanceOf[js.Any], SOURCE = SOURCE.asInstanceOf[js.Any], UNIONID = UNIONID.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAPPID]
  }
  @scala.inline
  implicit class AnonAPPIDOps[Self <: AnonAPPID] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAPPID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("APPID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withENV(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ENV")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOPENID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OPENID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSOURCE(value: wx_devtools | wx_client | wx_http | wx_unknown | 其他): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SOURCE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUNIONID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UNIONID")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

