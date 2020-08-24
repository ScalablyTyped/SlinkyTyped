package typingsSlinky.vscodeLanguageclient.mod

import typingsSlinky.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashselectionRange
import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typingsSlinky.vscodeLanguageserverProtocol.protocolSelectionRangeMod.SelectionRangeParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolSelectionRangeMod.SelectionRangeRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient", "SelectionRangeRequest")
@js.native
object SelectionRangeRequest extends js.Object {
  val method: textDocumentSlashselectionRange = js.native
  /** @deprecated  Use SelectionRangeRequest.type */
  val resultType: typingsSlinky.vscodeJsonrpc.mod.ProgressType[js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.SelectionRange]] = js.native
  val `type`: ProtocolRequestType[
    SelectionRangeParams, 
    js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.SelectionRange] | Null, 
    js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.SelectionRange], 
    js.Any, 
    SelectionRangeRegistrationOptions
  ] = js.native
}

