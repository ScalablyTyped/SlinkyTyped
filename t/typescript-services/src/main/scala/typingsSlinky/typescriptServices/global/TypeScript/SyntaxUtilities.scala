package typingsSlinky.typescriptServices.global.TypeScript

import typingsSlinky.typescriptServices.TypeScript.IModuleElementSyntax
import typingsSlinky.typescriptServices.TypeScript.ISyntaxList
import typingsSlinky.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.SyntaxUtilities")
@js.native
class SyntaxUtilities ()
  extends typingsSlinky.typescriptServices.TypeScript.SyntaxUtilities
/* static members */
@JSGlobal("TypeScript.SyntaxUtilities")
@js.native
object SyntaxUtilities extends js.Object {
  
  def containsToken(list: ISyntaxList, kind: typingsSlinky.typescriptServices.TypeScript.SyntaxKind): Boolean = js.native
  
  def getExportKeyword(moduleElement: IModuleElementSyntax): ISyntaxToken = js.native
  
  def getToken(list: ISyntaxList, kind: typingsSlinky.typescriptServices.TypeScript.SyntaxKind): ISyntaxToken = js.native
  
  def hasExportKeyword(moduleElement: IModuleElementSyntax): Boolean = js.native
  
  def isAmbientDeclarationSyntax(positionNode: typingsSlinky.typescriptServices.TypeScript.PositionedNode): Boolean = js.native
  
  def isAngleBracket(positionedElement: typingsSlinky.typescriptServices.TypeScript.PositionedElement): Boolean = js.native
}
