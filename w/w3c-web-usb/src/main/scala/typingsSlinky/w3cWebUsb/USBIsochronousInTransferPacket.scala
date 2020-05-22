package typingsSlinky.w3cWebUsb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait USBIsochronousInTransferPacket extends js.Object {
  val data: js.UndefOr[js.typedarray.DataView] = js.undefined
  val status: js.UndefOr[USBTransferStatus] = js.undefined
}

object USBIsochronousInTransferPacket {
  @scala.inline
  def apply(data: js.typedarray.DataView = null, status: USBTransferStatus = null): USBIsochronousInTransferPacket = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[USBIsochronousInTransferPacket]
  }
}

