package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.ObjectLiteralExpressionSyntax")
@js.native
class ObjectLiteralExpressionSyntax protected ()
  extends SyntaxNode
     with IPrimaryExpressionSyntax {
  def this(
    openBraceToken: ISyntaxToken,
    propertyAssignments: ISeparatedSyntaxList,
    closeBraceToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
  var closeBraceToken: ISyntaxToken = js.native
  var openBraceToken: ISyntaxToken = js.native
  var propertyAssignments: ISeparatedSyntaxList = js.native
  /* InferMemberOverrides */
  override def isExpression(): Boolean = js.native
  def update(
    openBraceToken: ISyntaxToken,
    propertyAssignments: ISeparatedSyntaxList,
    closeBraceToken: ISyntaxToken
  ): ObjectLiteralExpressionSyntax = js.native
  def withCloseBraceToken(closeBraceToken: ISyntaxToken): ObjectLiteralExpressionSyntax = js.native
  def withOpenBraceToken(openBraceToken: ISyntaxToken): ObjectLiteralExpressionSyntax = js.native
  def withPropertyAssignment(propertyAssignment: IPropertyAssignmentSyntax): ObjectLiteralExpressionSyntax = js.native
  def withPropertyAssignments(propertyAssignments: ISeparatedSyntaxList): ObjectLiteralExpressionSyntax = js.native
}

/* static members */
@JSGlobal("TypeScript.ObjectLiteralExpressionSyntax")
@js.native
object ObjectLiteralExpressionSyntax extends js.Object {
  def create(openBraceToken: ISyntaxToken, closeBraceToken: ISyntaxToken): ObjectLiteralExpressionSyntax = js.native
  def create1(): ObjectLiteralExpressionSyntax = js.native
}

