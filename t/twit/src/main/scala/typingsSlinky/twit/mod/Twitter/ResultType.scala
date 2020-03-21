package typingsSlinky.twit.mod.Twitter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.twit.twitStrings.mixed
  - typingsSlinky.twit.twitStrings.popular
  - typingsSlinky.twit.twitStrings.recent
*/
trait ResultType extends js.Object

object ResultType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def mixed: typingsSlinky.twit.twitStrings.mixed = this.cast("mixed")
  @scala.inline
  def popular: typingsSlinky.twit.twitStrings.popular = this.cast("popular")
  @scala.inline
  def recent: typingsSlinky.twit.twitStrings.recent = this.cast("recent")
}

