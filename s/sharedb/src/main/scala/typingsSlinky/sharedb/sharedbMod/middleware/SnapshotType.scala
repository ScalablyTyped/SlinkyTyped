package typingsSlinky.sharedb.sharedbMod.middleware

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.sharedb.sharedbStrings.current
  - typings.sharedb.sharedbStrings.byVersion
  - typings.sharedb.sharedbStrings.byTimestamp
*/
trait SnapshotType extends js.Object

object SnapshotType {
  @scala.inline
  def byTimestamp: typingsSlinky.sharedb.sharedbStrings.byTimestamp = this.cast("byTimestamp")
  @scala.inline
  def byVersion: typingsSlinky.sharedb.sharedbStrings.byVersion = this.cast("byVersion")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def current: typingsSlinky.sharedb.sharedbStrings.current = this.cast("current")
}

