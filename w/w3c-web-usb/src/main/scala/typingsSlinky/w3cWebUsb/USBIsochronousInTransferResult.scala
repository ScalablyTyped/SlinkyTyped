package typingsSlinky.w3cWebUsb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait USBIsochronousInTransferResult extends StObject {
  
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
  implicit class USBIsochronousInTransferResultMutableBuilder[Self <: USBIsochronousInTransferResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.typedarray.DataView): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setPackets(value: js.Array[USBIsochronousInTransferPacket]): Self = StObject.set(x, "packets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPacketsVarargs(value: USBIsochronousInTransferPacket*): Self = StObject.set(x, "packets", js.Array(value :_*))
  }
}
