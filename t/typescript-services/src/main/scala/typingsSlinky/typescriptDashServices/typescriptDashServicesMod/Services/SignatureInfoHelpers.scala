package typingsSlinky.typescriptDashServices.typescriptDashServicesMod.Services

import typingsSlinky.typescriptDashServices.TypeScript.ICallExpression
import typingsSlinky.typescriptDashServices.TypeScript.PositionedToken
import typingsSlinky.typescriptDashServices.TypeScript.PullSignatureSymbol
import typingsSlinky.typescriptDashServices.TypeScript.PullSymbol
import typingsSlinky.typescriptDashServices.TypeScript.Services.IPartiallyWrittenTypeArgumentListInformation
import typingsSlinky.typescriptDashServices.TypeScript.SourceUnitSyntax
import typingsSlinky.typescriptDashServices.TypeScript.SyntaxTree
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Services.SignatureInfoHelpers")
@js.native
class SignatureInfoHelpers ()
  extends typingsSlinky.typescriptDashServices.TypeScript.Services.SignatureInfoHelpers

/* static members */
@JSImport("typescript-services", "Services.SignatureInfoHelpers")
@js.native
object SignatureInfoHelpers extends js.Object {
  def getActualSignatureInfoFromCallExpression(
    ast: ICallExpression,
    caretPosition: Double,
    typeParameterInformation: IPartiallyWrittenTypeArgumentListInformation
  ): typingsSlinky.typescriptDashServices.TypeScript.Services.ActualSignatureInfo = js.native
  def getActualSignatureInfoFromPartiallyWritenGenericExpression(caretPosition: Double, typeParameterInformation: IPartiallyWrittenTypeArgumentListInformation): typingsSlinky.typescriptDashServices.TypeScript.Services.ActualSignatureInfo = js.native
  def getSignatureInfoFromGenericSymbol(
    symbol: PullSymbol,
    enclosingScopeSymbol: PullSymbol,
    compilerState: typingsSlinky.typescriptDashServices.TypeScript.Services.LanguageServiceCompiler
  ): js.Array[typingsSlinky.typescriptDashServices.TypeScript.Services.FormalSignatureItemInfo] = js.native
  def getSignatureInfoFromSignatureSymbol(
    symbol: PullSymbol,
    signatures: js.Array[PullSignatureSymbol],
    enclosingScopeSymbol: PullSymbol,
    compilerState: typingsSlinky.typescriptDashServices.TypeScript.Services.LanguageServiceCompiler
  ): js.Array[typingsSlinky.typescriptDashServices.TypeScript.Services.FormalSignatureItemInfo] = js.native
  def isInPartiallyWrittenTypeArgumentList(syntaxTree: SyntaxTree, position: Double): IPartiallyWrittenTypeArgumentListInformation = js.native
  def isSignatureHelpBlocker(sourceUnit: SourceUnitSyntax, position: Double): Boolean = js.native
  def isTargetOfObjectCreationExpression(positionedToken: PositionedToken): Boolean = js.native
  /* private */ def moveBackUpTillMatchingTokenKind(token: js.Any, tokenKind: js.Any, matchingTokenKind: js.Any): js.Any = js.native
}

