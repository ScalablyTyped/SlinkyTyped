package typingsSlinky.typescriptDashServices.typescriptDashServicesMod.Services

import typingsSlinky.typescriptDashServices.TypeScript.ICallExpression
import typingsSlinky.typescriptDashServices.TypeScript.Services.IPartiallyWrittenTypeArgumentListInformation
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
    symbol: typingsSlinky.typescriptDashServices.TypeScript.PullSymbol,
    enclosingScopeSymbol: typingsSlinky.typescriptDashServices.TypeScript.PullSymbol,
    compilerState: typingsSlinky.typescriptDashServices.TypeScript.Services.LanguageServiceCompiler
  ): js.Array[typingsSlinky.typescriptDashServices.TypeScript.Services.FormalSignatureItemInfo] = js.native
  def getSignatureInfoFromSignatureSymbol(
    symbol: typingsSlinky.typescriptDashServices.TypeScript.PullSymbol,
    signatures: js.Array[typingsSlinky.typescriptDashServices.TypeScript.PullSignatureSymbol],
    enclosingScopeSymbol: typingsSlinky.typescriptDashServices.TypeScript.PullSymbol,
    compilerState: typingsSlinky.typescriptDashServices.TypeScript.Services.LanguageServiceCompiler
  ): js.Array[typingsSlinky.typescriptDashServices.TypeScript.Services.FormalSignatureItemInfo] = js.native
  def isInPartiallyWrittenTypeArgumentList(syntaxTree: typingsSlinky.typescriptDashServices.TypeScript.SyntaxTree, position: Double): IPartiallyWrittenTypeArgumentListInformation = js.native
  def isSignatureHelpBlocker(sourceUnit: typingsSlinky.typescriptDashServices.TypeScript.SourceUnitSyntax, position: Double): Boolean = js.native
  def isTargetOfObjectCreationExpression(positionedToken: typingsSlinky.typescriptDashServices.TypeScript.PositionedToken): Boolean = js.native
  /* private */ def moveBackUpTillMatchingTokenKind(token: js.Any, tokenKind: js.Any, matchingTokenKind: js.Any): js.Any = js.native
}

