package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.ObjectCreationExpressionSyntax")
@js.native
class ObjectCreationExpressionSyntax protected ()
  extends SyntaxNode
     with IMemberExpressionSyntax {
  def this(
    newKeyword: ISyntaxToken,
    expression: IMemberExpressionSyntax,
    argumentList: ArgumentListSyntax,
    parsedInStrictMode: Boolean
  ) = this()
  var argumentList: ArgumentListSyntax = js.native
  var expression: IMemberExpressionSyntax = js.native
  var newKeyword: ISyntaxToken = js.native
  /* InferMemberOverrides */
  override def isExpression(): Boolean = js.native
  def update(newKeyword: ISyntaxToken, expression: IMemberExpressionSyntax, argumentList: ArgumentListSyntax): ObjectCreationExpressionSyntax = js.native
  def withArgumentList(argumentList: ArgumentListSyntax): ObjectCreationExpressionSyntax = js.native
  def withExpression(expression: IMemberExpressionSyntax): ObjectCreationExpressionSyntax = js.native
  def withNewKeyword(newKeyword: ISyntaxToken): ObjectCreationExpressionSyntax = js.native
}

/* static members */
@JSGlobal("TypeScript.ObjectCreationExpressionSyntax")
@js.native
object ObjectCreationExpressionSyntax extends js.Object {
  def create(newKeyword: ISyntaxToken, expression: IMemberExpressionSyntax): ObjectCreationExpressionSyntax = js.native
  def create1(expression: IMemberExpressionSyntax): ObjectCreationExpressionSyntax = js.native
}

