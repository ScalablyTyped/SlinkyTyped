package typingsSlinky.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.solidityParserAntlr.mod.Identifier
  - typingsSlinky.solidityParserAntlr.mod.AssemblyBlock
  - typingsSlinky.solidityParserAntlr.mod.AssemblyExpression
  - typingsSlinky.solidityParserAntlr.mod.AssemblyLocalDefinition
  - typingsSlinky.solidityParserAntlr.mod.AssemblyAssignment
  - typingsSlinky.solidityParserAntlr.mod.AssemblyStackAssignment
  - typingsSlinky.solidityParserAntlr.mod.LabelDefinition
  - typingsSlinky.solidityParserAntlr.mod.AssemblySwitch
  - typingsSlinky.solidityParserAntlr.mod.AssemblyFunctionDefinition
  - typingsSlinky.solidityParserAntlr.mod.AssemblyFor
  - typingsSlinky.solidityParserAntlr.mod.AssemblyIf
  - typingsSlinky.solidityParserAntlr.mod.Break
  - typingsSlinky.solidityParserAntlr.mod.Continue
  - typingsSlinky.solidityParserAntlr.mod.SubAssembly
  - typingsSlinky.solidityParserAntlr.mod.NumberLiteral
  - typingsSlinky.solidityParserAntlr.mod.StringLiteral
  - typingsSlinky.solidityParserAntlr.mod.HexNumber
  - typingsSlinky.solidityParserAntlr.mod.HexLiteral
  - typingsSlinky.solidityParserAntlr.mod.DecimalNumber
*/
trait AssemblyItem extends ASTNode

object AssemblyItem {
  @scala.inline
  implicit def apply(value: AssemblyAssignment): AssemblyItem = value.asInstanceOf[AssemblyItem]
  @scala.inline
  implicit def apply(value: AssemblyBlock): AssemblyItem = value.asInstanceOf[AssemblyItem]
  @scala.inline
  implicit def apply(value: AssemblyExpression): AssemblyItem = value.asInstanceOf[AssemblyItem]
  @scala.inline
  implicit def apply(value: AssemblyFor): AssemblyItem = value.asInstanceOf[AssemblyItem]
  @scala.inline
  implicit def apply(value: AssemblyFunctionDefinition): AssemblyItem = value.asInstanceOf[AssemblyItem]
  @scala.inline
  implicit def apply(value: AssemblyIf): AssemblyItem = value.asInstanceOf[AssemblyItem]
  @scala.inline
  implicit def apply(value: AssemblyLocalDefinition): AssemblyItem = value.asInstanceOf[AssemblyItem]
  @scala.inline
  implicit def apply(value: AssemblyStackAssignment): AssemblyItem = value.asInstanceOf[AssemblyItem]
  @scala.inline
  implicit def apply(value: AssemblySwitch): AssemblyItem = value.asInstanceOf[AssemblyItem]
  @scala.inline
  implicit def apply(value: Break): AssemblyItem = value.asInstanceOf[AssemblyItem]
  @scala.inline
  implicit def apply(value: Continue): AssemblyItem = value.asInstanceOf[AssemblyItem]
  @scala.inline
  implicit def apply(value: DecimalNumber): AssemblyItem = value.asInstanceOf[AssemblyItem]
  @scala.inline
  implicit def apply(value: HexLiteral): AssemblyItem = value.asInstanceOf[AssemblyItem]
  @scala.inline
  implicit def apply(value: HexNumber): AssemblyItem = value.asInstanceOf[AssemblyItem]
  @scala.inline
  implicit def apply(value: Identifier): AssemblyItem = value.asInstanceOf[AssemblyItem]
  @scala.inline
  implicit def apply(value: LabelDefinition): AssemblyItem = value.asInstanceOf[AssemblyItem]
  @scala.inline
  implicit def apply(value: NumberLiteral): AssemblyItem = value.asInstanceOf[AssemblyItem]
  @scala.inline
  implicit def apply(value: StringLiteral): AssemblyItem = value.asInstanceOf[AssemblyItem]
  @scala.inline
  implicit def apply(value: SubAssembly): AssemblyItem = value.asInstanceOf[AssemblyItem]
}

