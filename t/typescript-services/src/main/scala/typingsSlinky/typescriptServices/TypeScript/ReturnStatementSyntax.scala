package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.ReturnStatementSyntax")
@js.native
class ReturnStatementSyntax protected ()
  extends SyntaxNode
     with IStatementSyntax {
  def this(
    returnKeyword: ISyntaxToken,
    expression: IExpressionSyntax,
    semicolonToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
  var expression: IExpressionSyntax = js.native
  var returnKeyword: ISyntaxToken = js.native
  var semicolonToken: ISyntaxToken = js.native
  /* InferMemberOverrides */
  override def isStatement(): Boolean = js.native
  def update(returnKeyword: ISyntaxToken, expression: IExpressionSyntax, semicolonToken: ISyntaxToken): ReturnStatementSyntax = js.native
  def withExpression(expression: IExpressionSyntax): ReturnStatementSyntax = js.native
  def withReturnKeyword(returnKeyword: ISyntaxToken): ReturnStatementSyntax = js.native
  def withSemicolonToken(semicolonToken: ISyntaxToken): ReturnStatementSyntax = js.native
}

/* static members */
@JSGlobal("TypeScript.ReturnStatementSyntax")
@js.native
object ReturnStatementSyntax extends js.Object {
  def create(returnKeyword: ISyntaxToken, semicolonToken: ISyntaxToken): ReturnStatementSyntax = js.native
  def create1(): ReturnStatementSyntax = js.native
}

