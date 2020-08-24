package typingsSlinky.vscodeLanguageserverProtocol.protocolMod

import typingsSlinky.vscodeJsonrpc.mod.ProgressType
import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashdocumentLink
import typingsSlinky.vscodeLanguageserverTypes.mod.DocumentLink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol/lib/protocol", "DocumentLinkRequest")
@js.native
object DocumentLinkRequest extends js.Object {
  val method: textDocumentSlashdocumentLink = js.native
  /** @deprecated Use DocumentLinkRequest.type */
  val resultType: ProgressType[js.Array[DocumentLink]] = js.native
  val `type`: ProtocolRequestType[
    DocumentLinkParams, 
    js.Array[DocumentLink] | Null, 
    js.Array[DocumentLink], 
    Unit, 
    DocumentLinkRegistrationOptions
  ] = js.native
}

