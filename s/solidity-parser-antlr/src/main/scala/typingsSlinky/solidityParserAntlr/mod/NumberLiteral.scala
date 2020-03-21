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

trait NumberLiteral
  extends PrimaryExpression
     with BaseASTNode
     with AssemblyItem {
  var number: String
  var subdenomination: Null | wei | szabo | finney | ether | seconds | minutes | hours | days | weeks | years
  @JSName("type")
  var type_NumberLiteral: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.NumberLiteral
}

object NumberLiteral {
  @scala.inline
  def apply(
    number: String,
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.NumberLiteral,
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

