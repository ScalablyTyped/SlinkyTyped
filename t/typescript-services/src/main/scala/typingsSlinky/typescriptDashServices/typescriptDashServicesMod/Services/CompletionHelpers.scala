package typingsSlinky.typescriptDashServices.typescriptDashServicesMod.Services

import typingsSlinky.typescriptDashServices.TypeScript.PullVisibleSymbolsInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Services.CompletionHelpers")
@js.native
class CompletionHelpers ()
  extends typingsSlinky.typescriptDashServices.TypeScript.Services.CompletionHelpers

/* static members */
@JSImport("typescript-services", "Services.CompletionHelpers")
@js.native
object CompletionHelpers extends js.Object {
  def filterContextualMembersList(
    contextualMemberSymbols: js.Array[typingsSlinky.typescriptDashServices.TypeScript.PullSymbol],
    existingMembers: PullVisibleSymbolsInfo,
    fileName: String,
    position: Double
  ): js.Array[typingsSlinky.typescriptDashServices.TypeScript.PullSymbol] = js.native
  def getContainingObjectLiteralApplicableForCompletion(sourceUnit: typingsSlinky.typescriptDashServices.TypeScript.SourceUnitSyntax, position: Double): typingsSlinky.typescriptDashServices.TypeScript.PositionedElement = js.native
  def getNonIdentifierCompleteTokenOnLeft(sourceUnit: typingsSlinky.typescriptDashServices.TypeScript.SourceUnitSyntax, position: Double): typingsSlinky.typescriptDashServices.TypeScript.PositionedToken = js.native
  /* private */ def getSpan(ast: js.Any): js.Any = js.native
  def getValidCompletionEntryDisplayName(displayName: String): String = js.native
  def isCompletionListBlocker(sourceUnit: typingsSlinky.typescriptDashServices.TypeScript.SourceUnitSyntax, position: Double): Boolean = js.native
  def isIdentifierDefinitionLocation(sourceUnit: typingsSlinky.typescriptDashServices.TypeScript.SourceUnitSyntax, position: Double): Boolean = js.native
  def isRightOfIllegalDot(sourceUnit: typingsSlinky.typescriptDashServices.TypeScript.SourceUnitSyntax, position: Double): Boolean = js.native
  /* private */ def symbolDeclarationIntersectsPosition(symbol: js.Any, fileName: js.Any, position: js.Any): js.Any = js.native
}

