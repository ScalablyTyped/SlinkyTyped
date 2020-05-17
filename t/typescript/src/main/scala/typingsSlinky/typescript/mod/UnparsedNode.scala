package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.UnparsedPrologue
  - typingsSlinky.typescript.mod.UnparsedSourceText
  - typingsSlinky.typescript.mod.UnparsedSyntheticReference
*/
trait UnparsedNode extends js.Object

object UnparsedNode {
  @scala.inline
  implicit def apply(value: UnparsedPrologue): UnparsedNode = value.asInstanceOf[UnparsedNode]
  @scala.inline
  implicit def apply(value: UnparsedSourceText): UnparsedNode = value.asInstanceOf[UnparsedNode]
  @scala.inline
  implicit def apply(value: UnparsedSyntheticReference): UnparsedNode = value.asInstanceOf[UnparsedNode]
}

