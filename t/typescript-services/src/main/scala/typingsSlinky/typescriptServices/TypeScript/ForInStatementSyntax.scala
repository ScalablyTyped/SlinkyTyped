package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.ForInStatementSyntax")
@js.native
class ForInStatementSyntax protected ()
  extends SyntaxNode
     with IIterationStatementSyntax {
  def this(
    forKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    variableDeclaration: VariableDeclarationSyntax,
    left: IExpressionSyntax,
    inKeyword: ISyntaxToken,
    expression: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    statement: IStatementSyntax,
    parsedInStrictMode: Boolean
  ) = this()
  var closeParenToken: ISyntaxToken = js.native
  var expression: IExpressionSyntax = js.native
  var forKeyword: ISyntaxToken = js.native
  var inKeyword: ISyntaxToken = js.native
  var left: IExpressionSyntax = js.native
  var openParenToken: ISyntaxToken = js.native
  var statement: IStatementSyntax = js.native
  var variableDeclaration: VariableDeclarationSyntax = js.native
  /* InferMemberOverrides */
  override def isStatement(): Boolean = js.native
  def update(
    forKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    variableDeclaration: VariableDeclarationSyntax,
    left: IExpressionSyntax,
    inKeyword: ISyntaxToken,
    expression: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    statement: IStatementSyntax
  ): ForInStatementSyntax = js.native
  def withCloseParenToken(closeParenToken: ISyntaxToken): ForInStatementSyntax = js.native
  def withExpression(expression: IExpressionSyntax): ForInStatementSyntax = js.native
  def withForKeyword(forKeyword: ISyntaxToken): ForInStatementSyntax = js.native
  def withInKeyword(inKeyword: ISyntaxToken): ForInStatementSyntax = js.native
  def withLeft(left: IExpressionSyntax): ForInStatementSyntax = js.native
  def withOpenParenToken(openParenToken: ISyntaxToken): ForInStatementSyntax = js.native
  def withStatement(statement: IStatementSyntax): ForInStatementSyntax = js.native
  def withVariableDeclaration(variableDeclaration: VariableDeclarationSyntax): ForInStatementSyntax = js.native
}

/* static members */
@JSGlobal("TypeScript.ForInStatementSyntax")
@js.native
object ForInStatementSyntax extends js.Object {
  def create(
    forKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    inKeyword: ISyntaxToken,
    expression: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    statement: IStatementSyntax
  ): ForInStatementSyntax = js.native
  def create1(expression: IExpressionSyntax, statement: IStatementSyntax): ForInStatementSyntax = js.native
}

