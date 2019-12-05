package typingsSlinky.xrm.Xrm.Attributes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Attribute formats for {@link Attributes.Attribute.getFormat Attributes.Attribute.getFormat()}.
  * @see {@link XrmEnum.DateAttributeFormat}
  * @see {@link XrmEnum.IntegerAttributeFormat}
  * @see {@link XrmEnum.OptionSetAttributeFormat}
  * @see {@link XrmEnum.StringAttributeFormat}
  */
/* Rewritten from type alias, can be one of: 
  - typings.xrm.xrmStrings.date
  - typings.xrm.xrmStrings.datetime
  - typings.xrm.xrmStrings.duration
  - typings.xrm.xrmStrings.none
  - typings.xrm.xrmStrings.language
  - typings.xrm.xrmStrings.timezone
  - typings.xrm.xrmStrings.email
  - typings.xrm.xrmStrings.phone
  - typings.xrm.xrmStrings.text
  - typings.xrm.xrmStrings.textarea
  - typings.xrm.xrmStrings.tickersymbol
  - typings.xrm.xrmStrings.url
*/
trait AttributeFormat extends js.Object

object AttributeFormat {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def date: typingsSlinky.xrm.xrmStrings.date = this.cast("date")
  @scala.inline
  def datetime: typingsSlinky.xrm.xrmStrings.datetime = this.cast("datetime")
  @scala.inline
  def duration: typingsSlinky.xrm.xrmStrings.duration = this.cast("duration")
  @scala.inline
  def email: typingsSlinky.xrm.xrmStrings.email = this.cast("email")
  @scala.inline
  def language: typingsSlinky.xrm.xrmStrings.language = this.cast("language")
  @scala.inline
  def none: typingsSlinky.xrm.xrmStrings.none = this.cast("none")
  @scala.inline
  def phone: typingsSlinky.xrm.xrmStrings.phone = this.cast("phone")
  @scala.inline
  def text: typingsSlinky.xrm.xrmStrings.text = this.cast("text")
  @scala.inline
  def textarea: typingsSlinky.xrm.xrmStrings.textarea = this.cast("textarea")
  @scala.inline
  def tickersymbol: typingsSlinky.xrm.xrmStrings.tickersymbol = this.cast("tickersymbol")
  @scala.inline
  def timezone: typingsSlinky.xrm.xrmStrings.timezone = this.cast("timezone")
  @scala.inline
  def url: typingsSlinky.xrm.xrmStrings.url = this.cast("url")
}

