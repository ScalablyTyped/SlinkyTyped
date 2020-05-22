package typingsSlinky.wordpressBlocks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.wordpressBlocks.mod.AttributeSource.Attribute
    - typingsSlinky.wordpressBlocks.mod.AttributeSource.Children
    - typingsSlinky.wordpressBlocks.mod.AttributeSource.HTML
    - typingsSlinky.wordpressBlocks.mod.AttributeSource.Meta
    - typingsSlinky.wordpressBlocks.mod.AttributeSource.Query[T]
    - typingsSlinky.wordpressBlocks.mod.AttributeSource.Text
    - typingsSlinky.wordpressBlocks.mod.AttributeSource.None
  */
  type BlockAttribute[T] = typingsSlinky.wordpressBlocks.mod._BlockAttribute[T] | typingsSlinky.wordpressBlocks.mod.AttributeSource.Attribute | typingsSlinky.wordpressBlocks.mod.AttributeSource.None
}
