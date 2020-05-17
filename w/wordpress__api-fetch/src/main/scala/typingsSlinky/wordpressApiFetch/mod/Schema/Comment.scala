package typingsSlinky.wordpressApiFetch.mod.Schema

import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// prettier-ignore
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.wordpressApiFetch.mod.Schema.BaseComment[T]
  - typingsSlinky.std.Pick[
typingsSlinky.wordpressApiFetch.mod.Schema.BaseComment[T], 
typingsSlinky.wordpressApiFetch.mod.Schema.ViewKeys.Comment | typingsSlinky.wordpressApiFetch.mod.Schema.EmbedKeys.Comment]
*/
trait Comment[T /* <: Context */] extends js.Object

object Comment {
  @scala.inline
  implicit def apply[T](value: BaseComment[T]): Comment[T] = value.asInstanceOf[Comment[T]]
  @scala.inline
  implicit def apply[T](
    value: Pick[
      BaseComment[T], 
      typingsSlinky.wordpressApiFetch.mod.Schema.ViewKeys.Comment | typingsSlinky.wordpressApiFetch.mod.Schema.EmbedKeys.Comment
    ]
  ): Comment[T] = value.asInstanceOf[Comment[T]]
}

