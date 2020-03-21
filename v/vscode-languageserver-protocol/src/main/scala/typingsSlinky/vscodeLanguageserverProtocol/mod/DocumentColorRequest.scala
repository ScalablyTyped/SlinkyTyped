package typingsSlinky.vscodeLanguageserverProtocol.mod

import typingsSlinky.vscodeLanguageserverProtocol.protocolColorProviderMod.DocumentColorParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol", "DocumentColorRequest")
@js.native
object DocumentColorRequest extends js.Object {
  val `type`: typingsSlinky.vscodeJsonrpc.mod.RequestType[
    DocumentColorParams, 
    js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.ColorInformation], 
    Unit, 
    TextDocumentRegistrationOptions
  ] = js.native
}

