package typingsSlinky.wpapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.wpapi.wpapiStrings.string
  - typingsSlinky.wpapi.wpapiStrings.integer
  - typingsSlinky.wpapi.wpapiStrings.number
  - typingsSlinky.wpapi.wpapiStrings.boolean
  - typingsSlinky.wpapi.wpapiStrings.`object`
  - typingsSlinky.wpapi.wpapiStrings.array
*/
trait HTTPArgumentType extends js.Object

object HTTPArgumentType {
  @scala.inline
  def array: typingsSlinky.wpapi.wpapiStrings.array = this.cast("array")
  @scala.inline
  def boolean: typingsSlinky.wpapi.wpapiStrings.boolean = this.cast("boolean")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def integer: typingsSlinky.wpapi.wpapiStrings.integer = this.cast("integer")
  @scala.inline
  def number: typingsSlinky.wpapi.wpapiStrings.number = this.cast("number")
  @scala.inline
  def `object`: typingsSlinky.wpapi.wpapiStrings.`object` = this.cast("object")
  @scala.inline
  def string: typingsSlinky.wpapi.wpapiStrings.string = this.cast("string")
}

