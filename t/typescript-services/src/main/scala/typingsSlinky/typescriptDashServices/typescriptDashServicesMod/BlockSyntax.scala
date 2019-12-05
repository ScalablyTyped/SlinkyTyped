package typingsSlinky.typescriptDashServices.typescriptDashServicesMod

import typingsSlinky.typescriptDashServices.TypeScript.ISyntaxList
import typingsSlinky.typescriptDashServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "BlockSyntax")
@js.native
class BlockSyntax protected ()
  extends typingsSlinky.typescriptDashServices.TypeScript.BlockSyntax {
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
  def create(openBraceToken: ISyntaxToken, closeBraceToken: ISyntaxToken): typingsSlinky.typescriptDashServices.TypeScript.BlockSyntax = js.native
  def create1(): typingsSlinky.typescriptDashServices.TypeScript.BlockSyntax = js.native
}

