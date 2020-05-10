package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.WhileStatementSyntax")
@js.native
class WhileStatementSyntax protected ()
  extends SyntaxNode
     with IIterationStatementSyntax {
  def this(
    whileKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    condition: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    statement: IStatementSyntax,
    parsedInStrictMode: Boolean
  ) = this()
  var closeParenToken: ISyntaxToken = js.native
  var condition: IExpressionSyntax = js.native
  var openParenToken: ISyntaxToken = js.native
  var statement: IStatementSyntax = js.native
  var whileKeyword: ISyntaxToken = js.native
  /* InferMemberOverrides */
  override def isStatement(): Boolean = js.native
  def update(
    whileKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    condition: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    statement: IStatementSyntax
  ): WhileStatementSyntax = js.native
  def withCloseParenToken(closeParenToken: ISyntaxToken): WhileStatementSyntax = js.native
  def withCondition(condition: IExpressionSyntax): WhileStatementSyntax = js.native
  def withOpenParenToken(openParenToken: ISyntaxToken): WhileStatementSyntax = js.native
  def withStatement(statement: IStatementSyntax): WhileStatementSyntax = js.native
  def withWhileKeyword(whileKeyword: ISyntaxToken): WhileStatementSyntax = js.native
}

/* static members */
@JSGlobal("TypeScript.WhileStatementSyntax")
@js.native
object WhileStatementSyntax extends js.Object {
  def create1(condition: IExpressionSyntax, statement: IStatementSyntax): WhileStatementSyntax = js.native
}

