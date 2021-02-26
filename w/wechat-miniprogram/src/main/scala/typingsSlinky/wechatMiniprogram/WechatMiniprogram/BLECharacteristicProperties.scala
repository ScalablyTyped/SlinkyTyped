package typingsSlinky.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 该特征值支持的操作类型 */
@js.native
trait BLECharacteristicProperties extends StObject {
  
  /** 该特征值是否支持 indicate 操作 */
  var indicate: Boolean = js.native
  
  /** 该特征值是否支持 notify 操作 */
  @JSName("notify")
  var notify_FBLECharacteristicProperties: Boolean = js.native
  
  /** 该特征值是否支持 read 操作 */
  var read: Boolean = js.native
  
  /** 该特征值是否支持 write 操作 */
  var write: Boolean = js.native
}
object BLECharacteristicProperties {
  
  @scala.inline
  def apply(indicate: Boolean, notify_ : Boolean, read: Boolean, write: Boolean): BLECharacteristicProperties = {
    val __obj = js.Dynamic.literal(indicate = indicate.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any], write = write.asInstanceOf[js.Any])
    __obj.updateDynamic("notify")(notify_.asInstanceOf[js.Any])
    __obj.asInstanceOf[BLECharacteristicProperties]
  }
  
  @scala.inline
  implicit class BLECharacteristicPropertiesMutableBuilder[Self <: BLECharacteristicProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndicate(value: Boolean): Self = StObject.set(x, "indicate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotify_(value: Boolean): Self = StObject.set(x, "notify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRead(value: Boolean): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrite(value: Boolean): Self = StObject.set(x, "write", value.asInstanceOf[js.Any])
  }
}
