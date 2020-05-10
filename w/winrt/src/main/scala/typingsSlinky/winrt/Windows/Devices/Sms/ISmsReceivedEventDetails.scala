package typingsSlinky.winrt.Windows.Devices.Sms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISmsReceivedEventDetails extends js.Object {
  var deviceId: String = js.native
  var messageIndex: Double = js.native
}

object ISmsReceivedEventDetails {
  @scala.inline
  def apply(deviceId: String, messageIndex: Double): ISmsReceivedEventDetails = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any], messageIndex = messageIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISmsReceivedEventDetails]
  }
  @scala.inline
  implicit class ISmsReceivedEventDetailsOps[Self <: ISmsReceivedEventDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeviceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessageIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageIndex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

