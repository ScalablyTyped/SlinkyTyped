package typingsSlinky.spectacle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Target Types for links
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.spectacle.spectacleStrings._blank
  - typingsSlinky.spectacle.spectacleStrings._self
  - typingsSlinky.spectacle.spectacleStrings._parent
  - typingsSlinky.spectacle.spectacleStrings._top
*/
trait targetType extends js.Object

object targetType {
  @scala.inline
  def _blank: typingsSlinky.spectacle.spectacleStrings._blank = this.cast("_blank")
  @scala.inline
  def _parent: typingsSlinky.spectacle.spectacleStrings._parent = this.cast("_parent")
  @scala.inline
  def _self: typingsSlinky.spectacle.spectacleStrings._self = this.cast("_self")
  @scala.inline
  def _top: typingsSlinky.spectacle.spectacleStrings._top = this.cast("_top")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

