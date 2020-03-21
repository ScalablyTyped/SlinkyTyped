package typingsSlinky.xrm.Xrm.Attributes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Integer attribute formats for Attributes.Attribute.getFormat(), used by {@link Attributes.NumberAttribute NumberAttribute}.
  * @see {@link XrmEnum.IntegerAttributeFormat}
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.xrm.xrmStrings.duration
  - typingsSlinky.xrm.xrmStrings.none
*/
trait IntegerAttributeFormat extends js.Object

object IntegerAttributeFormat {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def duration: typingsSlinky.xrm.xrmStrings.duration = this.cast("duration")
  @scala.inline
  def none: typingsSlinky.xrm.xrmStrings.none = this.cast("none")
}

