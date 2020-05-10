package typingsSlinky.webrtc

import typingsSlinky.std.RTCIceCredentialType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://www.w3.org/TR/webrtc/#idl-def-rtciceserver
@js.native
trait RTCIceServer extends js.Object {
  //urls: string | string[];
  var credentialType: js.UndefOr[RTCIceCredentialType] = js.native
}

object RTCIceServer {
  @scala.inline
  def apply(): RTCIceServer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCIceServer]
  }
  @scala.inline
  implicit class RTCIceServerOps[Self <: RTCIceServer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
  }
  
}

