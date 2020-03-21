package typingsSlinky.vscodeLanguageserver.mod

import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.ExecuteCommandParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.ExecuteCommandRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver", "ExecuteCommandRequest")
@js.native
object ExecuteCommandRequest extends js.Object {
  val `type`: typingsSlinky.vscodeJsonrpc.mod.RequestType[ExecuteCommandParams, js.Any, Unit, ExecuteCommandRegistrationOptions] = js.native
}

