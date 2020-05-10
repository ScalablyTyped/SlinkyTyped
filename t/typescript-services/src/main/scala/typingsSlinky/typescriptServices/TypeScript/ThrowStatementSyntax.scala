package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.ThrowStatementSyntax")
@js.native
class ThrowStatementSyntax protected ()
  extends SyntaxNode
     with IStatementSyntax {
  def this(
    throwKeyword: ISyntaxToken,
    expression: IExpressionSyntax,
    semicolonToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
  var expression: IExpressionSyntax = js.native
  var semicolonToken: ISyntaxToken = js.native
  var throwKeyword: ISyntaxToken = js.native
  /* InferMemberOverrides */
  override def isStatement(): Boolean = js.native
  def update(throwKeyword: ISyntaxToken, expression: IExpressionSyntax, semicolonToken: ISyntaxToken): ThrowStatementSyntax = js.native
  def withExpression(expression: IExpressionSyntax): ThrowStatementSyntax = js.native
  def withSemicolonToken(semicolonToken: ISyntaxToken): ThrowStatementSyntax = js.native
  def withThrowKeyword(throwKeyword: ISyntaxToken): ThrowStatementSyntax = js.native
}

/* static members */
@JSGlobal("TypeScript.ThrowStatementSyntax")
@js.native
object ThrowStatementSyntax extends js.Object {
  def create1(expression: IExpressionSyntax): ThrowStatementSyntax = js.native
}

