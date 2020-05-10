package typingsSlinky.trtcJsSdk.mod

import typingsSlinky.std.RTCIceCredentialType
import typingsSlinky.std.RTCOAuthCredential
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent trtc-js-sdk.trtc-js-sdk.Omit<std.RTCIceServer, 'urls'> */
@js.native
trait TurnServerConfig extends js.Object {
  var credential: js.UndefOr[String | RTCOAuthCredential] = js.native
  var credentialType: js.UndefOr[RTCIceCredentialType] = js.native
  /** TURN 服务器 url */
  var url: String = js.native
  var username: js.UndefOr[String] = js.native
}

object TurnServerConfig {
  @scala.inline
  def apply(url: String): TurnServerConfig = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TurnServerConfig]
  }
  @scala.inline
  implicit class TurnServerConfigOps[Self <: TurnServerConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCredential(value: String | RTCOAuthCredential): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credential")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCredential: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credential")(js.undefined)
        ret
    }
    @scala.inline
    def withCredentialType(value: RTCIceCredentialType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentialType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCredentialType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentialType")(js.undefined)
        ret
    }
    @scala.inline
    def withUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsername: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(js.undefined)
        ret
    }
  }
  
}

