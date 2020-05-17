package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.UnparsedPrepend
  - typingsSlinky.typescript.mod.UnparsedTextLike
*/
trait UnparsedSourceText extends UnparsedNode

object UnparsedSourceText {
  @scala.inline
  implicit def apply(value: UnparsedPrepend): UnparsedSourceText = value.asInstanceOf[UnparsedSourceText]
  @scala.inline
  implicit def apply(value: UnparsedTextLike): UnparsedSourceText = value.asInstanceOf[UnparsedSourceText]
}

