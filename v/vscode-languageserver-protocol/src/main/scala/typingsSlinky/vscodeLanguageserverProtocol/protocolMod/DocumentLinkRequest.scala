package typingsSlinky.vscodeLanguageserverProtocol.protocolMod

import typingsSlinky.vscodeJsonrpc.mod.RequestType
import typingsSlinky.vscodeLanguageserverTypes.mod.DocumentLink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol/lib/protocol", "DocumentLinkRequest")
@js.native
object DocumentLinkRequest extends js.Object {
  val `type`: RequestType[
    DocumentLinkParams, 
    js.Array[DocumentLink] | Null, 
    Unit, 
    DocumentLinkRegistrationOptions
  ] = js.native
}

