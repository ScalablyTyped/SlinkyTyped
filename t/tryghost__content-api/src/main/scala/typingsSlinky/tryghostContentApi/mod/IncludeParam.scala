package typingsSlinky.tryghostContentApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.tryghostContentApi.tryghostContentApiStrings.authors
  - typingsSlinky.tryghostContentApi.tryghostContentApiStrings.tags
  - typingsSlinky.tryghostContentApi.tryghostContentApiStrings.countDotposts
*/
trait IncludeParam extends js.Object

object IncludeParam {
  @scala.inline
  def authors: typingsSlinky.tryghostContentApi.tryghostContentApiStrings.authors = this.cast("authors")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def countDotposts: typingsSlinky.tryghostContentApi.tryghostContentApiStrings.countDotposts = this.cast("count.posts")
  @scala.inline
  def tags: typingsSlinky.tryghostContentApi.tryghostContentApiStrings.tags = this.cast("tags")
}

