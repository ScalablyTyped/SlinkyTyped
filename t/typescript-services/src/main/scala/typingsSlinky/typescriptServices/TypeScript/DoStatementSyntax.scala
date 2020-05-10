package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.DoStatementSyntax")
@js.native
class DoStatementSyntax protected ()
  extends SyntaxNode
     with IIterationStatementSyntax {
  def this(
    doKeyword: ISyntaxToken,
    statement: IStatementSyntax,
    whileKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    condition: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    semicolonToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
  var closeParenToken: ISyntaxToken = js.native
  var condition: IExpressionSyntax = js.native
  var doKeyword: ISyntaxToken = js.native
  var openParenToken: ISyntaxToken = js.native
  var semicolonToken: ISyntaxToken = js.native
  var statement: IStatementSyntax = js.native
  var whileKeyword: ISyntaxToken = js.native
  /* InferMemberOverrides */
  override def isStatement(): Boolean = js.native
  def update(
    doKeyword: ISyntaxToken,
    statement: IStatementSyntax,
    whileKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    condition: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    semicolonToken: ISyntaxToken
  ): DoStatementSyntax = js.native
  def withCloseParenToken(closeParenToken: ISyntaxToken): DoStatementSyntax = js.native
  def withCondition(condition: IExpressionSyntax): DoStatementSyntax = js.native
  def withDoKeyword(doKeyword: ISyntaxToken): DoStatementSyntax = js.native
  def withOpenParenToken(openParenToken: ISyntaxToken): DoStatementSyntax = js.native
  def withSemicolonToken(semicolonToken: ISyntaxToken): DoStatementSyntax = js.native
  def withStatement(statement: IStatementSyntax): DoStatementSyntax = js.native
  def withWhileKeyword(whileKeyword: ISyntaxToken): DoStatementSyntax = js.native
}

/* static members */
@JSGlobal("TypeScript.DoStatementSyntax")
@js.native
object DoStatementSyntax extends js.Object {
  def create1(statement: IStatementSyntax, condition: IExpressionSyntax): DoStatementSyntax = js.native
}

