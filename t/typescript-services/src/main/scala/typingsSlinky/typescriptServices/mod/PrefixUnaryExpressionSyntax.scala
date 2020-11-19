package typingsSlinky.typescriptServices.mod

import typingsSlinky.typescriptServices.TypeScript.ISyntaxToken
import typingsSlinky.typescriptServices.TypeScript.IUnaryExpressionSyntax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "PrefixUnaryExpressionSyntax")
@js.native
class PrefixUnaryExpressionSyntax protected ()
  extends typingsSlinky.typescriptServices.TypeScript.PrefixUnaryExpressionSyntax {
  def this(
    kind: typingsSlinky.typescriptServices.TypeScript.SyntaxKind,
    operatorToken: ISyntaxToken,
    operand: IUnaryExpressionSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}
