package typingsSlinky.wordpressApiFetch.mod.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.wordpressApiFetch.wordpressApiFetchStrings.draft
  - typingsSlinky.wordpressApiFetch.wordpressApiFetchStrings.future
  - typingsSlinky.wordpressApiFetch.wordpressApiFetchStrings.pending
  - typingsSlinky.wordpressApiFetch.wordpressApiFetchStrings.`private`
  - typingsSlinky.wordpressApiFetch.wordpressApiFetchStrings.publish
*/
trait PostStatus extends js.Object

object PostStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def draft: typingsSlinky.wordpressApiFetch.wordpressApiFetchStrings.draft = this.cast("draft")
  @scala.inline
  def future: typingsSlinky.wordpressApiFetch.wordpressApiFetchStrings.future = this.cast("future")
  @scala.inline
  def pending: typingsSlinky.wordpressApiFetch.wordpressApiFetchStrings.pending = this.cast("pending")
  @scala.inline
  def `private`: typingsSlinky.wordpressApiFetch.wordpressApiFetchStrings.`private` = this.cast("private")
  @scala.inline
  def publish: typingsSlinky.wordpressApiFetch.wordpressApiFetchStrings.publish = this.cast("publish")
}

