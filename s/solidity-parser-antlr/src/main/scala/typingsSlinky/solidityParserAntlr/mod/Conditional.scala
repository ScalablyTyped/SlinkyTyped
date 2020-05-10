package typingsSlinky.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.solidityParserAntlr.mod.ASTNode because Already inherited */ @js.native
trait Conditional
  extends Expression
     with BaseASTNode {
  var falseExpression: ASTNode = js.native
  var trueExpression: ASTNode = js.native
  @JSName("type")
  var type_Conditional: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.Conditional = js.native
}

object Conditional {
  @scala.inline
  def apply(
    falseExpression: ASTNode,
    trueExpression: ASTNode,
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.Conditional
  ): Conditional = {
    val __obj = js.Dynamic.literal(falseExpression = falseExpression.asInstanceOf[js.Any], trueExpression = trueExpression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Conditional]
  }
  @scala.inline
  implicit class ConditionalOps[Self <: Conditional] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFalseExpression(value: ASTNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("falseExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrueExpression(value: ASTNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trueExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.Conditional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

