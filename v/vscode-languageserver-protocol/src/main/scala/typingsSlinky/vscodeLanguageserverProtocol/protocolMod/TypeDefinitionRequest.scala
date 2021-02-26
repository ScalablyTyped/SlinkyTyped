package typingsSlinky.vscodeLanguageserverProtocol.protocolMod

import typingsSlinky.vscodeJsonrpc.mod.ProgressType
import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typingsSlinky.vscodeLanguageserverProtocol.protocolTypeDefinitionMod.TypeDefinitionParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolTypeDefinitionMod.TypeDefinitionRegistrationOptions
import typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashtypeDefinition
import typingsSlinky.vscodeLanguageserverTypes.mod.Location
import typingsSlinky.vscodeLanguageserverTypes.mod.LocationLink
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TypeDefinitionRequest {
  
  @JSImport("vscode-languageserver-protocol/lib/protocol", "TypeDefinitionRequest.method")
  @js.native
  val method: textDocumentSlashtypeDefinition = js.native
  
  /** @deprecated Use TypeDefinitionRequest.type */
  @JSImport("vscode-languageserver-protocol/lib/protocol", "TypeDefinitionRequest.resultType")
  @js.native
  val resultType: ProgressType[js.Array[Location | LocationLink]] = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/protocol", "TypeDefinitionRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    TypeDefinitionParams, 
    Location | (js.Array[Location | LocationLink]) | Null, 
    js.Array[Location | LocationLink], 
    Unit, 
    TypeDefinitionRegistrationOptions
  ] = js.native
}
