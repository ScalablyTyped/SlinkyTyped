package typingsSlinky.solidityParserAntlr.mod

import typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.`private`
import typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.constant
import typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.default
import typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.external
import typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.internal
import typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.payable
import typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.public
import typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.pure
import typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.view
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionDefinition
  extends BaseASTNode
     with ASTNode {
  var body: js.UndefOr[Block] = js.native
  var isConstructor: Boolean = js.native
  var modifiers: js.Array[ModifierInvocation] = js.native
  var name: js.UndefOr[String] = js.native
  var parameters: js.Array[VariableDeclaration] = js.native
  var returnParameters: js.UndefOr[js.Array[VariableDeclaration]] = js.native
  var stateMutability: js.UndefOr[pure | constant | payable | view] = js.native
  @JSName("type")
  var type_FunctionDefinition: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.FunctionDefinition = js.native
  var visibility: default | external | internal | public | `private` = js.native
}

object FunctionDefinition {
  @scala.inline
  def apply(
    isConstructor: Boolean,
    modifiers: js.Array[ModifierInvocation],
    parameters: js.Array[VariableDeclaration],
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.FunctionDefinition,
    visibility: default | external | internal | public | `private`
  ): FunctionDefinition = {
    val __obj = js.Dynamic.literal(isConstructor = isConstructor.asInstanceOf[js.Any], modifiers = modifiers.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionDefinition]
  }
  @scala.inline
  implicit class FunctionDefinitionOps[Self <: FunctionDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsConstructor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isConstructor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModifiers(value: js.Array[ModifierInvocation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifiers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParameters(value: js.Array[VariableDeclaration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.FunctionDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisibility(value: default | external | internal | public | `private`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBody(value: Block): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnParameters(value: js.Array[VariableDeclaration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withStateMutability(value: pure | constant | payable | view): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateMutability")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateMutability: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateMutability")(js.undefined)
        ret
    }
  }
  
}

