package typingsSlinky.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.solidityParserAntlr.mod.IfStatement
  - typingsSlinky.solidityParserAntlr.mod.WhileStatement
  - typingsSlinky.solidityParserAntlr.mod.ForStatement
  - typingsSlinky.solidityParserAntlr.mod.Block
  - typingsSlinky.solidityParserAntlr.mod.InlineAssemblyStatement
  - typingsSlinky.solidityParserAntlr.mod.DoWhileStatement
  - typingsSlinky.solidityParserAntlr.mod.ContinueStatement
  - typingsSlinky.solidityParserAntlr.mod.BreakStatement
  - typingsSlinky.solidityParserAntlr.mod.ReturnStatement
  - typingsSlinky.solidityParserAntlr.mod.EmitStatement
  - typingsSlinky.solidityParserAntlr.mod.ThrowStatement
  - typingsSlinky.solidityParserAntlr.mod.SimpleStatement
  - typingsSlinky.solidityParserAntlr.mod.VariableDeclarationStatement
*/
trait Statement extends js.Object

object Statement {
  @scala.inline
  def EmitStatement(
    eventCall: FunctionCall,
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.EmitStatement
  ): Statement = {
    val __obj = js.Dynamic.literal(eventCall = eventCall.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def ReturnStatement(`type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ReturnStatement): Statement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def InlineAssemblyStatement(
    body: AssemblyBlock,
    language: String,
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.InlineAssemblyStatement
  ): Statement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def ForStatement(body: Statement, `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ForStatement): Statement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def WhileStatement(`type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.WhileStatement): Statement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def Block(
    statements: js.Array[Statement],
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.Block
  ): Statement = {
    val __obj = js.Dynamic.literal(statements = statements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def VariableDeclarationStatement(
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.VariableDeclarationStatement,
    variables: js.Array[ASTNode]
  ): Statement = {
    val __obj = js.Dynamic.literal(variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def IfStatement(
    condition: Expression,
    trueBody: Statement,
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.IfStatement
  ): Statement = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], trueBody = trueBody.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def ExpressionStatement(
    expression: Expression,
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ExpressionStatement
  ): Statement = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def ContinueStatement(`type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ContinueStatement): Statement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def DoWhileStatement(
    body: Statement,
    condition: Expression,
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.DoWhileStatement
  ): Statement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], condition = condition.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def BreakStatement(`type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.BreakStatement): Statement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def ThrowStatement(`type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ThrowStatement): Statement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
}

