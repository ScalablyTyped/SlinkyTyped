package typingsSlinky.twilioSync.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.twilioSync.twilioSyncStrings.open_or_create
  - typingsSlinky.twilioSync.twilioSyncStrings.open_existing
  - typingsSlinky.twilioSync.twilioSyncStrings.create_new
*/
trait OpenMode extends js.Object

object OpenMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def create_new: typingsSlinky.twilioSync.twilioSyncStrings.create_new = this.cast("create_new")
  @scala.inline
  def open_existing: typingsSlinky.twilioSync.twilioSyncStrings.open_existing = this.cast("open_existing")
  @scala.inline
  def open_or_create: typingsSlinky.twilioSync.twilioSyncStrings.open_or_create = this.cast("open_or_create")
}

