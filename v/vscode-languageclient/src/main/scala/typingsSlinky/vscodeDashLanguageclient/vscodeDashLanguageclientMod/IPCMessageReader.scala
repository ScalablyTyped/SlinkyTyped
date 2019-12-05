package typingsSlinky.vscodeDashLanguageclient.vscodeDashLanguageclientMod

import typingsSlinky.node.NodeJS.Process
import typingsSlinky.node.childUnderscoreProcessMod.ChildProcess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient", "IPCMessageReader")
@js.native
class IPCMessageReader protected ()
  extends typingsSlinky.vscodeDashLanguageclient.libClientMod.IPCMessageReader {
  def this(process: Process) = this()
  def this(process: ChildProcess) = this()
}

