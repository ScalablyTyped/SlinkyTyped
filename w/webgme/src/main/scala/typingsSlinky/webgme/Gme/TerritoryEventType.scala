package typingsSlinky.webgme.Gme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.webgme.webgmeStrings.load
  - typingsSlinky.webgme.webgmeStrings.unload
  - typingsSlinky.webgme.webgmeStrings.update
  - typingsSlinky.webgme.webgmeStrings.complete
  - typingsSlinky.webgme.webgmeStrings.incomplete
*/
trait TerritoryEventType extends js.Object

object TerritoryEventType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def complete: typingsSlinky.webgme.webgmeStrings.complete = this.cast("complete")
  @scala.inline
  def incomplete: typingsSlinky.webgme.webgmeStrings.incomplete = this.cast("incomplete")
  @scala.inline
  def load: typingsSlinky.webgme.webgmeStrings.load = this.cast("load")
  @scala.inline
  def unload: typingsSlinky.webgme.webgmeStrings.unload = this.cast("unload")
  @scala.inline
  def update: typingsSlinky.webgme.webgmeStrings.update = this.cast("update")
}

