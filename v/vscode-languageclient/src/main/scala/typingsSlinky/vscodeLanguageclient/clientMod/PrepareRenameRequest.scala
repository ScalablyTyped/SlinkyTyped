package typingsSlinky.vscodeLanguageclient.clientMod

import typingsSlinky.vscodeLanguageserverProtocol.AnonPlaceholder
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.TextDocumentPositionParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "PrepareRenameRequest")
@js.native
object PrepareRenameRequest extends js.Object {
  val `type`: typingsSlinky.vscodeJsonrpc.mod.RequestType[
    TextDocumentPositionParams, 
    typingsSlinky.vscodeLanguageserverTypes.mod.Range | AnonPlaceholder | Null, 
    Unit, 
    Unit
  ] = js.native
}

