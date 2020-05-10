package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCIdentityProviderOptions extends js.Object {
  var peerIdentity: js.UndefOr[java.lang.String] = js.native
  var protocol: js.UndefOr[java.lang.String] = js.native
  var usernameHint: js.UndefOr[java.lang.String] = js.native
}

object RTCIdentityProviderOptions {
  @scala.inline
  def apply(): RTCIdentityProviderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCIdentityProviderOptions]
  }
  @scala.inline
  implicit class RTCIdentityProviderOptionsOps[Self <: RTCIdentityProviderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPeerIdentity(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peerIdentity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeerIdentity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peerIdentity")(js.undefined)
        ret
    }
    @scala.inline
    def withProtocol(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(js.undefined)
        ret
    }
    @scala.inline
    def withUsernameHint(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usernameHint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsernameHint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usernameHint")(js.undefined)
        ret
    }
  }
  
}

