package typingsSlinky.vis.visMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineWindow extends js.Object {
  var end: js.Date
  var start: js.Date
}

object TimelineWindow {
  @scala.inline
  def apply(end: js.Date, start: js.Date): TimelineWindow = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TimelineWindow]
  }
}

