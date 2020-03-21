package typingsSlinky.spectacle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Transition Types for Spectacle
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.spectacle.spectacleStrings.slide
  - typingsSlinky.spectacle.spectacleStrings.zoom
  - typingsSlinky.spectacle.spectacleStrings.fade
  - typingsSlinky.spectacle.spectacleStrings.spin
*/
trait transitionType extends js.Object

object transitionType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def fade: typingsSlinky.spectacle.spectacleStrings.fade = this.cast("fade")
  @scala.inline
  def slide: typingsSlinky.spectacle.spectacleStrings.slide = this.cast("slide")
  @scala.inline
  def spin: typingsSlinky.spectacle.spectacleStrings.spin = this.cast("spin")
  @scala.inline
  def zoom: typingsSlinky.spectacle.spectacleStrings.zoom = this.cast("zoom")
}

