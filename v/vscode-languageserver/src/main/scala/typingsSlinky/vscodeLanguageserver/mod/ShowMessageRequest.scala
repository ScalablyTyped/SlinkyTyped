package typingsSlinky.vscodeLanguageserver.mod

import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.MessageActionItem
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.ShowMessageRequestParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver", "ShowMessageRequest")
@js.native
object ShowMessageRequest extends js.Object {
  val `type`: typingsSlinky.vscodeJsonrpc.mod.RequestType[ShowMessageRequestParams, MessageActionItem | Null, Unit, Unit] = js.native
}

