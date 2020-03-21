package typingsSlinky.solidityParserAntlr.mod

import typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.days
import typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ether
import typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.finney
import typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.hours
import typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.minutes
import typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.seconds
import typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.szabo
import typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.weeks
import typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.wei
import typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.years
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.solidityParserAntlr.mod.BooleanLiteral
  - typingsSlinky.solidityParserAntlr.mod.NumberLiteral
  - typingsSlinky.solidityParserAntlr.mod.Identifier
  - typingsSlinky.solidityParserAntlr.mod.TupleExpression
  - typingsSlinky.solidityParserAntlr.mod.ElementaryTypeNameExpression
*/
trait PrimaryExpression extends Expression

object PrimaryExpression {
  @scala.inline
  def BooleanLiteral(
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.BooleanLiteral,
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
  def NumberLiteral(
    number: String,
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.NumberLiteral,
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
  def ElementaryTypeNameExpression(
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ElementaryTypeNameExpression,
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
  def TupleExpression(
    components: js.Array[Expression],
    isArray: Boolean,
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.TupleExpression,
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
  def Identifier(
    name: String,
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.Identifier,
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

