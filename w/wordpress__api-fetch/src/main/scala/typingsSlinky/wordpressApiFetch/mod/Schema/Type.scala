package typingsSlinky.wordpressApiFetch.mod.Schema

import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// prettier-ignore
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.wordpressApiFetch.mod.Schema.BaseType[T]
  - typingsSlinky.std.Pick[
typingsSlinky.wordpressApiFetch.mod.Schema.BaseType[T], 
typingsSlinky.wordpressApiFetch.mod.Schema.ViewKeys.Type | typingsSlinky.wordpressApiFetch.mod.Schema.EmbedKeys.Type]
*/
trait Type[T /* <: Context */] extends js.Object

object Type {
  @scala.inline
  implicit def apply[T](value: BaseType[T]): Type[T] = value.asInstanceOf[Type[T]]
  @scala.inline
  implicit def apply[T](
    value: Pick[
      BaseType[T], 
      typingsSlinky.wordpressApiFetch.mod.Schema.ViewKeys.Type | typingsSlinky.wordpressApiFetch.mod.Schema.EmbedKeys.Type
    ]
  ): Type[T] = value.asInstanceOf[Type[T]]
}

