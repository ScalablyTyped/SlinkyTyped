package typingsSlinky.webrtc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://www.w3.org/TR/webrtc/#idl-def-rtcdatachannelinit
@js.native
trait RTCDataChannelInit extends js.Object {
   // default = false
  var id: js.UndefOr[Double] = js.native
   // default = true
  var maxPacketLifeTime: js.UndefOr[Double] = js.native
  var maxRetransmits: js.UndefOr[Double] = js.native
   // default = ''
  var negotiated: js.UndefOr[Boolean] = js.native
  var ordered: js.UndefOr[Boolean] = js.native
  var protocol: js.UndefOr[String] = js.native
}

object RTCDataChannelInit {
  @scala.inline
  def apply(): RTCDataChannelInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCDataChannelInit]
  }
  @scala.inline
  implicit class RTCDataChannelInitOps[Self <: RTCDataChannelInit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxPacketLifeTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPacketLifeTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxPacketLifeTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPacketLifeTime")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxRetransmits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRetransmits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRetransmits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRetransmits")(js.undefined)
        ret
    }
    @scala.inline
    def withNegotiated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negotiated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNegotiated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negotiated")(js.undefined)
        ret
    }
    @scala.inline
    def withOrdered(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ordered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrdered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ordered")(js.undefined)
        ret
    }
    @scala.inline
    def withProtocol(value: String): Self = {
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
  }
  
}

