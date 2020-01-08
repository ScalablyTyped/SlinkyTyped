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
  - typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod.BooleanLiteral
  - typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod.NumberLiteral
  - typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod.Identifier
  - typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod.TupleExpression
  - typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod.ElementaryTypeNameExpression
*/
trait PrimaryExpression extends Expression

object PrimaryExpression {
  @scala.inline
  def NumberLiteral(
    number: String,
    `type`: typingsSlinky.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.NumberLiteral,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null,
    subdenomination: wei | szabo | finney | ether | seconds | minutes | hours | days | weeks | years = null
  ): PrimaryExpression = {
    val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (subdenomination != null) __obj.updateDynamic("subdenomination")(subdenomination.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrimaryExpression]
  }
  @scala.inline
  def TupleExpression(
    components: js.Array[Expression],
    isArray: Boolean,
    `type`: typingsSlinky.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.TupleExpression,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): PrimaryExpression = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], isArray = isArray.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrimaryExpression]
  }
  @scala.inline
  def ElementaryTypeNameExpression(
    `type`: typingsSlinky.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.ElementaryTypeNameExpression,
    typeName: ElementaryTypeName,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): PrimaryExpression = {
    val __obj = js.Dynamic.literal(typeName = typeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrimaryExpression]
  }
  @scala.inline
  def BooleanLiteral(
    `type`: typingsSlinky.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.BooleanLiteral,
    value: Boolean,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): PrimaryExpression = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrimaryExpression]
  }
  @scala.inline
  def Identifier(
    name: String,
    `type`: typingsSlinky.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.Identifier,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): PrimaryExpression = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrimaryExpression]
  }
}

