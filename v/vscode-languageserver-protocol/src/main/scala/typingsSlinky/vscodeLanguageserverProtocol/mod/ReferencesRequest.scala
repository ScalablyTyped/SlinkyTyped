package typingsSlinky.vscodeLanguageserverProtocol.mod

import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.ReferenceParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.ReferenceRegistrationOptions
import typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashreferences
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver-protocol", "ReferencesRequest")
@js.native
object ReferencesRequest extends js.Object {
  
  val method: textDocumentSlashreferences = js.native
  
  /** @deprecated Use ReferencesRequest.type */
  val resultType: typingsSlinky.vscodeJsonrpc.mod.ProgressType[js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.Location]] = js.native
  
  val `type`: ProtocolRequestType[
    ReferenceParams, 
    js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.Location] | Null, 
    js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.Location], 
    Unit, 
    ReferenceRegistrationOptions
  ] = js.native
}
