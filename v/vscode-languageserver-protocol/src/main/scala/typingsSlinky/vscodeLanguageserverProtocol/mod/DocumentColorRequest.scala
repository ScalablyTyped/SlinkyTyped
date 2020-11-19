package typingsSlinky.vscodeLanguageserverProtocol.mod

import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typingsSlinky.vscodeLanguageserverProtocol.protocolColorProviderMod.DocumentColorParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolColorProviderMod.DocumentColorRegistrationOptions
import typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashdocumentColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver-protocol", "DocumentColorRequest")
@js.native
object DocumentColorRequest extends js.Object {
  
  val method: textDocumentSlashdocumentColor = js.native
  
  /** @deprecated Use DocumentColorRequest.type */
  val resultType: typingsSlinky.vscodeJsonrpc.mod.ProgressType[js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.ColorInformation]] = js.native
  
  val `type`: ProtocolRequestType[
    DocumentColorParams, 
    js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.ColorInformation], 
    js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.ColorInformation], 
    Unit, 
    DocumentColorRegistrationOptions
  ] = js.native
}
