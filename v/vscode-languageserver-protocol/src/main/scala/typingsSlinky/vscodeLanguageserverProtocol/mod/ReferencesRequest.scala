package typingsSlinky.vscodeLanguageserverProtocol.mod

import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.ReferenceParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol", "ReferencesRequest")
@js.native
object ReferencesRequest extends js.Object {
  val `type`: typingsSlinky.vscodeJsonrpc.mod.RequestType[
    ReferenceParams, 
    js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.Location] | Null, 
    Unit, 
    TextDocumentRegistrationOptions
  ] = js.native
}

