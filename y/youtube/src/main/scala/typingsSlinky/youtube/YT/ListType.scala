package typingsSlinky.youtube.YT

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.youtube.YT.ListTypePlayer
  - typingsSlinky.youtube.YT.ListTypeSearch
  - typingsSlinky.youtube.YT.ListTypeUserUploads
*/
trait ListType extends js.Object

object ListType {
  @scala.inline
  implicit def apply(value: ListTypePlayer): ListType = value.asInstanceOf[ListType]
  @scala.inline
  implicit def apply(value: ListTypeSearch): ListType = value.asInstanceOf[ListType]
  @scala.inline
  implicit def apply(value: ListTypeUserUploads): ListType = value.asInstanceOf[ListType]
}

