package typingsSlinky.tryghostContentApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.tryghostContentApi.tryghostContentApiStrings.public
  - typingsSlinky.tryghostContentApi.tryghostContentApiStrings.draft
  - typingsSlinky.tryghostContentApi.tryghostContentApiStrings.scheduled
*/
trait TagVisibility extends js.Object

object TagVisibility {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def draft: typingsSlinky.tryghostContentApi.tryghostContentApiStrings.draft = this.cast("draft")
  @scala.inline
  def public: typingsSlinky.tryghostContentApi.tryghostContentApiStrings.public = this.cast("public")
  @scala.inline
  def scheduled: typingsSlinky.tryghostContentApi.tryghostContentApiStrings.scheduled = this.cast("scheduled")
}

