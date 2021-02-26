package typingsSlinky.titanium.Titanium

import typingsSlinky.titanium.HeadingData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when an heading update is received.
  */
@js.native
trait GeolocationHeadingEvent extends GeolocationBaseEvent {
  
  /**
    * If `success` is `false`, the error code is available.
    */
  var code: Double = js.native
  
  /**
    * If `success` is false, a string describing the error.
    */
  var error: String = js.native
  
  /**
    * Dictionary object containing the heading data.
    */
  var heading: HeadingData = js.native
  
  /**
    * Indicate if the heading event was successfully received. Android returns this since SDK 7.5.0.
    */
  var success: Boolean = js.native
}
object GeolocationHeadingEvent {
  
  @scala.inline
  def apply(code: Double, error: String, heading: HeadingData, source: Geolocation, success: Boolean): GeolocationHeadingEvent = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], heading = heading.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeolocationHeadingEvent]
  }
  
  @scala.inline
  implicit class GeolocationHeadingEventMutableBuilder[Self <: GeolocationHeadingEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeading(value: HeadingData): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
