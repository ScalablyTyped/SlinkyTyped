package typingsSlinky.winrtUwp.Windows.Devices.Geolocation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The basic information to describe a geographic position. */
@js.native
trait BasicGeoposition extends StObject {
  
  /** The altitude of the geographic position in meters. */
  var altitude: Double = js.native
  
  /** The latitude of the geographic position. The valid range of latitude values is from -90.0 to 90.0 degrees. */
  var latitude: Double = js.native
  
  /** The longitude of the geographic position. This can be any value. For values less than or equal to-180.0 or values greater than 180.0, the value may be wrapped and stored appropriately before it is used. For example, a longitude of 183.0 degrees would become -177.0 degrees. */
  var longitude: Double = js.native
}
object BasicGeoposition {
  
  @scala.inline
  def apply(altitude: Double, latitude: Double, longitude: Double): BasicGeoposition = {
    val __obj = js.Dynamic.literal(altitude = altitude.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasicGeoposition]
  }
  
  @scala.inline
  implicit class BasicGeopositionMutableBuilder[Self <: BasicGeoposition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAltitude(value: Double): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
  }
}
