package typingsSlinky.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IfStatement
  extends BaseASTNode
     with ASTNode
     with Statement {
  var condition: Expression = js.native
  var falseBody: js.UndefOr[Statement] = js.native
  var trueBody: Statement = js.native
  @JSName("type")
  var type_IfStatement: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.IfStatement = js.native
}

object IfStatement {
  @scala.inline
  def apply(
    condition: Expression,
    trueBody: Statement,
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.IfStatement
  ): IfStatement = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], trueBody = trueBody.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IfStatement]
  }
  @scala.inline
  implicit class IfStatementOps[Self <: IfStatement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCondition(value: Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrueBody(value: Statement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trueBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.IfStatement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFalseBody(value: Statement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("falseBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFalseBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("falseBody")(js.undefined)
        ret
    }
  }
  
}

