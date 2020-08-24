package typingsSlinky.typescriptServices.mod

import typingsSlinky.typescriptServices.TypeScript.IMemberExpressionSyntax
import typingsSlinky.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "ObjectCreationExpressionSyntax")
@js.native
class ObjectCreationExpressionSyntax protected ()
  extends typingsSlinky.typescriptServices.TypeScript.ObjectCreationExpressionSyntax {
  def this(
    newKeyword: ISyntaxToken,
    expression: IMemberExpressionSyntax,
    argumentList: typingsSlinky.typescriptServices.TypeScript.ArgumentListSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "ObjectCreationExpressionSyntax")
@js.native
object ObjectCreationExpressionSyntax extends js.Object {
  def create(newKeyword: ISyntaxToken, expression: IMemberExpressionSyntax): typingsSlinky.typescriptServices.TypeScript.ObjectCreationExpressionSyntax = js.native
  def create1(expression: IMemberExpressionSyntax): typingsSlinky.typescriptServices.TypeScript.ObjectCreationExpressionSyntax = js.native
}

