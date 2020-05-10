package typingsSlinky.winrtUwp

import typingsSlinky.winrtUwp.Windows.Devices.Enumeration.DeviceInformation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonItemsDeviceInformation extends js.Object {
  /** The array of DeviceInformation objects starting at the index specified by startIndex. */ var items: DeviceInformation = js.native
  /** The number of DeviceInformation objects returned. */ var returnValue: Double = js.native
}

object AnonItemsDeviceInformation {
  @scala.inline
  def apply(items: DeviceInformation, returnValue: Double): AnonItemsDeviceInformation = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItemsDeviceInformation]
  }
  @scala.inline
  implicit class AnonItemsDeviceInformationOps[Self <: AnonItemsDeviceInformation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: DeviceInformation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReturnValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnValue")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

