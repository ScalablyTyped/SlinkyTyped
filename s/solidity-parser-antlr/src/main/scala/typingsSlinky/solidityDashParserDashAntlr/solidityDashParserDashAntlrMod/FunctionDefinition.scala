package typingsSlinky.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod

import typingsSlinky.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.`private`
import typingsSlinky.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.constant
import typingsSlinky.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.default
import typingsSlinky.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.external
import typingsSlinky.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.internal
import typingsSlinky.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.payable
import typingsSlinky.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.public
import typingsSlinky.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.pure
import typingsSlinky.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.view
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionDefinition
  extends BaseASTNode
     with ASTNode {
  var body: js.UndefOr[Block] = js.undefined
  var isConstructor: Boolean
  var modifiers: js.Array[ModifierInvocation]
  var name: js.UndefOr[String] = js.undefined
  var parameters: js.Array[VariableDeclaration]
  var returnParameters: js.UndefOr[js.Array[VariableDeclaration]] = js.undefined
  var stateMutability: js.UndefOr[pure | constant | payable | view] = js.undefined
  @JSName("type")
  var type_FunctionDefinition: typingsSlinky.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.FunctionDefinition
  var visibility: default | external | internal | public | `private`
}

object FunctionDefinition {
  @scala.inline
  def apply(
    isConstructor: Boolean,
    modifiers: js.Array[ModifierInvocation],
    parameters: js.Array[VariableDeclaration],
    `type`: typingsSlinky.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.FunctionDefinition,
    visibility: default | external | internal | public | `private`,
    body: Block = null,
    loc: Location = null,
    name: String = null,
    range: js.Tuple2[Double, Double] = null,
    returnParameters: js.Array[VariableDeclaration] = null,
    stateMutability: pure | constant | payable | view = null
  ): FunctionDefinition = {
    val __obj = js.Dynamic.literal(isConstructor = isConstructor.asInstanceOf[js.Any], modifiers = modifiers.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (returnParameters != null) __obj.updateDynamic("returnParameters")(returnParameters.asInstanceOf[js.Any])
    if (stateMutability != null) __obj.updateDynamic("stateMutability")(stateMutability.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionDefinition]
  }
}

