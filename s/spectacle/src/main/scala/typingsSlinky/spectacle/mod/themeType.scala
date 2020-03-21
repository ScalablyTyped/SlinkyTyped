package typingsSlinky.spectacle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Theme Types for CodePane in Spectacle
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.spectacle.spectacleStrings.dark
  - typingsSlinky.spectacle.spectacleStrings.light
  - typingsSlinky.spectacle.spectacleStrings.external
*/
trait themeType extends js.Object

object themeType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dark: typingsSlinky.spectacle.spectacleStrings.dark = this.cast("dark")
  @scala.inline
  def external: typingsSlinky.spectacle.spectacleStrings.external = this.cast("external")
  @scala.inline
  def light: typingsSlinky.spectacle.spectacleStrings.light = this.cast("light")
}

