package typingsSlinky.w3cWebUsb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("USBIsochronousInTransferPacket")
@js.native
class USBIsochronousInTransferPacket protected () extends js.Object {
  def this(status: USBTransferStatus) = this()
  def this(status: USBTransferStatus, data: js.typedarray.DataView) = this()
  val data: js.UndefOr[js.typedarray.DataView] = js.native
  val status: js.UndefOr[USBTransferStatus] = js.native
}

