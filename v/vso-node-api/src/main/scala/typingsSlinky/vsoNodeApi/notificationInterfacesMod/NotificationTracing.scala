package typingsSlinky.vsoNodeApi.notificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationTracing extends NotificationTracingSetParameters {
  /**
    * Trace until the specified end date.
    */
  var endDate: js.Date
  /**
    * The maximum number of result details to trace.
    */
  var maxTracedEntries: Double
  /**
    * The date and time tracing started.
    */
  var startDate: js.Date
  /**
    * Trace until remaining count reaches 0.
    */
  var tracedEntries: Double
}

object NotificationTracing {
  @scala.inline
  def apply(
    enabled: Boolean,
    endDate: js.Date,
    maxTracedEntries: Double,
    startDate: js.Date,
    tracedEntries: Double
  ): NotificationTracing = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], endDate = endDate.asInstanceOf[js.Any], maxTracedEntries = maxTracedEntries.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any], tracedEntries = tracedEntries.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NotificationTracing]
  }
}

