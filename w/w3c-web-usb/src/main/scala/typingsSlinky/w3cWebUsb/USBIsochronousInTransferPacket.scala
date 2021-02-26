package typingsSlinky.w3cWebUsb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait USBIsochronousInTransferPacket extends StObject {
  
  val data: js.UndefOr[js.typedarray.DataView] = js.native
  
  val status: js.UndefOr[USBTransferStatus] = js.native
}
object USBIsochronousInTransferPacket {
  
  @scala.inline
  def apply(): USBIsochronousInTransferPacket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[USBIsochronousInTransferPacket]
  }
  
  @scala.inline
  implicit class USBIsochronousInTransferPacketMutableBuilder[Self <: USBIsochronousInTransferPacket] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.typedarray.DataView): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setStatus(value: USBTransferStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
