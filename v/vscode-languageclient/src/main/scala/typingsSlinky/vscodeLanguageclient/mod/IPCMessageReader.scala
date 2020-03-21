package typingsSlinky.vscodeLanguageclient.mod

import typingsSlinky.node.NodeJS.Process
import typingsSlinky.node.childProcessMod.ChildProcess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient", "IPCMessageReader")
@js.native
class IPCMessageReader protected ()
  extends typingsSlinky.vscodeLanguageclient.clientMod.IPCMessageReader {
  def this(process: Process) = this()
  def this(process: ChildProcess) = this()
}

