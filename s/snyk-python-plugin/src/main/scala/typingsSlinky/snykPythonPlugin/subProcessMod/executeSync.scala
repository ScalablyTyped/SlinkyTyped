package typingsSlinky.snykPythonPlugin.subProcessMod

import typingsSlinky.node.Buffer
import typingsSlinky.node.childProcessMod.SpawnOptions
import typingsSlinky.node.childProcessMod.SpawnSyncReturns
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snyk-python-plugin/dist/dependencies/sub-process", "executeSync")
@js.native
object executeSync extends js.Object {
  def apply(command: String, args: js.Array[String]): SpawnSyncReturns[Buffer] = js.native
  def apply(command: String, args: js.Array[String], options: SpawnOptions): SpawnSyncReturns[Buffer] = js.native
}

