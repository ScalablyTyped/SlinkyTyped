package typingsSlinky.twitterText.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.twitterText.mod.HashtagWithIndices
  - typingsSlinky.twitterText.mod.UrlWithIndices
  - typingsSlinky.twitterText.mod.MentionWithIndices
  - typingsSlinky.twitterText.mod.MentionOrListWithIndices
  - typingsSlinky.twitterText.mod.CashtagWithIndices
*/
trait EntityWithIndices extends js.Object

object EntityWithIndices {
  @scala.inline
  implicit def apply(value: CashtagWithIndices): EntityWithIndices = value.asInstanceOf[EntityWithIndices]
  @scala.inline
  implicit def apply(value: HashtagWithIndices): EntityWithIndices = value.asInstanceOf[EntityWithIndices]
  @scala.inline
  implicit def apply(value: MentionOrListWithIndices): EntityWithIndices = value.asInstanceOf[EntityWithIndices]
  @scala.inline
  implicit def apply(value: MentionWithIndices): EntityWithIndices = value.asInstanceOf[EntityWithIndices]
  @scala.inline
  implicit def apply(value: UrlWithIndices): EntityWithIndices = value.asInstanceOf[EntityWithIndices]
}

