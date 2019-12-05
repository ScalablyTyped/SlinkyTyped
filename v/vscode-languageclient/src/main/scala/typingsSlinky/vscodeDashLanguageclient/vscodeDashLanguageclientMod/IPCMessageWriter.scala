package typingsSlinky.vscodeDashLanguageclient.vscodeDashLanguageclientMod

import typingsSlinky.node.NodeJS.Process
import typingsSlinky.node.childUnderscoreProcessMod.ChildProcess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient", "IPCMessageWriter")
@js.native
class IPCMessageWriter protected ()
  extends typingsSlinky.vscodeDashLanguageclient.libClientMod.IPCMessageWriter {
  def this(process: Process) = this()
  def this(process: ChildProcess) = this()
}

