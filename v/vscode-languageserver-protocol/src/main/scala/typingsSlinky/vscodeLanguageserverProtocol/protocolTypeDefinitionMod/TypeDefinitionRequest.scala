package typingsSlinky.vscodeLanguageserverProtocol.protocolTypeDefinitionMod

import typingsSlinky.vscodeJsonrpc.mod.ProgressType
import typingsSlinky.vscodeJsonrpc.mod.RequestHandler
import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashtypeDefinition
import typingsSlinky.vscodeLanguageserverTypes.mod.Definition
import typingsSlinky.vscodeLanguageserverTypes.mod.DefinitionLink
import typingsSlinky.vscodeLanguageserverTypes.mod.Location
import typingsSlinky.vscodeLanguageserverTypes.mod.LocationLink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver-protocol/lib/protocol.typeDefinition", "TypeDefinitionRequest")
@js.native
object TypeDefinitionRequest extends js.Object {
  
  val method: textDocumentSlashtypeDefinition = js.native
  
  /** @deprecated Use TypeDefinitionRequest.type */
  val resultType: ProgressType[js.Array[Location | LocationLink]] = js.native
  
  val `type`: ProtocolRequestType[
    TypeDefinitionParams, 
    Location | (js.Array[Location | LocationLink]) | Null, 
    js.Array[Location | LocationLink], 
    Unit, 
    TypeDefinitionRegistrationOptions
  ] = js.native
  
  type HandlerSignature = RequestHandler[TypeDefinitionParams, Definition | js.Array[DefinitionLink] | Null, Unit]
}
