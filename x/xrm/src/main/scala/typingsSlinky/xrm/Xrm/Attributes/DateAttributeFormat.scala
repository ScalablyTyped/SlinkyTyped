package typingsSlinky.xrm.Xrm.Attributes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Date attribute formats for Attributes.Attribute.getFormat(), used by {@link Attributes.DateAttribute DateAttribute}.
  * @see {@link XrmEnum.DateAttributeFormat}
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.xrm.xrmStrings.date
  - typingsSlinky.xrm.xrmStrings.datetime
*/
trait DateAttributeFormat extends js.Object

object DateAttributeFormat {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def date: typingsSlinky.xrm.xrmStrings.date = this.cast("date")
  @scala.inline
  def datetime: typingsSlinky.xrm.xrmStrings.datetime = this.cast("datetime")
}

