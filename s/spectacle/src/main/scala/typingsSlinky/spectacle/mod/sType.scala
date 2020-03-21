package typingsSlinky.spectacle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * S Types for StyledS in Spectacle
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.spectacle.spectacleStrings.italic
  - typingsSlinky.spectacle.spectacleStrings.bold
  - typingsSlinky.spectacle.spectacleStrings.`line-through`
  - typingsSlinky.spectacle.spectacleStrings.underline
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

