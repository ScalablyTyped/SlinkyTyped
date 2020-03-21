package typingsSlinky.vscodeLanguageclient.clientMod

import typingsSlinky.node.NodeJS.Process
import typingsSlinky.node.childProcessMod.ChildProcess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "IPCMessageReader")
@js.native
class IPCMessageReader protected ()
  extends typingsSlinky.vscodeLanguageserverProtocol.mod.IPCMessageReader {
  def this(process: Process) = this()
  def this(process: ChildProcess) = this()
}

