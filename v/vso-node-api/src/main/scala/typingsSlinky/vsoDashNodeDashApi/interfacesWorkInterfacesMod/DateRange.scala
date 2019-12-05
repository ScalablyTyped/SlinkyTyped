package typingsSlinky.vsoDashNodeDashApi.interfacesWorkInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateRange extends js.Object {
  /**
    * End of the date range.
    */
  var end: js.Date
  /**
    * Start of the date range.
    */
  var start: js.Date
}

object DateRange {
  @scala.inline
  def apply(end: js.Date, start: js.Date): DateRange = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DateRange]
  }
}

