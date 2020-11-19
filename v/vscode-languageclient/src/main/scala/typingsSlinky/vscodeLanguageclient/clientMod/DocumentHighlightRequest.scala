package typingsSlinky.vscodeLanguageclient.clientMod

import typingsSlinky.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashdocumentHighlight
import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.DocumentHighlightParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.DocumentHighlightRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageclient/lib/client", "DocumentHighlightRequest")
@js.native
object DocumentHighlightRequest extends js.Object {
  
  val method: textDocumentSlashdocumentHighlight = js.native
  
  /** @deprecated Use DocumentHighlightRequest.type */
  val resultType: typingsSlinky.vscodeJsonrpc.mod.ProgressType[js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.DocumentHighlight]] = js.native
  
  val `type`: ProtocolRequestType[
    DocumentHighlightParams, 
    js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.DocumentHighlight] | Null, 
    js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.DocumentHighlight], 
    Unit, 
    DocumentHighlightRegistrationOptions
  ] = js.native
}
