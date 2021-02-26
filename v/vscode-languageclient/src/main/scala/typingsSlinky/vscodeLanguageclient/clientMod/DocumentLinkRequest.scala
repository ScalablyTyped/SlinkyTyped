package typingsSlinky.vscodeLanguageclient.clientMod

import typingsSlinky.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashdocumentLink
import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.DocumentLinkParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.DocumentLinkRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DocumentLinkRequest {
  
  @JSImport("vscode-languageclient/lib/client", "DocumentLinkRequest.method")
  @js.native
  val method: textDocumentSlashdocumentLink = js.native
  
  /** @deprecated Use DocumentLinkRequest.type */
  @JSImport("vscode-languageclient/lib/client", "DocumentLinkRequest.resultType")
  @js.native
  val resultType: typingsSlinky.vscodeJsonrpc.mod.ProgressType[js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.DocumentLink]] = js.native
  
  @JSImport("vscode-languageclient/lib/client", "DocumentLinkRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    DocumentLinkParams, 
    js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.DocumentLink] | Null, 
    js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.DocumentLink], 
    Unit, 
    DocumentLinkRegistrationOptions
  ] = js.native
}
