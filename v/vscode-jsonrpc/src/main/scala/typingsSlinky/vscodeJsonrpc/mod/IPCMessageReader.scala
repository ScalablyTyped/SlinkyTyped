package typingsSlinky.vscodeJsonrpc.mod

import typingsSlinky.node.NodeJS.Process
import typingsSlinky.node.childProcessMod.ChildProcess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-jsonrpc", "IPCMessageReader")
@js.native
class IPCMessageReader protected ()
  extends typingsSlinky.vscodeJsonrpc.messageReaderMod.IPCMessageReader {
  def this(process: Process) = this()
  def this(process: ChildProcess) = this()
}

