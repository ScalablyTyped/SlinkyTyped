package typingsSlinky.wordpressApiFetch.mod.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.wordpressApiFetch.wordpressApiFetchStrings.edit
  - typingsSlinky.wordpressApiFetch.wordpressApiFetchStrings.embed
  - typingsSlinky.wordpressApiFetch.wordpressApiFetchStrings.view
*/
trait Context extends js.Object

object Context {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def edit: typingsSlinky.wordpressApiFetch.wordpressApiFetchStrings.edit = this.cast("edit")
  @scala.inline
  def embed: typingsSlinky.wordpressApiFetch.wordpressApiFetchStrings.embed = this.cast("embed")
  @scala.inline
  def view: typingsSlinky.wordpressApiFetch.wordpressApiFetchStrings.view = this.cast("view")
}

