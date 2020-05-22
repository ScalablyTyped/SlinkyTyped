package typingsSlinky.winrtUwp.Windows.Web.Http.Headers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the value of the Retry-After HTTP header on an HTTP response. */
trait HttpDateOrDeltaHeaderValue extends js.Object {
  /** Gets the value of the HTTP-date information used in the Retry-After HTTP header. */
  var date: js.Date
  /** Gets the value of the delta-seconds information used in the Retry-After HTTP header. */
  var delta: Double
}

object HttpDateOrDeltaHeaderValue {
  @scala.inline
  def apply(date: js.Date, delta: Double): HttpDateOrDeltaHeaderValue = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], delta = delta.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpDateOrDeltaHeaderValue]
  }
}

