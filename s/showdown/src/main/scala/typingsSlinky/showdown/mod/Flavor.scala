package typingsSlinky.showdown.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Showdown Flavor names.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.showdown.showdownStrings.github
  - typingsSlinky.showdown.showdownStrings.original
  - typingsSlinky.showdown.showdownStrings.ghost
  - typingsSlinky.showdown.showdownStrings.vanilla
  - typingsSlinky.showdown.showdownStrings.allOn
*/
trait Flavor extends js.Object

object Flavor {
  @scala.inline
  def allOn: typingsSlinky.showdown.showdownStrings.allOn = this.cast("allOn")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ghost: typingsSlinky.showdown.showdownStrings.ghost = this.cast("ghost")
  @scala.inline
  def github: typingsSlinky.showdown.showdownStrings.github = this.cast("github")
  @scala.inline
  def original: typingsSlinky.showdown.showdownStrings.original = this.cast("original")
  @scala.inline
  def vanilla: typingsSlinky.showdown.showdownStrings.vanilla = this.cast("vanilla")
}

