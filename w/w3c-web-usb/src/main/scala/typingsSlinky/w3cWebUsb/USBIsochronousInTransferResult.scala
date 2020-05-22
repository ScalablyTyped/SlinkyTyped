package typingsSlinky.w3cWebUsb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait USBIsochronousInTransferResult extends js.Object {
  val data: js.UndefOr[js.typedarray.DataView] = js.undefined
  val packets: js.Array[USBIsochronousInTransferPacket]
}

object USBIsochronousInTransferResult {
  @scala.inline
  def apply(packets: js.Array[USBIsochronousInTransferPacket], data: js.typedarray.DataView = null): USBIsochronousInTransferResult = {
    val __obj = js.Dynamic.literal(packets = packets.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[USBIsochronousInTransferResult]
  }
}

