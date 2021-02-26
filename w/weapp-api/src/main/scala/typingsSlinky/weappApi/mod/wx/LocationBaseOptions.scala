package typingsSlinky.weappApi.mod.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 媒体
//  地图
@js.native
trait LocationBaseOptions extends StObject {
  
  //  纬度，浮点数，范围为-90~90，负数表示南纬
  var latitude: Double = js.native
  
  //  经度，浮点数，范围为-180~180，负数表示西经
  var longitude: Double = js.native
}
object LocationBaseOptions {
  
  @scala.inline
  def apply(latitude: Double, longitude: Double): LocationBaseOptions = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationBaseOptions]
  }
  
  @scala.inline
  implicit class LocationBaseOptionsMutableBuilder[Self <: LocationBaseOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
  }
}
