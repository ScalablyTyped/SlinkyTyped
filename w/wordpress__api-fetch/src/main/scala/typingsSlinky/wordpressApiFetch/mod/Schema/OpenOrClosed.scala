package typingsSlinky.wordpressApiFetch.mod.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.wordpressApiFetch.wordpressApiFetchStrings.open
  - typingsSlinky.wordpressApiFetch.wordpressApiFetchStrings.closed
*/
trait OpenOrClosed extends js.Object

object OpenOrClosed {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def closed: typingsSlinky.wordpressApiFetch.wordpressApiFetchStrings.closed = this.cast("closed")
  @scala.inline
  def open: typingsSlinky.wordpressApiFetch.wordpressApiFetchStrings.open = this.cast("open")
}

