package typingsSlinky.zdog.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.zdog.mod.VectorOptions
  - typingsSlinky.zdog.mod.PathLineCommand
  - typingsSlinky.zdog.mod.PathMoveCommand
  - typingsSlinky.zdog.mod.PathArcCommand
  - typingsSlinky.zdog.mod.PathBezierCommand
*/
trait PathCommand extends js.Object

object PathCommand {
  @scala.inline
  implicit def apply(value: PathArcCommand): PathCommand = value.asInstanceOf[PathCommand]
  @scala.inline
  implicit def apply(value: PathBezierCommand): PathCommand = value.asInstanceOf[PathCommand]
  @scala.inline
  implicit def apply(value: PathLineCommand): PathCommand = value.asInstanceOf[PathCommand]
  @scala.inline
  implicit def apply(value: PathMoveCommand): PathCommand = value.asInstanceOf[PathCommand]
  @scala.inline
  implicit def apply(value: VectorOptions): PathCommand = value.asInstanceOf[PathCommand]
}

