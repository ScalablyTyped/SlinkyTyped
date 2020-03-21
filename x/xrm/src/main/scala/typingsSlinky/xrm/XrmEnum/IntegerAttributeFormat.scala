package typingsSlinky.xrm.XrmEnum

import typingsSlinky.xrm.xrmStrings.duration
import typingsSlinky.xrm.xrmStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Constant Enum: Integer attribute formats for Attributes.Attribute.getFormat(), used by {@link Attributes.NumberAttribute NumberAttribute}.
  * @see {@link Xrm.Attributes.IntegerAttributeFormat}
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.xrm.xrmStrings.duration
  - typingsSlinky.xrm.xrmStrings.none
*/
trait IntegerAttributeFormat extends js.Object

object IntegerAttributeFormat {
  @scala.inline
  def Duration: duration = this.cast("duration")
  @scala.inline
  def None: none = this.cast("none")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

