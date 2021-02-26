package typingsSlinky.winrtUwp.Windows.Devices.Geolocation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a location that may contain latitude and longitude data or venue data. */
@js.native
trait Geoposition extends StObject {
  
  /** Unsupported API. */
  var civicAddress: CivicAddress = js.native
  
  /** The latitude and longitude associated with a geographic location. */
  var coordinate: Geocoordinate = js.native
  
  /** Represents the venue associated with a geographic location. */
  var venueData: VenueData = js.native
}
object Geoposition {
  
  @scala.inline
  def apply(civicAddress: CivicAddress, coordinate: Geocoordinate, venueData: VenueData): Geoposition = {
    val __obj = js.Dynamic.literal(civicAddress = civicAddress.asInstanceOf[js.Any], coordinate = coordinate.asInstanceOf[js.Any], venueData = venueData.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geoposition]
  }
  
  @scala.inline
  implicit class GeopositionMutableBuilder[Self <: Geoposition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCivicAddress(value: CivicAddress): Self = StObject.set(x, "civicAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoordinate(value: Geocoordinate): Self = StObject.set(x, "coordinate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVenueData(value: VenueData): Self = StObject.set(x, "venueData", value.asInstanceOf[js.Any])
  }
}
