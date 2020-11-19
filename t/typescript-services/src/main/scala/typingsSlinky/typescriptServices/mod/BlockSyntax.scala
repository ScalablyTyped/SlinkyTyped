package typingsSlinky.typescriptServices.mod

import typingsSlinky.typescriptServices.TypeScript.ISyntaxList
import typingsSlinky.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "BlockSyntax")
@js.native
class BlockSyntax protected ()
  extends typingsSlinky.typescriptServices.TypeScript.BlockSyntax {
  def this(
    openBraceToken: ISyntaxToken,
    statements: ISyntaxList,
    closeBraceToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}
/* static members */
@JSImport("typescript-services", "BlockSyntax")
@js.native
object BlockSyntax extends js.Object {
  
  def create(openBraceToken: ISyntaxToken, closeBraceToken: ISyntaxToken): typingsSlinky.typescriptServices.TypeScript.BlockSyntax = js.native
  
  def create1(): typingsSlinky.typescriptServices.TypeScript.BlockSyntax = js.native
}
