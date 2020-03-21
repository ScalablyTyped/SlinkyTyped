package typingsSlinky.waterline.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.waterline.waterlineStrings.string
  - typingsSlinky.waterline.waterlineStrings.text
  - typingsSlinky.waterline.waterlineStrings.integer
  - typingsSlinky.waterline.waterlineStrings.float
  - typingsSlinky.waterline.waterlineStrings.date
  - typingsSlinky.waterline.waterlineStrings.time
  - typingsSlinky.waterline.waterlineStrings.datetime
  - typingsSlinky.waterline.waterlineStrings.boolean
  - typingsSlinky.waterline.waterlineStrings.binary
  - typingsSlinky.waterline.waterlineStrings.array
  - typingsSlinky.waterline.waterlineStrings.json
*/
trait AttributeType extends js.Object

object AttributeType {
  @scala.inline
  def array: typingsSlinky.waterline.waterlineStrings.array = this.cast("array")
  @scala.inline
  def binary: typingsSlinky.waterline.waterlineStrings.binary = this.cast("binary")
  @scala.inline
  def boolean: typingsSlinky.waterline.waterlineStrings.boolean = this.cast("boolean")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def date: typingsSlinky.waterline.waterlineStrings.date = this.cast("date")
  @scala.inline
  def datetime: typingsSlinky.waterline.waterlineStrings.datetime = this.cast("datetime")
  @scala.inline
  def float: typingsSlinky.waterline.waterlineStrings.float = this.cast("float")
  @scala.inline
  def integer: typingsSlinky.waterline.waterlineStrings.integer = this.cast("integer")
  @scala.inline
  def json: typingsSlinky.waterline.waterlineStrings.json = this.cast("json")
  @scala.inline
  def string: typingsSlinky.waterline.waterlineStrings.string = this.cast("string")
  @scala.inline
  def text: typingsSlinky.waterline.waterlineStrings.text = this.cast("text")
  @scala.inline
  def time: typingsSlinky.waterline.waterlineStrings.time = this.cast("time")
}

