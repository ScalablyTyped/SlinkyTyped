package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCOAuthCredential extends js.Object {
  var accessToken: java.lang.String = js.native
  var macKey: java.lang.String = js.native
}

object RTCOAuthCredential {
  @scala.inline
  def apply(accessToken: java.lang.String, macKey: java.lang.String): RTCOAuthCredential = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], macKey = macKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCOAuthCredential]
  }
  @scala.inline
  implicit class RTCOAuthCredentialOps[Self <: RTCOAuthCredential] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessToken(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMacKey(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("macKey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

