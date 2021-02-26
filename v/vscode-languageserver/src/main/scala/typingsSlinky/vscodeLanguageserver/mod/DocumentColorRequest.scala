package typingsSlinky.vscodeLanguageserver.mod

import typingsSlinky.vscodeLanguageserver.vscodeLanguageserverStrings.textDocumentSlashdocumentColor
import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typingsSlinky.vscodeLanguageserverProtocol.protocolColorProviderMod.DocumentColorParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolColorProviderMod.DocumentColorRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DocumentColorRequest {
  
  @JSImport("vscode-languageserver", "DocumentColorRequest.method")
  @js.native
  val method: textDocumentSlashdocumentColor = js.native
  
  /** @deprecated Use DocumentColorRequest.type */
  @JSImport("vscode-languageserver", "DocumentColorRequest.resultType")
  @js.native
  val resultType: typingsSlinky.vscodeJsonrpc.mod.ProgressType[js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.ColorInformation]] = js.native
  
  @JSImport("vscode-languageserver", "DocumentColorRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    DocumentColorParams, 
    js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.ColorInformation], 
    js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.ColorInformation], 
    Unit, 
    DocumentColorRegistrationOptions
  ] = js.native
}
