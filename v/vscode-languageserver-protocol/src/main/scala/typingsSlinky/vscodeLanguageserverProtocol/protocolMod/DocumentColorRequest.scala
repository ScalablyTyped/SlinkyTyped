package typingsSlinky.vscodeLanguageserverProtocol.protocolMod

import typingsSlinky.vscodeJsonrpc.mod.RequestType
import typingsSlinky.vscodeLanguageserverProtocol.protocolColorProviderMod.DocumentColorParams
import typingsSlinky.vscodeLanguageserverTypes.mod.ColorInformation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol/lib/protocol", "DocumentColorRequest")
@js.native
object DocumentColorRequest extends js.Object {
  val `type`: RequestType[DocumentColorParams, js.Array[ColorInformation], Unit, TextDocumentRegistrationOptions] = js.native
}

