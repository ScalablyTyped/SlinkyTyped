package typingsSlinky.wordpressApiFetch.mod.Schema

import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// prettier-ignore
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.wordpressApiFetch.mod.Schema.BaseMedia[T]
  - typingsSlinky.std.Pick[
typingsSlinky.wordpressApiFetch.mod.Schema.BaseMedia[T], 
typingsSlinky.wordpressApiFetch.mod.Schema.ViewKeys.Media | typingsSlinky.wordpressApiFetch.mod.Schema.EmbedKeys.Media]
*/
trait Media[T /* <: Context */] extends js.Object

object Media {
  @scala.inline
  implicit def apply[T](value: BaseMedia[T]): Media[T] = value.asInstanceOf[Media[T]]
  @scala.inline
  implicit def apply[T](
    value: Pick[
      BaseMedia[T], 
      typingsSlinky.wordpressApiFetch.mod.Schema.ViewKeys.Media | typingsSlinky.wordpressApiFetch.mod.Schema.EmbedKeys.Media
    ]
  ): Media[T] = value.asInstanceOf[Media[T]]
}

