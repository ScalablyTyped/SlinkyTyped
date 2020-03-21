package typingsSlinky.spectacle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Progress Types for Spectacle
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.spectacle.spectacleStrings.pacman
  - typingsSlinky.spectacle.spectacleStrings.bar
  - typingsSlinky.spectacle.spectacleStrings.number
  - typingsSlinky.spectacle.spectacleStrings.none
*/
trait progressType extends js.Object

object progressType {
  @scala.inline
  def bar: typingsSlinky.spectacle.spectacleStrings.bar = this.cast("bar")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def none: typingsSlinky.spectacle.spectacleStrings.none = this.cast("none")
  @scala.inline
  def number: typingsSlinky.spectacle.spectacleStrings.number = this.cast("number")
  @scala.inline
  def pacman: typingsSlinky.spectacle.spectacleStrings.pacman = this.cast("pacman")
}

