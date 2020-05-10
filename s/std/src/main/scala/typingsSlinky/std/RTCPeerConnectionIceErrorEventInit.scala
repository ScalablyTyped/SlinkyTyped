package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCPeerConnectionIceErrorEventInit extends EventInit {
  var errorCode: Double = js.native
  var hostCandidate: js.UndefOr[java.lang.String] = js.native
  var statusText: js.UndefOr[java.lang.String] = js.native
  var url: js.UndefOr[java.lang.String] = js.native
}

object RTCPeerConnectionIceErrorEventInit {
  @scala.inline
  def apply(errorCode: Double): RTCPeerConnectionIceErrorEventInit = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCPeerConnectionIceErrorEventInit]
  }
  @scala.inline
  implicit class RTCPeerConnectionIceErrorEventInitOps[Self <: RTCPeerConnectionIceErrorEventInit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHostCandidate(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostCandidate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostCandidate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostCandidate")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusText(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusText")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

