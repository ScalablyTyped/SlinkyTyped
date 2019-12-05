package typingsSlinky.sloc.slocMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.sloc.slocStrings.total
  - typings.sloc.slocStrings.source
  - typings.sloc.slocStrings.comment
  - typings.sloc.slocStrings.single
  - typings.sloc.slocStrings.block
  - typings.sloc.slocStrings.mixed
  - typings.sloc.slocStrings.blockEmpty
  - typings.sloc.slocStrings.empty
  - typings.sloc.slocStrings.todo
*/
trait Key extends js.Object

object Key {
  @scala.inline
  def block: typingsSlinky.sloc.slocStrings.block = this.cast("block")
  @scala.inline
  def blockEmpty: typingsSlinky.sloc.slocStrings.blockEmpty = this.cast("blockEmpty")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def comment: typingsSlinky.sloc.slocStrings.comment = this.cast("comment")
  @scala.inline
  def empty: typingsSlinky.sloc.slocStrings.empty = this.cast("empty")
  @scala.inline
  def mixed: typingsSlinky.sloc.slocStrings.mixed = this.cast("mixed")
  @scala.inline
  def single: typingsSlinky.sloc.slocStrings.single = this.cast("single")
  @scala.inline
  def source: typingsSlinky.sloc.slocStrings.source = this.cast("source")
  @scala.inline
  def todo: typingsSlinky.sloc.slocStrings.todo = this.cast("todo")
  @scala.inline
  def total: typingsSlinky.sloc.slocStrings.total = this.cast("total")
}

