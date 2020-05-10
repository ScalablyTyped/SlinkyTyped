package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCIceGatherOptions extends js.Object {
  var gatherPolicy: js.UndefOr[RTCIceGatherPolicy] = js.native
  var iceservers: js.UndefOr[js.Array[org.scalajs.dom.experimental.webrtc.RTCIceServer]] = js.native
}

object RTCIceGatherOptions {
  @scala.inline
  def apply(): RTCIceGatherOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCIceGatherOptions]
  }
  @scala.inline
  implicit class RTCIceGatherOptionsOps[Self <: RTCIceGatherOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGatherPolicy(value: RTCIceGatherPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gatherPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGatherPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gatherPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withIceservers(value: js.Array[org.scalajs.dom.experimental.webrtc.RTCIceServer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iceservers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIceservers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iceservers")(js.undefined)
        ret
    }
  }
  
}

