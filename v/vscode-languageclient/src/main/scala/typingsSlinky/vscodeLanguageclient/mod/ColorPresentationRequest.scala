package typingsSlinky.vscodeLanguageclient.mod

import typingsSlinky.vscodeLanguageserverProtocol.protocolColorProviderMod.ColorPresentationParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient", "ColorPresentationRequest")
@js.native
object ColorPresentationRequest extends js.Object {
  val `type`: typingsSlinky.vscodeJsonrpc.mod.RequestType[
    ColorPresentationParams, 
    js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.ColorPresentation], 
    Unit, 
    TextDocumentRegistrationOptions
  ] = js.native
}

