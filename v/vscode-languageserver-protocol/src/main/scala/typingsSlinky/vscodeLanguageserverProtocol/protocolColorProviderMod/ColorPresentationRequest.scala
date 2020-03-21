package typingsSlinky.vscodeLanguageserverProtocol.protocolColorProviderMod

import typingsSlinky.vscodeJsonrpc.mod.RequestType
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
import typingsSlinky.vscodeLanguageserverTypes.mod.ColorPresentation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol/lib/protocol.colorProvider", "ColorPresentationRequest")
@js.native
object ColorPresentationRequest extends js.Object {
  val `type`: RequestType[
    ColorPresentationParams, 
    js.Array[ColorPresentation], 
    Unit, 
    TextDocumentRegistrationOptions
  ] = js.native
}

