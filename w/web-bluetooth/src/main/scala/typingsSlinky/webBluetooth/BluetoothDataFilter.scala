package typingsSlinky.webBluetooth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BluetoothDataFilter extends StObject {
  
  val dataPrefix: js.typedarray.DataView = js.native
  
  val mask: js.typedarray.DataView = js.native
}
object BluetoothDataFilter {
  
  @scala.inline
  def apply(dataPrefix: js.typedarray.DataView, mask: js.typedarray.DataView): BluetoothDataFilter = {
    val __obj = js.Dynamic.literal(dataPrefix = dataPrefix.asInstanceOf[js.Any], mask = mask.asInstanceOf[js.Any])
    __obj.asInstanceOf[BluetoothDataFilter]
  }
  
  @scala.inline
  implicit class BluetoothDataFilterMutableBuilder[Self <: BluetoothDataFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataPrefix(value: js.typedarray.DataView): Self = StObject.set(x, "dataPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMask(value: js.typedarray.DataView): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
  }
}
