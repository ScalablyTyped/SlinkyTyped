package typingsSlinky.voximplantWebsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	*	Network information
	*/
@js.native
trait NetworkInfo extends js.Object {
  /**
  		*	Packet loss percentage
  		*/
  var packetLoss: Double = js.native
}

object NetworkInfo {
  @scala.inline
  def apply(packetLoss: Double): NetworkInfo = {
    val __obj = js.Dynamic.literal(packetLoss = packetLoss.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkInfo]
  }
  @scala.inline
  implicit class NetworkInfoOps[Self <: NetworkInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPacketLoss(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packetLoss")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

