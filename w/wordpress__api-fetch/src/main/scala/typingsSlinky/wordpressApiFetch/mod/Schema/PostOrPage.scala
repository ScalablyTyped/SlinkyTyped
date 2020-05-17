package typingsSlinky.wordpressApiFetch.mod.Schema

import typingsSlinky.std.Partial
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// prettier-ignore
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.wordpressApiFetch.mod.Schema.BasePost[T] with typingsSlinky.std.Partial[typingsSlinky.wordpressApiFetch.mod.Schema.BasePage[T]]
  - (typingsSlinky.std.Pick[
typingsSlinky.wordpressApiFetch.mod.Schema.BasePost[T], 
typingsSlinky.wordpressApiFetch.mod.Schema.ViewKeys.Post]) with (typingsSlinky.std.Partial[
typingsSlinky.std.Pick[
  typingsSlinky.wordpressApiFetch.mod.Schema.BasePage[T], 
  typingsSlinky.wordpressApiFetch.mod.Schema.ViewKeys.Page
]])
  - (typingsSlinky.std.Pick[
typingsSlinky.wordpressApiFetch.mod.Schema.BasePost[T], 
typingsSlinky.wordpressApiFetch.mod.Schema.EmbedKeys.Post]) with (typingsSlinky.std.Partial[
typingsSlinky.std.Pick[
  typingsSlinky.wordpressApiFetch.mod.Schema.BasePage[T], 
  typingsSlinky.wordpressApiFetch.mod.Schema.EmbedKeys.Page
]])
*/
trait PostOrPage[T /* <: Context */] extends js.Object

object PostOrPage {
  @scala.inline
  implicit def apply[T](
    value: (Pick[BasePost[T], typingsSlinky.wordpressApiFetch.mod.Schema.ViewKeys.Post]) with (Partial[Pick[BasePage[T], typingsSlinky.wordpressApiFetch.mod.Schema.ViewKeys.Page]]) with (Pick[BasePost[T], typingsSlinky.wordpressApiFetch.mod.Schema.EmbedKeys.Post]) with (Partial[Pick[BasePage[T], typingsSlinky.wordpressApiFetch.mod.Schema.EmbedKeys.Page]])
  ): PostOrPage[T] = value.asInstanceOf[PostOrPage[T]]
  @scala.inline
  implicit def apply[T](value: BasePost[T] with Partial[BasePage[T]]): PostOrPage[T] = value.asInstanceOf[PostOrPage[T]]
}

