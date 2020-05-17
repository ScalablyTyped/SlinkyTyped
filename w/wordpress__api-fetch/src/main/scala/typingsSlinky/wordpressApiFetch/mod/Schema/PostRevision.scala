package typingsSlinky.wordpressApiFetch.mod.Schema

import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// prettier-ignore
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.wordpressApiFetch.mod.Schema.BasePostRevision[T]
  - typingsSlinky.std.Pick[
typingsSlinky.wordpressApiFetch.mod.Schema.BasePostRevision[T], 
typingsSlinky.wordpressApiFetch.mod.Schema.ViewKeys.PostRevision | typingsSlinky.wordpressApiFetch.mod.Schema.EmbedKeys.PostRevision]
*/
trait PostRevision[T /* <: Context */] extends js.Object

object PostRevision {
  @scala.inline
  implicit def apply[T](value: BasePostRevision[T]): PostRevision[T] = value.asInstanceOf[PostRevision[T]]
  @scala.inline
  implicit def apply[T](
    value: Pick[
      BasePostRevision[T], 
      typingsSlinky.wordpressApiFetch.mod.Schema.ViewKeys.PostRevision | typingsSlinky.wordpressApiFetch.mod.Schema.EmbedKeys.PostRevision
    ]
  ): PostRevision[T] = value.asInstanceOf[PostRevision[T]]
}

