package typingsSlinky.xrm.Xrm.Attributes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * String attribute formats for Attributes.Attribute.getFormat(), used by {@link Attributes.StringAttribute StringAttribute}.
  * @see {@link XrmEnum.StringAttributeFormat}
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.xrm.xrmStrings.email
  - typingsSlinky.xrm.xrmStrings.phone
  - typingsSlinky.xrm.xrmStrings.text
  - typingsSlinky.xrm.xrmStrings.textarea
  - typingsSlinky.xrm.xrmStrings.tickersymbol
  - typingsSlinky.xrm.xrmStrings.url
*/
trait StringAttributeFormat extends js.Object

object StringAttributeFormat {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def email: typingsSlinky.xrm.xrmStrings.email = this.cast("email")
  @scala.inline
  def phone: typingsSlinky.xrm.xrmStrings.phone = this.cast("phone")
  @scala.inline
  def text: typingsSlinky.xrm.xrmStrings.text = this.cast("text")
  @scala.inline
  def textarea: typingsSlinky.xrm.xrmStrings.textarea = this.cast("textarea")
  @scala.inline
  def tickersymbol: typingsSlinky.xrm.xrmStrings.tickersymbol = this.cast("tickersymbol")
  @scala.inline
  def url: typingsSlinky.xrm.xrmStrings.url = this.cast("url")
}

