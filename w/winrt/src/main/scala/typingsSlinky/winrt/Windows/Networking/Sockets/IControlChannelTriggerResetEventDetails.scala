package typingsSlinky.winrt.Windows.Networking.Sockets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IControlChannelTriggerResetEventDetails extends js.Object {
  var hardwareSlotReset: Boolean = js.native
  var resetReason: ControlChannelTriggerResetReason = js.native
  var softwareSlotReset: Boolean = js.native
}

object IControlChannelTriggerResetEventDetails {
  @scala.inline
  def apply(
    hardwareSlotReset: Boolean,
    resetReason: ControlChannelTriggerResetReason,
    softwareSlotReset: Boolean
  ): IControlChannelTriggerResetEventDetails = {
    val __obj = js.Dynamic.literal(hardwareSlotReset = hardwareSlotReset.asInstanceOf[js.Any], resetReason = resetReason.asInstanceOf[js.Any], softwareSlotReset = softwareSlotReset.asInstanceOf[js.Any])
    __obj.asInstanceOf[IControlChannelTriggerResetEventDetails]
  }
  @scala.inline
  implicit class IControlChannelTriggerResetEventDetailsOps[Self <: IControlChannelTriggerResetEventDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHardwareSlotReset(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hardwareSlotReset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResetReason(value: ControlChannelTriggerResetReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSoftwareSlotReset(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("softwareSlotReset")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

