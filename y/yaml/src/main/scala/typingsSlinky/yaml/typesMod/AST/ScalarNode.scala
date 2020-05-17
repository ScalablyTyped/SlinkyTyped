package typingsSlinky.yaml.typesMod.AST

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.yaml.typesMod.AST.BlockFolded
  - typingsSlinky.yaml.typesMod.AST.BlockLiteral
  - typingsSlinky.yaml.typesMod.AST.PlainValue
  - typingsSlinky.yaml.typesMod.AST.QuoteDouble
  - typingsSlinky.yaml.typesMod.AST.QuoteSingle
*/
trait ScalarNode extends AstNode

object ScalarNode {
  @scala.inline
  implicit def apply(value: BlockFolded): ScalarNode = value.asInstanceOf[ScalarNode]
  @scala.inline
  implicit def apply(value: BlockLiteral): ScalarNode = value.asInstanceOf[ScalarNode]
  @scala.inline
  implicit def apply(value: PlainValue): ScalarNode = value.asInstanceOf[ScalarNode]
  @scala.inline
  implicit def apply(value: QuoteDouble): ScalarNode = value.asInstanceOf[ScalarNode]
  @scala.inline
  implicit def apply(value: QuoteSingle): ScalarNode = value.asInstanceOf[ScalarNode]
}

