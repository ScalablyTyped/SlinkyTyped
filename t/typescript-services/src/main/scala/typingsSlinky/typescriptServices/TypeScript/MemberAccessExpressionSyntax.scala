package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.MemberAccessExpressionSyntax")
@js.native
class MemberAccessExpressionSyntax protected ()
  extends SyntaxNode
     with IMemberExpressionSyntax {
  def this(
    expression: IExpressionSyntax,
    dotToken: ISyntaxToken,
    name: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
  var dotToken: ISyntaxToken = js.native
  var expression: IExpressionSyntax = js.native
  var name: ISyntaxToken = js.native
  /* InferMemberOverrides */
  override def isExpression(): Boolean = js.native
  def update(expression: IExpressionSyntax, dotToken: ISyntaxToken, name: ISyntaxToken): MemberAccessExpressionSyntax = js.native
  def withDotToken(dotToken: ISyntaxToken): MemberAccessExpressionSyntax = js.native
  def withExpression(expression: IExpressionSyntax): MemberAccessExpressionSyntax = js.native
  def withName(name: ISyntaxToken): MemberAccessExpressionSyntax = js.native
}

/* static members */
@JSGlobal("TypeScript.MemberAccessExpressionSyntax")
@js.native
object MemberAccessExpressionSyntax extends js.Object {
  def create1(expression: IExpressionSyntax, name: ISyntaxToken): MemberAccessExpressionSyntax = js.native
}

