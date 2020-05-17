package typingsSlinky.wordpressApiFetch.mod.Schema

import typingsSlinky.wordpressApiFetch.anon.PickBaseStatusStatus
import typingsSlinky.wordpressApiFetch.anon.PickBaseStatusStatusEmbedded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// prettier-ignore
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.wordpressApiFetch.mod.Schema.BaseStatus
  - typingsSlinky.wordpressApiFetch.anon.PickBaseStatusStatusEmbedded
  - typingsSlinky.wordpressApiFetch.anon.PickBaseStatusStatus
*/
trait Status[T /* <: Context */] extends js.Object

object Status {
  @scala.inline
  implicit def apply[T](value: BaseStatus): Status[T] = value.asInstanceOf[Status[T]]
  @scala.inline
  implicit def apply[T](value: PickBaseStatusStatus): Status[T] = value.asInstanceOf[Status[T]]
  @scala.inline
  implicit def apply[T](value: PickBaseStatusStatusEmbedded): Status[T] = value.asInstanceOf[Status[T]]
}

