package typingsSlinky.vscodeLanguageclient.mod

import typingsSlinky.node.NodeJS.Process
import typingsSlinky.node.childProcessMod.ChildProcess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient", "IPCMessageWriter")
@js.native
class IPCMessageWriter protected ()
  extends typingsSlinky.vscodeLanguageclient.clientMod.IPCMessageWriter {
  def this(process: Process) = this()
  def this(process: ChildProcess) = this()
}

