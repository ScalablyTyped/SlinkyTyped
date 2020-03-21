package typingsSlinky.tensorflowTfjs.mod

import typingsSlinky.tensorflowTfjsConverter.operationsTypesMod.OpExecutor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "registerOp")
@js.native
object registerOp extends js.Object {
  def apply(name: String, opFunc: OpExecutor): Unit = js.native
}

