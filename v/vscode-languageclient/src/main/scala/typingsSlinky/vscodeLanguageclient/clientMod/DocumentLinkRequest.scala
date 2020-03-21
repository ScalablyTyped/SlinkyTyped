package typingsSlinky.vscodeLanguageclient.clientMod

import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.DocumentLinkParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.DocumentLinkRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "DocumentLinkRequest")
@js.native
object DocumentLinkRequest extends js.Object {
  val `type`: typingsSlinky.vscodeJsonrpc.mod.RequestType[
    DocumentLinkParams, 
    js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.DocumentLink] | Null, 
    Unit, 
    DocumentLinkRegistrationOptions
  ] = js.native
}

