package typingsSlinky.yaml.typesMod.Scalar

import typingsSlinky.yaml.utilMod.Type.BLOCK_FOLDED
import typingsSlinky.yaml.utilMod.Type.BLOCK_LITERAL
import typingsSlinky.yaml.utilMod.Type.PLAIN
import typingsSlinky.yaml.utilMod.Type.QUOTE_DOUBLE
import typingsSlinky.yaml.utilMod.Type.QUOTE_SINGLE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.yaml.utilMod.Type.BLOCK_FOLDED
  - typingsSlinky.yaml.utilMod.Type.BLOCK_LITERAL
  - typingsSlinky.yaml.utilMod.Type.PLAIN
  - typingsSlinky.yaml.utilMod.Type.QUOTE_DOUBLE
  - typingsSlinky.yaml.utilMod.Type.QUOTE_SINGLE
*/
trait Type extends js.Object

object Type {
  @scala.inline
  implicit def apply(value: BLOCK_FOLDED): Type = value.asInstanceOf[Type]
  @scala.inline
  implicit def apply(value: BLOCK_LITERAL): Type = value.asInstanceOf[Type]
  @scala.inline
  implicit def apply(value: PLAIN): Type = value.asInstanceOf[Type]
  @scala.inline
  implicit def apply(value: QUOTE_DOUBLE): Type = value.asInstanceOf[Type]
  @scala.inline
  implicit def apply(value: QUOTE_SINGLE): Type = value.asInstanceOf[Type]
}

