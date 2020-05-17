package typingsSlinky.yaml.typesMod.AST

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.yaml.typesMod.AST.ScalarNode
  - typingsSlinky.yaml.typesMod.AST.CollectionNode
  - typingsSlinky.yaml.typesMod.AST.Alias
*/
trait AstNode extends js.Object

object AstNode {
  @scala.inline
  implicit def apply(value: Alias): AstNode = value.asInstanceOf[AstNode]
  @scala.inline
  implicit def apply(value: CollectionNode): AstNode = value.asInstanceOf[AstNode]
  @scala.inline
  implicit def apply(value: ScalarNode): AstNode = value.asInstanceOf[AstNode]
}

