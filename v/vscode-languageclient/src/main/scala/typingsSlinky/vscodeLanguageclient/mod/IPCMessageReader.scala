package typingsSlinky.vscodeLanguageclient.mod

import typingsSlinky.node.childProcessMod.ChildProcess
import typingsSlinky.node.processMod.global.NodeJS.Process
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient", "IPCMessageReader")
@js.native
class IPCMessageReader protected ()
  extends typingsSlinky.vscodeLanguageclient.clientMod.IPCMessageReader {
  def this(process: ChildProcess) = this()
  def this(process: Process) = this()
}

