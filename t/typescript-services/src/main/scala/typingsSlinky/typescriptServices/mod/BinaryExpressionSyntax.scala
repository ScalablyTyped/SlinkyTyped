package typingsSlinky.typescriptServices.mod

import typingsSlinky.typescriptServices.TypeScript.IExpressionSyntax
import typingsSlinky.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "BinaryExpressionSyntax")
@js.native
class BinaryExpressionSyntax protected ()
  extends typingsSlinky.typescriptServices.TypeScript.BinaryExpressionSyntax {
  def this(
    kind: typingsSlinky.typescriptServices.TypeScript.SyntaxKind,
    left: IExpressionSyntax,
    operatorToken: ISyntaxToken,
    right: IExpressionSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}

