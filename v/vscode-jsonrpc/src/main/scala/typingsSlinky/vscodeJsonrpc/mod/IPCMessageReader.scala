package typingsSlinky.vscodeJsonrpc.mod

import typingsSlinky.node.childProcessMod.ChildProcess
import typingsSlinky.node.processMod.global.NodeJS.Process
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-jsonrpc", "IPCMessageReader")
@js.native
class IPCMessageReader protected ()
  extends typingsSlinky.vscodeJsonrpc.messageReaderMod.IPCMessageReader {
  def this(process: ChildProcess) = this()
  def this(process: Process) = this()
}
