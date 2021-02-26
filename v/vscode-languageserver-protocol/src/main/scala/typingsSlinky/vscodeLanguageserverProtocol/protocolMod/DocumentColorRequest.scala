package typingsSlinky.vscodeLanguageserverProtocol.protocolMod

import typingsSlinky.vscodeJsonrpc.mod.ProgressType
import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typingsSlinky.vscodeLanguageserverProtocol.protocolColorProviderMod.DocumentColorParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolColorProviderMod.DocumentColorRegistrationOptions
import typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashdocumentColor
import typingsSlinky.vscodeLanguageserverTypes.mod.ColorInformation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DocumentColorRequest {
  
  @JSImport("vscode-languageserver-protocol/lib/protocol", "DocumentColorRequest.method")
  @js.native
  val method: textDocumentSlashdocumentColor = js.native
  
  /** @deprecated Use DocumentColorRequest.type */
  @JSImport("vscode-languageserver-protocol/lib/protocol", "DocumentColorRequest.resultType")
  @js.native
  val resultType: ProgressType[js.Array[ColorInformation]] = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/protocol", "DocumentColorRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    DocumentColorParams, 
    js.Array[ColorInformation], 
    js.Array[ColorInformation], 
    Unit, 
    DocumentColorRegistrationOptions
  ] = js.native
}
