package typingsSlinky.vscodeLanguageserverProtocol.protocolMod

import typingsSlinky.vscodeJsonrpc.mod.ProgressType
import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typingsSlinky.vscodeLanguageserverProtocol.protocolImplementationMod.ImplementationParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolImplementationMod.ImplementationRegistrationOptions
import typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashimplementation
import typingsSlinky.vscodeLanguageserverTypes.mod.Location
import typingsSlinky.vscodeLanguageserverTypes.mod.LocationLink
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ImplementationRequest {
  
  @JSImport("vscode-languageserver-protocol/lib/protocol", "ImplementationRequest.method")
  @js.native
  val method: textDocumentSlashimplementation = js.native
  
  /** @deprecated Use ImplementationRequest.type */
  @JSImport("vscode-languageserver-protocol/lib/protocol", "ImplementationRequest.resultType")
  @js.native
  val resultType: ProgressType[js.Array[Location | LocationLink]] = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/protocol", "ImplementationRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    ImplementationParams, 
    Location | (js.Array[Location | LocationLink]) | Null, 
    js.Array[Location | LocationLink], 
    Unit, 
    ImplementationRegistrationOptions
  ] = js.native
}
