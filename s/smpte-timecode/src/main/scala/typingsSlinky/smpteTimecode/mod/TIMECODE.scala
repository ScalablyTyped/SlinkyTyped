package typingsSlinky.smpteTimecode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - java.lang.String
  - typingsSlinky.std.Date
  - typingsSlinky.smpteTimecode.mod.TimecodeObject
*/
trait TIMECODE extends js.Object

object TIMECODE {
  @scala.inline
  implicit def apply(value: js.Date): TIMECODE = value.asInstanceOf[TIMECODE]
  @scala.inline
  implicit def apply(value: Double): TIMECODE = value.asInstanceOf[TIMECODE]
  @scala.inline
  implicit def apply(value: String): TIMECODE = value.asInstanceOf[TIMECODE]
  @scala.inline
  implicit def apply(value: TimecodeObject): TIMECODE = value.asInstanceOf[TIMECODE]
}

