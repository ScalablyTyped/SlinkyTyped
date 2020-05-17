package typingsSlinky.wordpressApiFetch.mod.Schema

import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// prettier-ignore
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.wordpressApiFetch.mod.Schema.BaseUser[T]
  - typingsSlinky.std.Pick[
typingsSlinky.wordpressApiFetch.mod.Schema.BaseUser[T], 
typingsSlinky.wordpressApiFetch.mod.Schema.ViewKeys.User | typingsSlinky.wordpressApiFetch.mod.Schema.EmbedKeys.User]
*/
trait User[T /* <: Context */] extends js.Object

object User {
  @scala.inline
  implicit def apply[T](value: BaseUser[T]): User[T] = value.asInstanceOf[User[T]]
  @scala.inline
  implicit def apply[T](
    value: Pick[
      BaseUser[T], 
      typingsSlinky.wordpressApiFetch.mod.Schema.ViewKeys.User | typingsSlinky.wordpressApiFetch.mod.Schema.EmbedKeys.User
    ]
  ): User[T] = value.asInstanceOf[User[T]]
}

