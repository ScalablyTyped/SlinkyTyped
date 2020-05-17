package typingsSlinky.wordpressApiFetch.mod.Schema

import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// prettier-ignore
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.wordpressApiFetch.mod.Schema.BasePage[T]
  - typingsSlinky.std.Pick[
typingsSlinky.wordpressApiFetch.mod.Schema.BasePage[T], 
typingsSlinky.wordpressApiFetch.mod.Schema.ViewKeys.Page | typingsSlinky.wordpressApiFetch.mod.Schema.EmbedKeys.Page]
*/
trait Page[T /* <: Context */] extends js.Object

object Page {
  @scala.inline
  implicit def apply[T](value: BasePage[T]): Page[T] = value.asInstanceOf[Page[T]]
  @scala.inline
  implicit def apply[T](
    value: Pick[
      BasePage[T], 
      typingsSlinky.wordpressApiFetch.mod.Schema.ViewKeys.Page | typingsSlinky.wordpressApiFetch.mod.Schema.EmbedKeys.Page
    ]
  ): Page[T] = value.asInstanceOf[Page[T]]
}

