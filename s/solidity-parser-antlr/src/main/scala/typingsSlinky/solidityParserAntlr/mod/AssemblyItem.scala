package typingsSlinky.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
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
  def AssemblyAssignment(
    expression: AssemblyExpression,
    names: js.Array[Identifier],
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyAssignment
  ): typingsSlinky.solidityParserAntlr.mod.AssemblyAssignment = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.AssemblyAssignment]
  }
  
  @scala.inline
  def AssemblyBlock(
    operations: js.Array[AssemblyItem],
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyBlock
  ): typingsSlinky.solidityParserAntlr.mod.AssemblyBlock = {
    val __obj = js.Dynamic.literal(operations = operations.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.AssemblyBlock]
  }
  
  @scala.inline
  def AssemblyCall(
    arguments: js.Array[AssemblyExpression],
    functionName: String,
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyCall
  ): typingsSlinky.solidityParserAntlr.mod.AssemblyCall = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], functionName = functionName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.AssemblyCall]
  }
  
  @scala.inline
  def AssemblyFor(`type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyFor): typingsSlinky.solidityParserAntlr.mod.AssemblyFor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.AssemblyFor]
  }
  
  @scala.inline
  def AssemblyFunctionDefinition(`type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyFunctionDefinition): typingsSlinky.solidityParserAntlr.mod.AssemblyFunctionDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.AssemblyFunctionDefinition]
  }
  
  @scala.inline
  def AssemblyIf(`type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyIf): typingsSlinky.solidityParserAntlr.mod.AssemblyIf = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.AssemblyIf]
  }
  
  @scala.inline
  def AssemblyLiteral(`type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyLiteral): typingsSlinky.solidityParserAntlr.mod.AssemblyLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.AssemblyLiteral]
  }
  
  @scala.inline
  def AssemblyLocalDefinition(`type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyLocalDefinition): typingsSlinky.solidityParserAntlr.mod.AssemblyLocalDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.AssemblyLocalDefinition]
  }
  
  @scala.inline
  def AssemblyStackAssignment(`type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyStackAssignment): typingsSlinky.solidityParserAntlr.mod.AssemblyStackAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.AssemblyStackAssignment]
  }
  
  @scala.inline
  def AssemblySwitch(`type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblySwitch): typingsSlinky.solidityParserAntlr.mod.AssemblySwitch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.AssemblySwitch]
  }
  
  @scala.inline
  def Break(`type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.Break): typingsSlinky.solidityParserAntlr.mod.Break = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.Break]
  }
  
  @scala.inline
  def Continue(`type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.Continue): typingsSlinky.solidityParserAntlr.mod.Continue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.Continue]
  }
  
  @scala.inline
  def DecimalNumber(`type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.DecimalNumber, value: String): typingsSlinky.solidityParserAntlr.mod.DecimalNumber = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.DecimalNumber]
  }
  
  @scala.inline
  def HexLiteral(`type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.HexLiteral, value: String): typingsSlinky.solidityParserAntlr.mod.HexLiteral = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.HexLiteral]
  }
  
  @scala.inline
  def HexNumber(`type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.HexNumber, value: String): typingsSlinky.solidityParserAntlr.mod.HexNumber = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.HexNumber]
  }
  
  @scala.inline
  def Identifier(name: String, `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.Identifier): typingsSlinky.solidityParserAntlr.mod.Identifier = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.Identifier]
  }
  
  @scala.inline
  def LabelDefinition(`type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.LabelDefinition): typingsSlinky.solidityParserAntlr.mod.LabelDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.LabelDefinition]
  }
  
  @scala.inline
  def NumberLiteral(number: String, `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.NumberLiteral): typingsSlinky.solidityParserAntlr.mod.NumberLiteral = {
    val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.NumberLiteral]
  }
  
  @scala.inline
  def StringLiteral(`type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.StringLiteral, value: String): typingsSlinky.solidityParserAntlr.mod.StringLiteral = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.StringLiteral]
  }
  
  @scala.inline
  def SubAssembly(`type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.SubAssembly): typingsSlinky.solidityParserAntlr.mod.SubAssembly = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.SubAssembly]
  }
}
