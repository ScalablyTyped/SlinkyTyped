package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.InvocationExpressionSyntax")
@js.native
class InvocationExpressionSyntax protected ()
  extends SyntaxNode
     with IMemberExpressionSyntax {
  def this(expression: IMemberExpressionSyntax, argumentList: ArgumentListSyntax, parsedInStrictMode: Boolean) = this()
  var argumentList: ArgumentListSyntax = js.native
  var expression: IMemberExpressionSyntax = js.native
  /* InferMemberOverrides */
  override def isExpression(): Boolean = js.native
  def update(expression: IMemberExpressionSyntax, argumentList: ArgumentListSyntax): InvocationExpressionSyntax = js.native
  def withArgumentList(argumentList: ArgumentListSyntax): InvocationExpressionSyntax = js.native
  def withExpression(expression: IMemberExpressionSyntax): InvocationExpressionSyntax = js.native
}

/* static members */
@JSGlobal("TypeScript.InvocationExpressionSyntax")
@js.native
object InvocationExpressionSyntax extends js.Object {
  def create1(expression: IMemberExpressionSyntax): InvocationExpressionSyntax = js.native
}

