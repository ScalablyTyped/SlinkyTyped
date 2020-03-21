package typingsSlinky.vscodeLanguageclient.clientMod

import typingsSlinky.vscodeJsonrpc.Thenable
import typingsSlinky.vscodeJsonrpc.pipeSupportMod.PipeTransport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "createClientPipeTransport")
@js.native
object createClientPipeTransport extends js.Object {
  def apply(pipeName: String): Thenable[PipeTransport] = js.native
  def apply(pipeName: String, encoding: String): Thenable[PipeTransport] = js.native
}

