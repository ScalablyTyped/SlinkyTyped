package typingsSlinky.winrtUwp.Windows.Devices.Geolocation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Unsupported API. */
@js.native
trait CivicAddress extends StObject {
  
  /** Unsupported API. */
  var city: String = js.native
  
  /** Unsupported API. */
  var country: String = js.native
  
  /** Unsupported API. */
  var postalCode: String = js.native
  
  /** Unsupported API. */
  var state: String = js.native
  
  /** Unsupported API. */
  var timestamp: js.Date = js.native
}
object CivicAddress {
  
  @scala.inline
  def apply(city: String, country: String, postalCode: String, state: String, timestamp: js.Date): CivicAddress = {
    val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[CivicAddress]
  }
  
  @scala.inline
  implicit class CivicAddressMutableBuilder[Self <: CivicAddress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
