package typingsSlinky.weixinApp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CharacteristicId extends StObject {
  
  /**
    * 蓝牙设备特征值的 uuid
    */
  var characteristicId: String = js.native
  
  /**
    * 蓝牙设备特征值对应服务的 uuid
    */
  var serviceId: String = js.native
  
  /**
    * 蓝牙设备特征值对应的二进制值
    */
  var value: js.typedarray.ArrayBuffer = js.native
}
object CharacteristicId {
  
  @scala.inline
  def apply(characteristicId: String, serviceId: String, value: js.typedarray.ArrayBuffer): CharacteristicId = {
    val __obj = js.Dynamic.literal(characteristicId = characteristicId.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CharacteristicId]
  }
  
  @scala.inline
  implicit class CharacteristicIdMutableBuilder[Self <: CharacteristicId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCharacteristicId(value: String): Self = StObject.set(x, "characteristicId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceId(value: String): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
