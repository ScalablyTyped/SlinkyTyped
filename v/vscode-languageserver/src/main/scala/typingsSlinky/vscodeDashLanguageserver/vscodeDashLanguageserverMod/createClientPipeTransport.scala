package typingsSlinky.vscodeDashLanguageserver.vscodeDashLanguageserverMod

import typingsSlinky.vscodeDashJsonrpc.Thenable
import typingsSlinky.vscodeDashJsonrpc.libPipeSupportMod.PipeTransport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver", "createClientPipeTransport")
@js.native
object createClientPipeTransport extends js.Object {
  def apply(pipeName: String): Thenable[PipeTransport] = js.native
  def apply(pipeName: String, encoding: String): Thenable[PipeTransport] = js.native
}

