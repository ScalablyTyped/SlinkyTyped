package typingsSlinky.vscodeLanguageserver.mod

import typingsSlinky.node.NodeJS.Process
import typingsSlinky.node.childProcessMod.ChildProcess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver", "IPCMessageWriter")
@js.native
class IPCMessageWriter protected ()
  extends typingsSlinky.vscodeLanguageserverProtocol.mod.IPCMessageWriter {
  def this(process: Process) = this()
  def this(process: ChildProcess) = this()
}

