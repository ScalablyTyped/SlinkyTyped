package typingsSlinky.spectacle.spectacleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * S Types for StyledS in Spectacle
  */
/* Rewritten from type alias, can be one of: 
  - typings.spectacle.spectacleStrings.italic
  - typings.spectacle.spectacleStrings.bold
  - typings.spectacle.spectacleStrings.`line-through`
  - typings.spectacle.spectacleStrings.underline
*/
trait sType extends js.Object

object sType {
  @scala.inline
  def bold: typingsSlinky.spectacle.spectacleStrings.bold = this.cast("bold")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def italic: typingsSlinky.spectacle.spectacleStrings.italic = this.cast("italic")
  @scala.inline
  def `line-through`: typingsSlinky.spectacle.spectacleStrings.`line-through` = this.cast("line-through")
  @scala.inline
  def underline: typingsSlinky.spectacle.spectacleStrings.underline = this.cast("underline")
}

