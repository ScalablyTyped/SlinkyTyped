package typingsSlinky.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StateVariableDeclaration
  extends BaseASTNode
     with ASTNode {
  var initialValue: js.UndefOr[Expression] = js.native
  @JSName("type")
  var type_StateVariableDeclaration: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.StateVariableDeclaration = js.native
  var variables: js.Array[VariableDeclaration] = js.native
}

object StateVariableDeclaration {
  @scala.inline
  def apply(
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.StateVariableDeclaration,
    variables: js.Array[VariableDeclaration]
  ): StateVariableDeclaration = {
    val __obj = js.Dynamic.literal(variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateVariableDeclaration]
  }
  @scala.inline
  implicit class StateVariableDeclarationOps[Self <: StateVariableDeclaration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.StateVariableDeclaration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVariables(value: js.Array[VariableDeclaration]): Self = {
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

