package typingsSlinky.winrtUwp.Windows.Web.Http.Headers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the value of the Retry-After HTTP header on an HTTP response. */
@js.native
trait HttpDateOrDeltaHeaderValue extends js.Object {
  
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
  implicit class HttpDateOrDeltaHeaderValueOps[Self <: HttpDateOrDeltaHeaderValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDate(value: js.Date): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelta(value: Double): Self = this.set("delta", value.asInstanceOf[js.Any])
  }
}
