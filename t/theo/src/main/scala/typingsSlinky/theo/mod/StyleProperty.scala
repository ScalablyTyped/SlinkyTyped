package typingsSlinky.theo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.theo.theoStrings.name
  - typingsSlinky.theo.theoStrings.value
  - typingsSlinky.theo.theoStrings.`type`
  - typingsSlinky.theo.theoStrings.originalValue
  - typingsSlinky.theo.theoStrings.category
  - typingsSlinky.theo.theoStrings.comment
  - typingsSlinky.theo.theoStrings.meta
*/
trait StyleProperty extends js.Object

object StyleProperty {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def category: typingsSlinky.theo.theoStrings.category = this.cast("category")
  @scala.inline
  def comment: typingsSlinky.theo.theoStrings.comment = this.cast("comment")
  @scala.inline
  def meta: typingsSlinky.theo.theoStrings.meta = this.cast("meta")
  @scala.inline
  def name: typingsSlinky.theo.theoStrings.name = this.cast("name")
  @scala.inline
  def originalValue: typingsSlinky.theo.theoStrings.originalValue = this.cast("originalValue")
  @scala.inline
  def `type`: typingsSlinky.theo.theoStrings.`type` = this.cast("type")
  @scala.inline
  def value: typingsSlinky.theo.theoStrings.value = this.cast("value")
}

