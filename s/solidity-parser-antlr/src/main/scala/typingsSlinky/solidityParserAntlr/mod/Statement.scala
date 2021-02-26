package typingsSlinky.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait Statement extends StObject
object Statement {
  
  @scala.inline
  def Block(
    statements: js.Array[Statement],
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.Block
  ): typingsSlinky.solidityParserAntlr.mod.Block = {
    val __obj = js.Dynamic.literal(statements = statements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.Block]
  }
  
  @scala.inline
  def BreakStatement(`type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.BreakStatement): typingsSlinky.solidityParserAntlr.mod.BreakStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.BreakStatement]
  }
  
  @scala.inline
  def ContinueStatement(`type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ContinueStatement): typingsSlinky.solidityParserAntlr.mod.ContinueStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.ContinueStatement]
  }
  
  @scala.inline
  def DoWhileStatement(
    body: Statement,
    condition: Expression,
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.DoWhileStatement
  ): typingsSlinky.solidityParserAntlr.mod.DoWhileStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], condition = condition.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.DoWhileStatement]
  }
  
  @scala.inline
  def EmitStatement(
    eventCall: FunctionCall,
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.EmitStatement
  ): typingsSlinky.solidityParserAntlr.mod.EmitStatement = {
    val __obj = js.Dynamic.literal(eventCall = eventCall.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.EmitStatement]
  }
  
  @scala.inline
  def ExpressionStatement(
    expression: Expression,
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ExpressionStatement
  ): typingsSlinky.solidityParserAntlr.mod.ExpressionStatement = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.ExpressionStatement]
  }
  
  @scala.inline
  def ForStatement(body: Statement, `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ForStatement): typingsSlinky.solidityParserAntlr.mod.ForStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.ForStatement]
  }
  
  @scala.inline
  def IfStatement(
    condition: Expression,
    trueBody: Statement,
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.IfStatement
  ): typingsSlinky.solidityParserAntlr.mod.IfStatement = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], trueBody = trueBody.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.IfStatement]
  }
  
  @scala.inline
  def InlineAssemblyStatement(
    body: AssemblyBlock,
    language: String,
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.InlineAssemblyStatement
  ): typingsSlinky.solidityParserAntlr.mod.InlineAssemblyStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.InlineAssemblyStatement]
  }
  
  @scala.inline
  def ReturnStatement(`type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ReturnStatement): typingsSlinky.solidityParserAntlr.mod.ReturnStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.ReturnStatement]
  }
  
  @scala.inline
  def ThrowStatement(`type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ThrowStatement): typingsSlinky.solidityParserAntlr.mod.ThrowStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.ThrowStatement]
  }
  
  @scala.inline
  def VariableDeclarationStatement(
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.VariableDeclarationStatement,
    variables: js.Array[ASTNode]
  ): typingsSlinky.solidityParserAntlr.mod.VariableDeclarationStatement = {
    val __obj = js.Dynamic.literal(variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.VariableDeclarationStatement]
  }
  
  @scala.inline
  def WhileStatement(`type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.WhileStatement): typingsSlinky.solidityParserAntlr.mod.WhileStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.WhileStatement]
  }
}
