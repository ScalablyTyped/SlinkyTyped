package typingsSlinky.walk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.walk.walkStrings.file
  - typingsSlinky.walk.walkStrings.directory
*/
trait WalkStatEvent extends js.Object

object WalkStatEvent {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def directory: typingsSlinky.walk.walkStrings.directory = this.cast("directory")
  @scala.inline
  def file: typingsSlinky.walk.walkStrings.file = this.cast("file")
}

