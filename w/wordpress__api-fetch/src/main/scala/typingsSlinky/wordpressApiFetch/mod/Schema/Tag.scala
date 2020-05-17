package typingsSlinky.wordpressApiFetch.mod.Schema

import typingsSlinky.wordpressApiFetch.anon.PickBaseTagTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// prettier-ignore
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.wordpressApiFetch.mod.Schema.BaseTag
  - typingsSlinky.wordpressApiFetch.anon.PickBaseTagTag
*/
trait Tag[T /* <: Context */] extends js.Object

object Tag {
  @scala.inline
  implicit def apply[T](value: BaseTag): Tag[T] = value.asInstanceOf[Tag[T]]
  @scala.inline
  implicit def apply[T](value: PickBaseTagTag): Tag[T] = value.asInstanceOf[Tag[T]]
}

