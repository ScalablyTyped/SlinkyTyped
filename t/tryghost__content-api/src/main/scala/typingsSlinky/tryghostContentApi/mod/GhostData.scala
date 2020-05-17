package typingsSlinky.tryghostContentApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.tryghostContentApi.mod.PostOrPage
  - typingsSlinky.tryghostContentApi.mod.Author
  - typingsSlinky.tryghostContentApi.mod.Tag
  - typingsSlinky.tryghostContentApi.mod.Settings
*/
trait GhostData extends js.Object

object GhostData {
  @scala.inline
  implicit def apply(value: Author): GhostData = value.asInstanceOf[GhostData]
  @scala.inline
  implicit def apply(value: PostOrPage): GhostData = value.asInstanceOf[GhostData]
  @scala.inline
  implicit def apply(value: Settings): GhostData = value.asInstanceOf[GhostData]
  @scala.inline
  implicit def apply(value: Tag): GhostData = value.asInstanceOf[GhostData]
}

