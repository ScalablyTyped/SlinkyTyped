package typingsSlinky.vscodeLanguageserverProtocol.protocolColorProviderMod

import typingsSlinky.vscodeJsonrpc.mod.RequestType
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
import typingsSlinky.vscodeLanguageserverTypes.mod.ColorInformation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol/lib/protocol.colorProvider", "DocumentColorRequest")
@js.native
object DocumentColorRequest extends js.Object {
  val `type`: RequestType[DocumentColorParams, js.Array[ColorInformation], Unit, TextDocumentRegistrationOptions] = js.native
}

