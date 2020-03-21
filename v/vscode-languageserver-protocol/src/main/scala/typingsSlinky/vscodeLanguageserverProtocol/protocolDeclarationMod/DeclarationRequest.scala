package typingsSlinky.vscodeLanguageserverProtocol.protocolDeclarationMod

import typingsSlinky.vscodeJsonrpc.mod.RequestHandler
import typingsSlinky.vscodeJsonrpc.mod.RequestType
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.TextDocumentPositionParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
import typingsSlinky.vscodeLanguageserverTypes.mod.Declaration
import typingsSlinky.vscodeLanguageserverTypes.mod.DeclarationLink
import typingsSlinky.vscodeLanguageserverTypes.mod.Location
import typingsSlinky.vscodeLanguageserverTypes.mod.LocationLink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol/lib/protocol.declaration", "DeclarationRequest")
@js.native
object DeclarationRequest extends js.Object {
  val `type`: RequestType[
    TextDocumentPositionParams, 
    Location | (js.Array[Location | LocationLink]) | Null, 
    Unit, 
    TextDocumentRegistrationOptions
  ] = js.native
  type HandlerSignature = RequestHandler[TextDocumentPositionParams, Declaration | js.Array[DeclarationLink] | Null, Unit]
}

