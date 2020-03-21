package typingsSlinky.tensorflowTfjsConverter

import typingsSlinky.tensorflowTfjsConverter.executionContextMod.ExecutionContext
import typingsSlinky.tensorflowTfjsConverter.operationsTypesMod.Node
import typingsSlinky.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.dynamic
import typingsSlinky.tensorflowTfjsConverter.typesMod.NamedTensorsMap
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.mod.Tensor_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-converter/dist/src/operations/executors/dynamic_executor", JSImport.Namespace)
@js.native
object dynamicExecutorMod extends js.Object {
  val CATEGORY: dynamic = js.native
  def executeOp(node: Node, tensorMap: NamedTensorsMap, context: ExecutionContext): js.Promise[js.Array[Tensor_[Rank]]] = js.native
}

