package typingsSlinky.vscodeLanguageclient.clientMod

import typingsSlinky.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashdocumentColor
import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typingsSlinky.vscodeLanguageserverProtocol.protocolColorProviderMod.DocumentColorParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolColorProviderMod.DocumentColorRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DocumentColorRequest {
  
  @JSImport("vscode-languageclient/lib/client", "DocumentColorRequest.method")
  @js.native
  val method: textDocumentSlashdocumentColor = js.native
  
  /** @deprecated Use DocumentColorRequest.type */
  @JSImport("vscode-languageclient/lib/client", "DocumentColorRequest.resultType")
  @js.native
  val resultType: typingsSlinky.vscodeJsonrpc.mod.ProgressType[js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.ColorInformation]] = js.native
  
  @JSImport("vscode-languageclient/lib/client", "DocumentColorRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    DocumentColorParams, 
    js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.ColorInformation], 
    js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.ColorInformation], 
    Unit, 
    DocumentColorRegistrationOptions
  ] = js.native
}
