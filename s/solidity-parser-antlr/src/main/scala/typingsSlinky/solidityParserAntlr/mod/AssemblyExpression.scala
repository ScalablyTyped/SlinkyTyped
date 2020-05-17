package typingsSlinky.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.solidityParserAntlr.mod.AssemblyCall
  - typingsSlinky.solidityParserAntlr.mod.AssemblyLiteral
*/
trait AssemblyExpression extends AssemblyItem

object AssemblyExpression {
  @scala.inline
  implicit def apply(value: AssemblyCall): AssemblyExpression = value.asInstanceOf[AssemblyExpression]
  @scala.inline
  implicit def apply(value: AssemblyLiteral): AssemblyExpression = value.asInstanceOf[AssemblyExpression]
}

