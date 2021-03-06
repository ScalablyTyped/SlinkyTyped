package typingsSlinky.wechatMiniprogram.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Latitude extends StObject {
  
  /** 纬度，最低基础库 2.9.0 */
  var latitude: Double = js.native
  
  /** 经度，最低基础库 2.9.0 */
  var longitude: Double = js.native
}
object Latitude {
  
  @scala.inline
  def apply(latitude: Double, longitude: Double): Latitude = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[Latitude]
  }
  
  @scala.inline
  implicit class LatitudeMutableBuilder[Self <: Latitude] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
  }
}
