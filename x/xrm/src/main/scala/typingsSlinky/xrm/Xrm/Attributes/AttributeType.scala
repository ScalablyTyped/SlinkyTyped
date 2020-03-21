package typingsSlinky.xrm.Xrm.Attributes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Attribute types for {@link Attributes.Attribute.setDisplayState()}.
  * @see {@link XrmEnum.AttributeType}
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.xrm.xrmStrings.boolean
  - typingsSlinky.xrm.xrmStrings.datetime
  - typingsSlinky.xrm.xrmStrings.decimal
  - typingsSlinky.xrm.xrmStrings.double
  - typingsSlinky.xrm.xrmStrings.integer
  - typingsSlinky.xrm.xrmStrings.lookup
  - typingsSlinky.xrm.xrmStrings.memo
  - typingsSlinky.xrm.xrmStrings.money
  - typingsSlinky.xrm.xrmStrings.multioptionset
  - typingsSlinky.xrm.xrmStrings.optionset
  - typingsSlinky.xrm.xrmStrings.string
*/
trait AttributeType extends js.Object

object AttributeType {
  @scala.inline
  def boolean: typingsSlinky.xrm.xrmStrings.boolean = this.cast("boolean")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def datetime: typingsSlinky.xrm.xrmStrings.datetime = this.cast("datetime")
  @scala.inline
  def decimal: typingsSlinky.xrm.xrmStrings.decimal = this.cast("decimal")
  @scala.inline
  def double: typingsSlinky.xrm.xrmStrings.double = this.cast("double")
  @scala.inline
  def integer: typingsSlinky.xrm.xrmStrings.integer = this.cast("integer")
  @scala.inline
  def lookup: typingsSlinky.xrm.xrmStrings.lookup = this.cast("lookup")
  @scala.inline
  def memo: typingsSlinky.xrm.xrmStrings.memo = this.cast("memo")
  @scala.inline
  def money: typingsSlinky.xrm.xrmStrings.money = this.cast("money")
  @scala.inline
  def multioptionset: typingsSlinky.xrm.xrmStrings.multioptionset = this.cast("multioptionset")
  @scala.inline
  def optionset: typingsSlinky.xrm.xrmStrings.optionset = this.cast("optionset")
  @scala.inline
  def string: typingsSlinky.xrm.xrmStrings.string = this.cast("string")
}

