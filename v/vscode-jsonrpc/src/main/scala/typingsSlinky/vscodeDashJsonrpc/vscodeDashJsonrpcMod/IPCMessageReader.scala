package typingsSlinky.vscodeDashJsonrpc.vscodeDashJsonrpcMod

import typingsSlinky.node.NodeJS.Process
import typingsSlinky.node.childUnderscoreProcessMod.ChildProcess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-jsonrpc", "IPCMessageReader")
@js.native
class IPCMessageReader protected ()
  extends typingsSlinky.vscodeDashJsonrpc.libMessageReaderMod.IPCMessageReader {
  def this(process: Process) = this()
  def this(process: ChildProcess) = this()
}

