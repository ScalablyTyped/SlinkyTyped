package typingsSlinky.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod

import typingsSlinky.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.days
import typingsSlinky.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.ether
import typingsSlinky.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.finney
import typingsSlinky.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.hours
import typingsSlinky.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.minutes
import typingsSlinky.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.seconds
import typingsSlinky.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.szabo
import typingsSlinky.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.weeks
import typingsSlinky.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.wei
import typingsSlinky.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.years
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod.Identifier
  - typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod.AssemblyBlock
  - typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod.AssemblyExpression
  - typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod.AssemblyLocalDefinition
  - typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod.AssemblyAssignment
  - typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod.AssemblyStackAssignment
  - typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod.LabelDefinition
  - typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod.AssemblySwitch
  - typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod.AssemblyFunctionDefinition
  - typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod.AssemblyFor
  - typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod.AssemblyIf
  - typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod.Break
  - typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod.Continue
  - typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod.SubAssembly
  - typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod.NumberLiteral
  - typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod.StringLiteral
  - typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod.HexNumber
  - typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod.HexLiteral
  - typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod.DecimalNumber
*/
trait AssemblyItem extends ASTNode

object AssemblyItem {
  @scala.inline
  def NumberLiteral(
    number: String,
    `type`: typingsSlinky.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.NumberLiteral,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null,
    subdenomination: wei | szabo | finney | ether | seconds | minutes | hours | days | weeks | years = null
  ): AssemblyItem = {
    val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (subdenomination != null) __obj.updateDynamic("subdenomination")(subdenomination.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  @scala.inline
  def StringLiteral(
    `type`: typingsSlinky.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.StringLiteral,
    value: String,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): AssemblyItem = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  @scala.inline
  def AssemblyFor(
    `type`: typingsSlinky.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.AssemblyFor,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): AssemblyItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  @scala.inline
  def AssemblySwitch(
    `type`: typingsSlinky.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.AssemblySwitch,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): AssemblyItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  @scala.inline
  def HexNumber(
    `type`: typingsSlinky.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.HexNumber,
    value: String,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): AssemblyItem = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  @scala.inline
  def AssemblyBlock(
    operations: js.Array[AssemblyItem],
    `type`: typingsSlinky.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.AssemblyBlock,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): AssemblyItem = {
    val __obj = js.Dynamic.literal(operations = operations.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  @scala.inline
  def DecimalNumber(
    `type`: typingsSlinky.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.DecimalNumber,
    value: String,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): AssemblyItem = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  @scala.inline
  def HexLiteral(
    `type`: typingsSlinky.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.HexLiteral,
    value: String,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): AssemblyItem = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  @scala.inline
  def AssemblyLocalDefinition(
    `type`: typingsSlinky.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.AssemblyLocalDefinition,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): AssemblyItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  @scala.inline
  def AssemblyCall(
    arguments: js.Array[AssemblyExpression],
    functionName: String,
    `type`: typingsSlinky.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.AssemblyCall,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): AssemblyItem = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], functionName = functionName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  @scala.inline
  def AssemblyIf(
    `type`: typingsSlinky.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.AssemblyIf,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): AssemblyItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  @scala.inline
  def AssemblyStackAssignment(
    `type`: typingsSlinky.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.AssemblyStackAssignment,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): AssemblyItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  @scala.inline
  def AssemblyLiteral(
    `type`: typingsSlinky.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.AssemblyLiteral,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): AssemblyItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  @scala.inline
  def LabelDefinition(
    `type`: typingsSlinky.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.LabelDefinition,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): AssemblyItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  @scala.inline
  def AssemblyAssignment(
    expression: AssemblyExpression,
    names: js.Array[Identifier],
    `type`: typingsSlinky.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.AssemblyAssignment,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): AssemblyItem = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  @scala.inline
  def AssemblyFunctionDefinition(
    `type`: typingsSlinky.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.AssemblyFunctionDefinition,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): AssemblyItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  @scala.inline
  def SubAssembly(
    `type`: typingsSlinky.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.SubAssembly,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): AssemblyItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  @scala.inline
  def Continue(
    `type`: typingsSlinky.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.Continue,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): AssemblyItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  @scala.inline
  def Break(
    `type`: typingsSlinky.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.Break,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): AssemblyItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
  @scala.inline
  def Identifier(
    name: String,
    `type`: typingsSlinky.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.Identifier,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): AssemblyItem = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyItem]
  }
}

