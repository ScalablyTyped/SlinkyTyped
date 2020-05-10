package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.WithStatementSyntax")
@js.native
class WithStatementSyntax protected ()
  extends SyntaxNode
     with IStatementSyntax {
  def this(
    withKeyword: ISyntaxToken,
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
  var withKeyword: ISyntaxToken = js.native
  /* InferMemberOverrides */
  override def isStatement(): Boolean = js.native
  def update(
    withKeyword: ISyntaxToken,
    openParenToken: ISyntaxToken,
    condition: IExpressionSyntax,
    closeParenToken: ISyntaxToken,
    statement: IStatementSyntax
  ): WithStatementSyntax = js.native
  def withCloseParenToken(closeParenToken: ISyntaxToken): WithStatementSyntax = js.native
  def withCondition(condition: IExpressionSyntax): WithStatementSyntax = js.native
  def withOpenParenToken(openParenToken: ISyntaxToken): WithStatementSyntax = js.native
  def withStatement(statement: IStatementSyntax): WithStatementSyntax = js.native
  def withWithKeyword(withKeyword: ISyntaxToken): WithStatementSyntax = js.native
}

/* static members */
@JSGlobal("TypeScript.WithStatementSyntax")
@js.native
object WithStatementSyntax extends js.Object {
  def create1(condition: IExpressionSyntax, statement: IStatementSyntax): WithStatementSyntax = js.native
}

