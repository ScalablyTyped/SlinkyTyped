package typingsSlinky.sharedb.libSharedbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.sharedb.sharedbStrings.ready
  - typings.sharedb.sharedbStrings.error
  - typings.sharedb.sharedbStrings.changed
  - typings.sharedb.sharedbStrings.insert
  - typings.sharedb.sharedbStrings.move
  - typings.sharedb.sharedbStrings.remove
  - typings.sharedb.sharedbStrings.extra
*/
trait QueryEvent extends js.Object

object QueryEvent {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def changed: typingsSlinky.sharedb.sharedbStrings.changed = this.cast("changed")
  @scala.inline
  def error: typingsSlinky.sharedb.sharedbStrings.error = this.cast("error")
  @scala.inline
  def extra: typingsSlinky.sharedb.sharedbStrings.extra = this.cast("extra")
  @scala.inline
  def insert: typingsSlinky.sharedb.sharedbStrings.insert = this.cast("insert")
  @scala.inline
  def move: typingsSlinky.sharedb.sharedbStrings.move = this.cast("move")
  @scala.inline
  def ready: typingsSlinky.sharedb.sharedbStrings.ready = this.cast("ready")
  @scala.inline
  def remove: typingsSlinky.sharedb.sharedbStrings.remove = this.cast("remove")
}

