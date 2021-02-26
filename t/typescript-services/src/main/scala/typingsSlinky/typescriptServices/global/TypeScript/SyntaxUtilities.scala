package typingsSlinky.typescriptServices.global.TypeScript

import typingsSlinky.typescriptServices.TypeScript.IModuleElementSyntax
import typingsSlinky.typescriptServices.TypeScript.ISyntaxList
import typingsSlinky.typescriptServices.TypeScript.ISyntaxToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.SyntaxUtilities")
@js.native
class SyntaxUtilities ()
  extends typingsSlinky.typescriptServices.TypeScript.SyntaxUtilities
object SyntaxUtilities {
  
  /* static member */
  @JSGlobal("TypeScript.SyntaxUtilities.containsToken")
  @js.native
  def containsToken(list: ISyntaxList, kind: typingsSlinky.typescriptServices.TypeScript.SyntaxKind): Boolean = js.native
  
  /* static member */
  @JSGlobal("TypeScript.SyntaxUtilities.getExportKeyword")
  @js.native
  def getExportKeyword(moduleElement: IModuleElementSyntax): ISyntaxToken = js.native
  
  /* static member */
  @JSGlobal("TypeScript.SyntaxUtilities.getToken")
  @js.native
  def getToken(list: ISyntaxList, kind: typingsSlinky.typescriptServices.TypeScript.SyntaxKind): ISyntaxToken = js.native
  
  /* static member */
  @JSGlobal("TypeScript.SyntaxUtilities.hasExportKeyword")
  @js.native
  def hasExportKeyword(moduleElement: IModuleElementSyntax): Boolean = js.native
  
  /* static member */
  @JSGlobal("TypeScript.SyntaxUtilities.isAmbientDeclarationSyntax")
  @js.native
  def isAmbientDeclarationSyntax(positionNode: typingsSlinky.typescriptServices.TypeScript.PositionedNode): Boolean = js.native
  
  /* static member */
  @JSGlobal("TypeScript.SyntaxUtilities.isAngleBracket")
  @js.native
  def isAngleBracket(positionedElement: typingsSlinky.typescriptServices.TypeScript.PositionedElement): Boolean = js.native
}
