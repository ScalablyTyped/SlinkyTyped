package typingsSlinky.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "TimeRange")
@js.native
class TimeRange () extends js.Object {
  
  /**
    * A datetime value in RFC 3339 format indicating when the time range ends.
    */
  var end_at: js.UndefOr[String] = js.native
  
  /**
    * A datetime value in RFC 3339 format indicating when the time range starts.
    */
  var start_at: js.UndefOr[String] = js.native
}
