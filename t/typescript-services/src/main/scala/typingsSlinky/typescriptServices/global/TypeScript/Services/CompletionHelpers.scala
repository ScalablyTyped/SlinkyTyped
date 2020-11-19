package typingsSlinky.typescriptServices.global.TypeScript.Services

import typingsSlinky.typescriptServices.TypeScript.PositionedElement
import typingsSlinky.typescriptServices.TypeScript.PositionedToken
import typingsSlinky.typescriptServices.TypeScript.PullSymbol
import typingsSlinky.typescriptServices.TypeScript.PullVisibleSymbolsInfo
import typingsSlinky.typescriptServices.TypeScript.SourceUnitSyntax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.Services.CompletionHelpers")
@js.native
class CompletionHelpers ()
  extends typingsSlinky.typescriptServices.TypeScript.Services.CompletionHelpers
/* static members */
@JSGlobal("TypeScript.Services.CompletionHelpers")
@js.native
object CompletionHelpers extends js.Object {
  
  def filterContextualMembersList(
    contextualMemberSymbols: js.Array[PullSymbol],
    existingMembers: PullVisibleSymbolsInfo,
    fileName: String,
    position: Double
  ): js.Array[PullSymbol] = js.native
  
  def getContainingObjectLiteralApplicableForCompletion(sourceUnit: SourceUnitSyntax, position: Double): PositionedElement = js.native
  
  def getNonIdentifierCompleteTokenOnLeft(sourceUnit: SourceUnitSyntax, position: Double): PositionedToken = js.native
  
  /* private */ def getSpan(ast: js.Any): js.Any = js.native
  
  def getValidCompletionEntryDisplayName(displayName: String): String = js.native
  
  def isCompletionListBlocker(sourceUnit: SourceUnitSyntax, position: Double): Boolean = js.native
  
  def isIdentifierDefinitionLocation(sourceUnit: SourceUnitSyntax, position: Double): Boolean = js.native
  
  def isRightOfIllegalDot(sourceUnit: SourceUnitSyntax, position: Double): Boolean = js.native
  
  /* private */ def symbolDeclarationIntersectsPosition(symbol: js.Any, fileName: js.Any, position: js.Any): js.Any = js.native
}
