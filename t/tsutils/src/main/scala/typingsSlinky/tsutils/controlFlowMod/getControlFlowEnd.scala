package typingsSlinky.tsutils.controlFlowMod

import typingsSlinky.typescript.mod.BlockLike
import typingsSlinky.typescript.mod.Statement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tsutils/util/control-flow", "getControlFlowEnd")
@js.native
object getControlFlowEnd extends js.Object {
  def apply(statement: BlockLike): ControlFlowEnd = js.native
  def apply(statement: Statement): ControlFlowEnd = js.native
}

