package typingsSlinky.steamClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CMsgClientLogonResponse extends js.Object {
  /**
    * The logon was successful if equal to EResult.OK
    */
  var eresult: EResult = js.native
  /**
    * "loginkey" to be used with WebAPI's AuthenticateUser."
    */
  var webapi_authenticate_user_nonce: String = js.native
}

object CMsgClientLogonResponse {
  @scala.inline
  def apply(eresult: EResult, webapi_authenticate_user_nonce: String): CMsgClientLogonResponse = {
    val __obj = js.Dynamic.literal(eresult = eresult.asInstanceOf[js.Any], webapi_authenticate_user_nonce = webapi_authenticate_user_nonce.asInstanceOf[js.Any])
    __obj.asInstanceOf[CMsgClientLogonResponse]
  }
  @scala.inline
  implicit class CMsgClientLogonResponseOps[Self <: CMsgClientLogonResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEresult(value: EResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eresult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebapi_authenticate_user_nonce(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webapi_authenticate_user_nonce")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

