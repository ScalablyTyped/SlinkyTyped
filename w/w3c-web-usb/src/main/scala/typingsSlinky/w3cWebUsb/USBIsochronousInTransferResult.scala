package typingsSlinky.w3cWebUsb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait USBIsochronousInTransferResult extends js.Object {
  val data: js.UndefOr[js.typedarray.DataView] = js.native
  val packets: js.Array[USBIsochronousInTransferPacket] = js.native
}

object USBIsochronousInTransferResult {
  @scala.inline
  def apply(packets: js.Array[USBIsochronousInTransferPacket]): USBIsochronousInTransferResult = {
    val __obj = js.Dynamic.literal(packets = packets.asInstanceOf[js.Any])
    __obj.asInstanceOf[USBIsochronousInTransferResult]
  }
  @scala.inline
  implicit class USBIsochronousInTransferResultOps[Self <: USBIsochronousInTransferResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPackets(value: js.Array[USBIsochronousInTransferPacket]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: js.typedarray.DataView): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
  }
  
}

