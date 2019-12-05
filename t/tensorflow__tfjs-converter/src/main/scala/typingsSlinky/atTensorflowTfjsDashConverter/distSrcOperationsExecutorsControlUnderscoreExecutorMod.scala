package typingsSlinky.atTensorflowTfjsDashConverter

import typingsSlinky.atTensorflowTfjsDashConverter.atTensorflowTfjsDashConverterStrings.control
import typingsSlinky.atTensorflowTfjsDashConverter.distSrcDataTypesMod.NamedTensorsMap
import typingsSlinky.atTensorflowTfjsDashConverter.distSrcExecutorExecutionUnderscoreContextMod.ExecutionContext
import typingsSlinky.atTensorflowTfjsDashConverter.distSrcOperationsTypesMod.Node
import typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.Tensor
import typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.Rank
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-converter/dist/src/operations/executors/control_executor", JSImport.Namespace)
@js.native
object distSrcOperationsExecutorsControlUnderscoreExecutorMod extends js.Object {
  val CATEGORY: control = js.native
  def executeOp(node: Node, tensorMap: NamedTensorsMap, context: ExecutionContext): js.Promise[js.Array[Tensor[Rank]]] = js.native
}

