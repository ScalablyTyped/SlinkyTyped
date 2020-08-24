package typingsSlinky.vscodeLanguageserverProtocol.mod

import typingsSlinky.node.childProcessMod.ChildProcess
import typingsSlinky.node.processMod.global.NodeJS.Process
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol", "IPCMessageReader")
@js.native
class IPCMessageReader protected ()
  extends typingsSlinky.vscodeJsonrpc.mod.IPCMessageReader {
  def this(process: ChildProcess) = this()
  def this(process: Process) = this()
}

