package typingsSlinky.vscodeLanguageserverProtocol.protocolProgressMod

import typingsSlinky.vscodeJsonrpc.mod.RequestHandler
import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol/lib/protocol.progress", "WorkDoneProgressCreateRequest")
@js.native
object WorkDoneProgressCreateRequest extends js.Object {
  val `type`: ProtocolRequestType[WorkDoneProgressCreateParams, Unit, scala.Nothing, Unit, Unit] = js.native
  type HandlerSignature = RequestHandler[WorkDoneProgressCreateParams, Unit, Unit]
}

