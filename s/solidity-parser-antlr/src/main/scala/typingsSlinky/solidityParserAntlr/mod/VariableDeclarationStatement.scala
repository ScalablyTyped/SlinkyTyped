package typingsSlinky.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.solidityParserAntlr.mod.Statement because Already inherited */ @js.native
trait VariableDeclarationStatement
  extends SimpleStatement
     with BaseASTNode
     with ASTNode {
  var initialValue: js.UndefOr[Expression] = js.native
  @JSName("type")
  var type_VariableDeclarationStatement: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.VariableDeclarationStatement = js.native
  var variables: js.Array[ASTNode] = js.native
}

object VariableDeclarationStatement {
  @scala.inline
  def apply(
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.VariableDeclarationStatement,
    variables: js.Array[ASTNode]
  ): VariableDeclarationStatement = {
    val __obj = js.Dynamic.literal(variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariableDeclarationStatement]
  }
  @scala.inline
  implicit class VariableDeclarationStatementOps[Self <: VariableDeclarationStatement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.VariableDeclarationStatement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVariables(value: js.Array[ASTNode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitialValue(value: Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialValue")(js.undefined)
        ret
    }
  }
  
}

