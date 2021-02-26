package typingsSlinky.vscodeLanguageserverProtocol.mod

import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.DocumentLinkParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.DocumentLinkRegistrationOptions
import typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashdocumentLink
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DocumentLinkRequest {
  
  @JSImport("vscode-languageserver-protocol", "DocumentLinkRequest.method")
  @js.native
  val method: textDocumentSlashdocumentLink = js.native
  
  /** @deprecated Use DocumentLinkRequest.type */
  @JSImport("vscode-languageserver-protocol", "DocumentLinkRequest.resultType")
  @js.native
  val resultType: typingsSlinky.vscodeJsonrpc.mod.ProgressType[js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.DocumentLink]] = js.native
  
  @JSImport("vscode-languageserver-protocol", "DocumentLinkRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    DocumentLinkParams, 
    js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.DocumentLink] | Null, 
    js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.DocumentLink], 
    Unit, 
    DocumentLinkRegistrationOptions
  ] = js.native
}
