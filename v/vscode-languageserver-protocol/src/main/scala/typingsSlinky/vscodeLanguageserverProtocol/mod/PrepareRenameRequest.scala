package typingsSlinky.vscodeLanguageserverProtocol.mod

import typingsSlinky.vscodeLanguageserverProtocol.anon.Placeholder
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.TextDocumentPositionParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol", "PrepareRenameRequest")
@js.native
object PrepareRenameRequest extends js.Object {
  val `type`: typingsSlinky.vscodeJsonrpc.mod.RequestType[
    TextDocumentPositionParams, 
    typingsSlinky.vscodeLanguageserverTypes.mod.Range | Placeholder | Null, 
    Unit, 
    Unit
  ] = js.native
}

