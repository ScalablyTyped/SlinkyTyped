package typingsSlinky.vscodeLanguageserverProtocol.mod

import typingsSlinky.node.NodeJS.Process
import typingsSlinky.node.childProcessMod.ChildProcess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol", "IPCMessageWriter")
@js.native
class IPCMessageWriter protected ()
  extends typingsSlinky.vscodeJsonrpc.mod.IPCMessageWriter {
  def this(process: Process) = this()
  def this(process: ChildProcess) = this()
}

