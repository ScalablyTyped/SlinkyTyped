package typingsSlinky.vueTemplateCompiler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vueTemplateCompiler.mod.ASTElement
  - typingsSlinky.vueTemplateCompiler.mod.ASTText
  - typingsSlinky.vueTemplateCompiler.mod.ASTExpression
*/
trait ASTNode extends js.Object

object ASTNode {
  @scala.inline
  implicit def apply(value: ASTElement): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: ASTExpression): ASTNode = value.asInstanceOf[ASTNode]
  @scala.inline
  implicit def apply(value: ASTText): ASTNode = value.asInstanceOf[ASTNode]
}

