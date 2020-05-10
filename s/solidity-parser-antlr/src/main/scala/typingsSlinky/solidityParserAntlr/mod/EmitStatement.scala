package typingsSlinky.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmitStatement
  extends BaseASTNode
     with ASTNode
     with Statement {
  var eventCall: FunctionCall = js.native
  @JSName("type")
  var type_EmitStatement: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.EmitStatement = js.native
}

object EmitStatement {
  @scala.inline
  def apply(
    eventCall: FunctionCall,
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.EmitStatement
  ): EmitStatement = {
    val __obj = js.Dynamic.literal(eventCall = eventCall.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmitStatement]
  }
  @scala.inline
  implicit class EmitStatementOps[Self <: EmitStatement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEventCall(value: FunctionCall): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventCall")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.EmitStatement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

