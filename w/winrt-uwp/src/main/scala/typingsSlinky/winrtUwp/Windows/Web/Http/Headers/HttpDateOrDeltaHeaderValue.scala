package typingsSlinky.winrtUwp.Windows.Web.Http.Headers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the value of the Retry-After HTTP header on an HTTP response. */
@js.native
trait HttpDateOrDeltaHeaderValue extends StObject {
  
  /** Gets the value of the HTTP-date information used in the Retry-After HTTP header. */
  var date: js.Date = js.native
  
  /** Gets the value of the delta-seconds information used in the Retry-After HTTP header. */
  var delta: Double = js.native
}
object HttpDateOrDeltaHeaderValue {
  
  @scala.inline
  def apply(date: js.Date, delta: Double): HttpDateOrDeltaHeaderValue = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], delta = delta.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpDateOrDeltaHeaderValue]
  }
  
  @scala.inline
  implicit class HttpDateOrDeltaHeaderValueMutableBuilder[Self <: HttpDateOrDeltaHeaderValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelta(value: Double): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
  }
}
