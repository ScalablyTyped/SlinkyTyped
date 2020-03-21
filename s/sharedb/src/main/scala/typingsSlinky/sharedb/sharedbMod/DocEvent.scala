package typingsSlinky.sharedb.sharedbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.sharedb.sharedbStrings.load
  - typingsSlinky.sharedb.sharedbStrings.create
  - typingsSlinky.sharedb.sharedbStrings.`before op`
  - typingsSlinky.sharedb.sharedbStrings.op
  - typingsSlinky.sharedb.sharedbStrings.del
  - typingsSlinky.sharedb.sharedbStrings.error
  - typingsSlinky.sharedb.sharedbStrings.`no write pending`
  - typingsSlinky.sharedb.sharedbStrings.`nothing pending`
*/
trait DocEvent extends js.Object

object DocEvent {
  @scala.inline
  def `before op`: typingsSlinky.sharedb.sharedbStrings.`before op` = this.cast("before op")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def create: typingsSlinky.sharedb.sharedbStrings.create = this.cast("create")
  @scala.inline
  def del: typingsSlinky.sharedb.sharedbStrings.del = this.cast("del")
  @scala.inline
  def error: typingsSlinky.sharedb.sharedbStrings.error = this.cast("error")
  @scala.inline
  def load: typingsSlinky.sharedb.sharedbStrings.load = this.cast("load")
  @scala.inline
  def `no write pending`: typingsSlinky.sharedb.sharedbStrings.`no write pending` = this.cast("no write pending")
  @scala.inline
  def `nothing pending`: typingsSlinky.sharedb.sharedbStrings.`nothing pending` = this.cast("nothing pending")
  @scala.inline
  def op: typingsSlinky.sharedb.sharedbStrings.op = this.cast("op")
}

