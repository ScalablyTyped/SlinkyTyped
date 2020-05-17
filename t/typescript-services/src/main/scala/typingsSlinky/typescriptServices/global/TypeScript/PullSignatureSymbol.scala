package typingsSlinky.typescriptServices.global.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.PullSignatureSymbol")
@js.native
class PullSignatureSymbol protected ()
  extends typingsSlinky.typescriptServices.TypeScript.PullSignatureSymbol {
  def this(kind: typingsSlinky.typescriptServices.TypeScript.PullElementKind) = this()
  def this(kind: typingsSlinky.typescriptServices.TypeScript.PullElementKind, _isDefinition: Boolean) = this()
}

/* static members */
@JSGlobal("TypeScript.PullSignatureSymbol")
@js.native
object PullSignatureSymbol extends js.Object {
  def getSignatureTypeMemberName(
    candidateSignature: typingsSlinky.typescriptServices.TypeScript.PullSignatureSymbol,
    signatures: js.Array[typingsSlinky.typescriptServices.TypeScript.PullSignatureSymbol],
    scopeSymbol: typingsSlinky.typescriptServices.TypeScript.PullSymbol
  ): typingsSlinky.typescriptServices.TypeScript.MemberNameArray = js.native
  def getSignaturesTypeNameEx(
    signatures: js.Array[typingsSlinky.typescriptServices.TypeScript.PullSignatureSymbol],
    prefix: String,
    shortform: Boolean,
    brackets: Boolean
  ): js.Array[typingsSlinky.typescriptServices.TypeScript.MemberName] = js.native
  def getSignaturesTypeNameEx(
    signatures: js.Array[typingsSlinky.typescriptServices.TypeScript.PullSignatureSymbol],
    prefix: String,
    shortform: Boolean,
    brackets: Boolean,
    scopeSymbol: typingsSlinky.typescriptServices.TypeScript.PullSymbol
  ): js.Array[typingsSlinky.typescriptServices.TypeScript.MemberName] = js.native
  def getSignaturesTypeNameEx(
    signatures: js.Array[typingsSlinky.typescriptServices.TypeScript.PullSignatureSymbol],
    prefix: String,
    shortform: Boolean,
    brackets: Boolean,
    scopeSymbol: typingsSlinky.typescriptServices.TypeScript.PullSymbol,
    getPrettyTypeName: Boolean
  ): js.Array[typingsSlinky.typescriptServices.TypeScript.MemberName] = js.native
  def getSignaturesTypeNameEx(
    signatures: js.Array[typingsSlinky.typescriptServices.TypeScript.PullSignatureSymbol],
    prefix: String,
    shortform: Boolean,
    brackets: Boolean,
    scopeSymbol: typingsSlinky.typescriptServices.TypeScript.PullSymbol,
    getPrettyTypeName: Boolean,
    candidateSignature: typingsSlinky.typescriptServices.TypeScript.PullSignatureSymbol
  ): js.Array[typingsSlinky.typescriptServices.TypeScript.MemberName] = js.native
}

