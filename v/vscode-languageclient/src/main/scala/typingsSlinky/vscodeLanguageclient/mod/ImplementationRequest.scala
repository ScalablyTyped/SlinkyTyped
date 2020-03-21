package typingsSlinky.vscodeLanguageclient.mod

import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.TextDocumentPositionParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient", "ImplementationRequest")
@js.native
object ImplementationRequest extends js.Object {
  val `type`: typingsSlinky.vscodeJsonrpc.mod.RequestType[
    TextDocumentPositionParams, 
    typingsSlinky.vscodeLanguageserverTypes.mod.Location | (js.Array[
      typingsSlinky.vscodeLanguageserverTypes.mod.Location | typingsSlinky.vscodeLanguageserverTypes.mod.LocationLink
    ]) | Null, 
    Unit, 
    TextDocumentRegistrationOptions
  ] = js.native
}

