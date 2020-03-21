package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.stdStrings.next
  - typingsSlinky.std.stdStrings.nextunique
  - typingsSlinky.std.stdStrings.prev
  - typingsSlinky.std.stdStrings.prevunique
*/
trait IDBCursorDirection extends js.Object

object IDBCursorDirection {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def next: typingsSlinky.std.stdStrings.next = this.cast("next")
  @scala.inline
  def nextunique: typingsSlinky.std.stdStrings.nextunique = this.cast("nextunique")
  @scala.inline
  def prev: typingsSlinky.std.stdStrings.prev = this.cast("prev")
  @scala.inline
  def prevunique: typingsSlinky.std.stdStrings.prevunique = this.cast("prevunique")
}

