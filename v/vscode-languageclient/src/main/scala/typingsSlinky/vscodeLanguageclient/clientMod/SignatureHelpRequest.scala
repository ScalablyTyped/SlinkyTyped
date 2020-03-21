package typingsSlinky.vscodeLanguageclient.clientMod

import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.SignatureHelpRegistrationOptions
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.TextDocumentPositionParams
import typingsSlinky.vscodeLanguageserverTypes.mod.SignatureHelp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "SignatureHelpRequest")
@js.native
object SignatureHelpRequest extends js.Object {
  val `type`: typingsSlinky.vscodeJsonrpc.mod.RequestType[
    TextDocumentPositionParams, 
    SignatureHelp | Null, 
    Unit, 
    SignatureHelpRegistrationOptions
  ] = js.native
}

