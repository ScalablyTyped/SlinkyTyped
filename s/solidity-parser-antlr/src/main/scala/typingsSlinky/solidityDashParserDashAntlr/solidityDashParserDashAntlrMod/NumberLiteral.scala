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

trait NumberLiteral
  extends PrimaryExpression
     with BaseASTNode
     with AssemblyItem {
  var number: String
  var subdenomination: Null | wei | szabo | finney | ether | seconds | minutes | hours | days | weeks | years
  @JSName("type")
  var type_NumberLiteral: typingsSlinky.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.NumberLiteral
}

object NumberLiteral {
  @scala.inline
  def apply(
    number: String,
    `type`: typingsSlinky.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.NumberLiteral,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null,
    subdenomination: wei | szabo | finney | ether | seconds | minutes | hours | days | weeks | years = null
  ): NumberLiteral = {
    val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (subdenomination != null) __obj.updateDynamic("subdenomination")(subdenomination.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberLiteral]
  }
}

