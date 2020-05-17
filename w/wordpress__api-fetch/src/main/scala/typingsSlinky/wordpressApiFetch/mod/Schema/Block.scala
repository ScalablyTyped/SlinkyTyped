package typingsSlinky.wordpressApiFetch.mod.Schema

import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// prettier-ignore
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.wordpressApiFetch.mod.Schema.BaseBlock[T]
  - typingsSlinky.std.Pick[
typingsSlinky.wordpressApiFetch.mod.Schema.BaseBlock[T], 
typingsSlinky.wordpressApiFetch.mod.Schema.ViewKeys.Block | typingsSlinky.wordpressApiFetch.mod.Schema.EmbedKeys.Block]
*/
trait Block[T /* <: Context */] extends js.Object

object Block {
  @scala.inline
  implicit def apply[T](value: BaseBlock[T]): Block[T] = value.asInstanceOf[Block[T]]
  @scala.inline
  implicit def apply[T](
    value: Pick[
      BaseBlock[T], 
      typingsSlinky.wordpressApiFetch.mod.Schema.ViewKeys.Block | typingsSlinky.wordpressApiFetch.mod.Schema.EmbedKeys.Block
    ]
  ): Block[T] = value.asInstanceOf[Block[T]]
}

