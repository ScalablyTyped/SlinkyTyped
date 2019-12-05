package typingsSlinky.typescriptDashServices.typescriptDashServicesMod

import typingsSlinky.typescriptDashServices.TypeScript.IModuleElementSyntax
import typingsSlinky.typescriptDashServices.TypeScript.ISyntaxList
import typingsSlinky.typescriptDashServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "SyntaxUtilities")
@js.native
class SyntaxUtilities ()
  extends typingsSlinky.typescriptDashServices.TypeScript.SyntaxUtilities

/* static members */
@JSImport("typescript-services", "SyntaxUtilities")
@js.native
object SyntaxUtilities extends js.Object {
  def containsToken(list: ISyntaxList, kind: typingsSlinky.typescriptDashServices.TypeScript.SyntaxKind): Boolean = js.native
  def getExportKeyword(moduleElement: IModuleElementSyntax): ISyntaxToken = js.native
  def getToken(list: ISyntaxList, kind: typingsSlinky.typescriptDashServices.TypeScript.SyntaxKind): ISyntaxToken = js.native
  def hasExportKeyword(moduleElement: IModuleElementSyntax): Boolean = js.native
  def isAmbientDeclarationSyntax(positionNode: typingsSlinky.typescriptDashServices.TypeScript.PositionedNode): Boolean = js.native
  def isAngleBracket(positionedElement: typingsSlinky.typescriptDashServices.TypeScript.PositionedElement): Boolean = js.native
}

