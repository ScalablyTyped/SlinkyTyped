package typingsSlinky.vscodeLanguageserverProtocol.protocolMod

import typingsSlinky.vscodeJsonrpc.mod.RequestType
import typingsSlinky.vscodeLanguageserverProtocol.AnonPlaceholder
import typingsSlinky.vscodeLanguageserverTypes.mod.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol/lib/protocol", "PrepareRenameRequest")
@js.native
object PrepareRenameRequest extends js.Object {
  val `type`: RequestType[TextDocumentPositionParams, Range | AnonPlaceholder | Null, Unit, Unit] = js.native
}

