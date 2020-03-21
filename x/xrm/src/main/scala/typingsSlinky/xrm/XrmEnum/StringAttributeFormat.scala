package typingsSlinky.xrm.XrmEnum

import typingsSlinky.xrm.xrmStrings.email
import typingsSlinky.xrm.xrmStrings.phone
import typingsSlinky.xrm.xrmStrings.text
import typingsSlinky.xrm.xrmStrings.textarea
import typingsSlinky.xrm.xrmStrings.tickersymbol
import typingsSlinky.xrm.xrmStrings.url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Constant Enum: String attribute formats for Attributes.Attribute.getFormat(), used by {@link Attributes.StringAttribute StringAttribute}.
  * @see {@link Xrm.Attributes.StringAttributeFormat}
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
  def Email: email = this.cast("email")
  @scala.inline
  def Phone: phone = this.cast("phone")
  @scala.inline
  def Text: text = this.cast("text")
  @scala.inline
  def TextArea: textarea = this.cast("textarea")
  @scala.inline
  def TickerSymbol: tickersymbol = this.cast("tickersymbol")
  @scala.inline
  def URL: url = this.cast("url")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

