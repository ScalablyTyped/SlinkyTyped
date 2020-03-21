package typingsSlinky.vscodeLanguageclient.mod

import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.TextDocumentPositionParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient", "HoverRequest")
@js.native
object HoverRequest extends js.Object {
  val `type`: typingsSlinky.vscodeJsonrpc.mod.RequestType[
    TextDocumentPositionParams, 
    typingsSlinky.vscodeLanguageserverTypes.mod.Hover | Null, 
    Unit, 
    TextDocumentRegistrationOptions
  ] = js.native
}

