package typingsSlinky.typescriptServices.global.TypeScript

import typingsSlinky.typescriptServices.TypeScript.ISeparatedSyntaxList
import typingsSlinky.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.ObjectLiteralExpressionSyntax")
@js.native
class ObjectLiteralExpressionSyntax protected ()
  extends typingsSlinky.typescriptServices.TypeScript.ObjectLiteralExpressionSyntax {
  def this(
    openBraceToken: ISyntaxToken,
    propertyAssignments: ISeparatedSyntaxList,
    closeBraceToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSGlobal("TypeScript.ObjectLiteralExpressionSyntax")
@js.native
object ObjectLiteralExpressionSyntax extends js.Object {
  def create(openBraceToken: ISyntaxToken, closeBraceToken: ISyntaxToken): typingsSlinky.typescriptServices.TypeScript.ObjectLiteralExpressionSyntax = js.native
  def create1(): typingsSlinky.typescriptServices.TypeScript.ObjectLiteralExpressionSyntax = js.native
}

