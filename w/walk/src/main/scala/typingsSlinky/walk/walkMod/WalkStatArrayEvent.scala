package typingsSlinky.walk.walkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.walk.walkStrings.files
  - typings.walk.walkStrings.directories
  - typings.walk.walkStrings.errors
  - typings.walk.walkStrings.nodeError
  - typings.walk.walkStrings.directoryError
*/
trait WalkStatArrayEvent extends js.Object

object WalkStatArrayEvent {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def directories: typingsSlinky.walk.walkStrings.directories = this.cast("directories")
  @scala.inline
  def directoryError: typingsSlinky.walk.walkStrings.directoryError = this.cast("directoryError")
  @scala.inline
  def errors: typingsSlinky.walk.walkStrings.errors = this.cast("errors")
  @scala.inline
  def files: typingsSlinky.walk.walkStrings.files = this.cast("files")
  @scala.inline
  def nodeError: typingsSlinky.walk.walkStrings.nodeError = this.cast("nodeError")
}

