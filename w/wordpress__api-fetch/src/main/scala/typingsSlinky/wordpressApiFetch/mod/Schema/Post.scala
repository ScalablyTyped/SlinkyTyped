package typingsSlinky.wordpressApiFetch.mod.Schema

import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// prettier-ignore
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.wordpressApiFetch.mod.Schema.BasePost[T]
  - typingsSlinky.std.Pick[
typingsSlinky.wordpressApiFetch.mod.Schema.BasePost[T], 
typingsSlinky.wordpressApiFetch.mod.Schema.ViewKeys.Post | typingsSlinky.wordpressApiFetch.mod.Schema.EmbedKeys.Post]
*/
trait Post[T /* <: Context */] extends js.Object

object Post {
  @scala.inline
  implicit def apply[T](value: BasePost[T]): Post[T] = value.asInstanceOf[Post[T]]
  @scala.inline
  implicit def apply[T](
    value: Pick[
      BasePost[T], 
      typingsSlinky.wordpressApiFetch.mod.Schema.ViewKeys.Post | typingsSlinky.wordpressApiFetch.mod.Schema.EmbedKeys.Post
    ]
  ): Post[T] = value.asInstanceOf[Post[T]]
}

