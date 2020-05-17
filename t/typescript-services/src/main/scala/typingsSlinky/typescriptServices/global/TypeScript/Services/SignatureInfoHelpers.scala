package typingsSlinky.typescriptServices.global.TypeScript.Services

import typingsSlinky.typescriptServices.TypeScript.ICallExpression
import typingsSlinky.typescriptServices.TypeScript.PositionedToken
import typingsSlinky.typescriptServices.TypeScript.PullSignatureSymbol
import typingsSlinky.typescriptServices.TypeScript.PullSymbol
import typingsSlinky.typescriptServices.TypeScript.Services.IPartiallyWrittenTypeArgumentListInformation
import typingsSlinky.typescriptServices.TypeScript.SourceUnitSyntax
import typingsSlinky.typescriptServices.TypeScript.SyntaxTree
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Services.SignatureInfoHelpers")
@js.native
class SignatureInfoHelpers ()
  extends typingsSlinky.typescriptServices.TypeScript.Services.SignatureInfoHelpers

/* static members */
@JSGlobal("TypeScript.Services.SignatureInfoHelpers")
@js.native
object SignatureInfoHelpers extends js.Object {
  def getActualSignatureInfoFromCallExpression(
    ast: ICallExpression,
    caretPosition: Double,
    typeParameterInformation: IPartiallyWrittenTypeArgumentListInformation
  ): typingsSlinky.typescriptServices.TypeScript.Services.ActualSignatureInfo = js.native
  def getActualSignatureInfoFromPartiallyWritenGenericExpression(caretPosition: Double, typeParameterInformation: IPartiallyWrittenTypeArgumentListInformation): typingsSlinky.typescriptServices.TypeScript.Services.ActualSignatureInfo = js.native
  def getSignatureInfoFromGenericSymbol(
    symbol: PullSymbol,
    enclosingScopeSymbol: PullSymbol,
    compilerState: typingsSlinky.typescriptServices.TypeScript.Services.LanguageServiceCompiler
  ): js.Array[typingsSlinky.typescriptServices.TypeScript.Services.FormalSignatureItemInfo] = js.native
  def getSignatureInfoFromSignatureSymbol(
    symbol: PullSymbol,
    signatures: js.Array[PullSignatureSymbol],
    enclosingScopeSymbol: PullSymbol,
    compilerState: typingsSlinky.typescriptServices.TypeScript.Services.LanguageServiceCompiler
  ): js.Array[typingsSlinky.typescriptServices.TypeScript.Services.FormalSignatureItemInfo] = js.native
  def isInPartiallyWrittenTypeArgumentList(syntaxTree: SyntaxTree, position: Double): IPartiallyWrittenTypeArgumentListInformation = js.native
  def isSignatureHelpBlocker(sourceUnit: SourceUnitSyntax, position: Double): Boolean = js.native
  def isTargetOfObjectCreationExpression(positionedToken: PositionedToken): Boolean = js.native
  /* private */ def moveBackUpTillMatchingTokenKind(token: js.Any, tokenKind: js.Any, matchingTokenKind: js.Any): js.Any = js.native
}

