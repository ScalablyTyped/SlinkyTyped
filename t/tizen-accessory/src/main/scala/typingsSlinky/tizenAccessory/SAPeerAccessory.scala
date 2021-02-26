package typingsSlinky.tizenAccessory

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SAPeerAccessory extends StObject {
  
  val accessoryId: String = js.native
  
  val deviceAddress: String = js.native
  
  val deviceName: String = js.native
  
  val productId: String = js.native
  
  val transportType: String = js.native
  
  val vendorId: String = js.native
}
object SAPeerAccessory {
  
  @scala.inline
  def apply(
    accessoryId: String,
    deviceAddress: String,
    deviceName: String,
    productId: String,
    transportType: String,
    vendorId: String
  ): SAPeerAccessory = {
    val __obj = js.Dynamic.literal(accessoryId = accessoryId.asInstanceOf[js.Any], deviceAddress = deviceAddress.asInstanceOf[js.Any], deviceName = deviceName.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any], transportType = transportType.asInstanceOf[js.Any], vendorId = vendorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SAPeerAccessory]
  }
  
  @scala.inline
  implicit class SAPeerAccessoryMutableBuilder[Self <: SAPeerAccessory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessoryId(value: String): Self = StObject.set(x, "accessoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceAddress(value: String): Self = StObject.set(x, "deviceAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceName(value: String): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransportType(value: String): Self = StObject.set(x, "transportType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVendorId(value: String): Self = StObject.set(x, "vendorId", value.asInstanceOf[js.Any])
  }
}
