package typingsSlinky.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 指定 marker 移动到的目标点 */
@js.native
trait DestinationOption extends StObject {
  
  /** 纬度 */
  var latitude: Double = js.native
  
  /** 经度 */
  var longitude: Double = js.native
}
object DestinationOption {
  
  @scala.inline
  def apply(latitude: Double, longitude: Double): DestinationOption = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[DestinationOption]
  }
  
  @scala.inline
  implicit class DestinationOptionMutableBuilder[Self <: DestinationOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
  }
}
