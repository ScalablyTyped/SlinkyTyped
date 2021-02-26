package typingsSlinky.typescriptServices.mod.Services

import typingsSlinky.typescriptServices.TypeScript.PositionedElement
import typingsSlinky.typescriptServices.TypeScript.PositionedToken
import typingsSlinky.typescriptServices.TypeScript.PullSymbol
import typingsSlinky.typescriptServices.TypeScript.PullVisibleSymbolsInfo
import typingsSlinky.typescriptServices.TypeScript.SourceUnitSyntax
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "Services.CompletionHelpers")
@js.native
class CompletionHelpers ()
  extends typingsSlinky.typescriptServices.TypeScript.Services.CompletionHelpers
object CompletionHelpers {
  
  /* static member */
  @JSImport("typescript-services", "Services.CompletionHelpers.filterContextualMembersList")
  @js.native
  def filterContextualMembersList(
    contextualMemberSymbols: js.Array[PullSymbol],
    existingMembers: PullVisibleSymbolsInfo,
    fileName: String,
    position: Double
  ): js.Array[PullSymbol] = js.native
  
  /* static member */
  @JSImport("typescript-services", "Services.CompletionHelpers.getContainingObjectLiteralApplicableForCompletion")
  @js.native
  def getContainingObjectLiteralApplicableForCompletion(sourceUnit: SourceUnitSyntax, position: Double): PositionedElement = js.native
  
  /* static member */
  @JSImport("typescript-services", "Services.CompletionHelpers.getNonIdentifierCompleteTokenOnLeft")
  @js.native
  def getNonIdentifierCompleteTokenOnLeft(sourceUnit: SourceUnitSyntax, position: Double): PositionedToken = js.native
  
  /* static member */
  @JSImport("typescript-services", "Services.CompletionHelpers.getSpan")
  @js.native
  def getSpan(ast: js.Any): js.Any = js.native
  
  /* static member */
  @JSImport("typescript-services", "Services.CompletionHelpers.getValidCompletionEntryDisplayName")
  @js.native
  def getValidCompletionEntryDisplayName(displayName: String): String = js.native
  
  /* static member */
  @JSImport("typescript-services", "Services.CompletionHelpers.isCompletionListBlocker")
  @js.native
  def isCompletionListBlocker(sourceUnit: SourceUnitSyntax, position: Double): Boolean = js.native
  
  /* static member */
  @JSImport("typescript-services", "Services.CompletionHelpers.isIdentifierDefinitionLocation")
  @js.native
  def isIdentifierDefinitionLocation(sourceUnit: SourceUnitSyntax, position: Double): Boolean = js.native
  
  /* static member */
  @JSImport("typescript-services", "Services.CompletionHelpers.isRightOfIllegalDot")
  @js.native
  def isRightOfIllegalDot(sourceUnit: SourceUnitSyntax, position: Double): Boolean = js.native
  
  /* static member */
  @JSImport("typescript-services", "Services.CompletionHelpers.symbolDeclarationIntersectsPosition")
  @js.native
  def symbolDeclarationIntersectsPosition(symbol: js.Any, fileName: js.Any, position: js.Any): js.Any = js.native
}
