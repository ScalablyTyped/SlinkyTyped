package typingsSlinky.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForStatement
  extends BaseASTNode
     with ASTNode
     with Statement {
  var body: Statement = js.native
  var conditionExpression: js.UndefOr[Expression] = js.native
  var initExpression: js.UndefOr[SimpleStatement] = js.native
  var loopExpression: js.UndefOr[ExpressionStatement] = js.native
  @JSName("type")
  var type_ForStatement: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ForStatement = js.native
}

object ForStatement {
  @scala.inline
  def apply(body: Statement, `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ForStatement): ForStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForStatement]
  }
  @scala.inline
  implicit class ForStatementOps[Self <: ForStatement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody(value: Statement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ForStatement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConditionExpression(value: Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditionExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConditionExpression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditionExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withInitExpression(value: SimpleStatement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitExpression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withLoopExpression(value: ExpressionStatement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loopExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoopExpression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loopExpression")(js.undefined)
        ret
    }
  }
  
}

