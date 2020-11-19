package typingsSlinky.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def AssemblySwitch(`type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblySwitch): AssemblyItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  
  @scala.inline
  def AssemblyLiteral(`type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyLiteral): AssemblyItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  
  @scala.inline
  def NumberLiteral(number: String, `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.NumberLiteral): AssemblyItem = {
    val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  
  @scala.inline
  def AssemblyLocalDefinition(`type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyLocalDefinition): AssemblyItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  
  @scala.inline
  def LabelDefinition(`type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.LabelDefinition): AssemblyItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  
  @scala.inline
  def HexNumber(`type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.HexNumber, value: String): AssemblyItem = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  
  @scala.inline
  def SubAssembly(`type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.SubAssembly): AssemblyItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  
  @scala.inline
  def AssemblyCall(
    arguments: js.Array[AssemblyExpression],
    functionName: String,
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyCall
  ): AssemblyItem = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], functionName = functionName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  
  @scala.inline
  def AssemblyAssignment(
    expression: AssemblyExpression,
    names: js.Array[Identifier],
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyAssignment
  ): AssemblyItem = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  
  @scala.inline
  def DecimalNumber(`type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.DecimalNumber, value: String): AssemblyItem = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  
  @scala.inline
  def Continue(`type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.Continue): AssemblyItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  
  @scala.inline
  def AssemblyIf(`type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyIf): AssemblyItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  
  @scala.inline
  def StringLiteral(`type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.StringLiteral, value: String): AssemblyItem = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  
  @scala.inline
  def AssemblyFunctionDefinition(`type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyFunctionDefinition): AssemblyItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  
  @scala.inline
  def AssemblyStackAssignment(`type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyStackAssignment): AssemblyItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  
  @scala.inline
  def HexLiteral(`type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.HexLiteral, value: String): AssemblyItem = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  
  @scala.inline
  def AssemblyBlock(
    operations: js.Array[AssemblyItem],
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyBlock
  ): AssemblyItem = {
    val __obj = js.Dynamic.literal(operations = operations.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  
  @scala.inline
  def Break(`type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.Break): AssemblyItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  
  @scala.inline
  def AssemblyFor(`type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyFor): AssemblyItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  
  @scala.inline
  def Identifier(name: String, `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.Identifier): AssemblyItem = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
}
