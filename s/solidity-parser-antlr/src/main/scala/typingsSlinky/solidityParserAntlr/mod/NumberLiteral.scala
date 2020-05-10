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

@js.native
trait NumberLiteral
  extends PrimaryExpression
     with BaseASTNode
     with AssemblyItem {
  var number: String = js.native
  var subdenomination: Null | wei | szabo | finney | ether | seconds | minutes | hours | days | weeks | years = js.native
  @JSName("type")
  var type_NumberLiteral: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.NumberLiteral = js.native
}

object NumberLiteral {
  @scala.inline
  def apply(number: String, `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.NumberLiteral): NumberLiteral = {
    val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberLiteral]
  }
  @scala.inline
  implicit class NumberLiteralOps[Self <: NumberLiteral] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.NumberLiteral): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubdenomination(value: wei | szabo | finney | ether | seconds | minutes | hours | days | weeks | years): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subdenomination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubdenominationNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subdenomination")(null)
        ret
    }
  }
  
}

