package typingsSlinky.vscodeLanguageclient.clientMod

import typingsSlinky.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashreferences
import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.ReferenceParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.ReferenceRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReferencesRequest {
  
  @JSImport("vscode-languageclient/lib/client", "ReferencesRequest.method")
  @js.native
  val method: textDocumentSlashreferences = js.native
  
  /** @deprecated Use ReferencesRequest.type */
  @JSImport("vscode-languageclient/lib/client", "ReferencesRequest.resultType")
  @js.native
  val resultType: typingsSlinky.vscodeJsonrpc.mod.ProgressType[js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.Location]] = js.native
  
  @JSImport("vscode-languageclient/lib/client", "ReferencesRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    ReferenceParams, 
    js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.Location] | Null, 
    js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.Location], 
    Unit, 
    ReferenceRegistrationOptions
  ] = js.native
}
