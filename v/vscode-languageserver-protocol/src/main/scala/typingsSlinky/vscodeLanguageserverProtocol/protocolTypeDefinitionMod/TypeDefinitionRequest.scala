package typingsSlinky.vscodeLanguageserverProtocol.protocolTypeDefinitionMod

import typingsSlinky.vscodeJsonrpc.mod.RequestHandler
import typingsSlinky.vscodeJsonrpc.mod.RequestType
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.TextDocumentPositionParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
import typingsSlinky.vscodeLanguageserverTypes.mod.Definition
import typingsSlinky.vscodeLanguageserverTypes.mod.DefinitionLink
import typingsSlinky.vscodeLanguageserverTypes.mod.Location
import typingsSlinky.vscodeLanguageserverTypes.mod.LocationLink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol/lib/protocol.typeDefinition", "TypeDefinitionRequest")
@js.native
object TypeDefinitionRequest extends js.Object {
  val `type`: RequestType[
    TextDocumentPositionParams, 
    Location | (js.Array[Location | LocationLink]) | Null, 
    Unit, 
    TextDocumentRegistrationOptions
  ] = js.native
  type HandlerSignature = RequestHandler[TextDocumentPositionParams, Definition | js.Array[DefinitionLink] | Null, Unit]
}

