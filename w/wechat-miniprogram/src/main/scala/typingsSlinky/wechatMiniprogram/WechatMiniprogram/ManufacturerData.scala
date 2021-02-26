package typingsSlinky.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 广播的制造商信息, 仅安卓支持 */
@js.native
trait ManufacturerData extends StObject {
  
  /** 制造商ID，0x 开头的十六进制 */
  var manufacturerId: String = js.native
  
  /** 制造商信息 */
  var manufacturerSpecificData: js.UndefOr[js.typedarray.ArrayBuffer] = js.native
}
object ManufacturerData {
  
  @scala.inline
  def apply(manufacturerId: String): ManufacturerData = {
    val __obj = js.Dynamic.literal(manufacturerId = manufacturerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManufacturerData]
  }
  
  @scala.inline
  implicit class ManufacturerDataMutableBuilder[Self <: ManufacturerData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setManufacturerId(value: String): Self = StObject.set(x, "manufacturerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManufacturerSpecificData(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "manufacturerSpecificData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManufacturerSpecificDataUndefined: Self = StObject.set(x, "manufacturerSpecificData", js.undefined)
  }
}
